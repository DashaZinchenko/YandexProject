package YandexMarket.project.test;


import YandexMarket.framework.Browser;
import YandexMarket.project.pages.Authorization;
import YandexMarket.project.pages.Catalog;
import YandexMarket.project.pages.WelcomPages;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = Browser.getDriver();
        driver.get(config.getApplicationUrl());

        WelcomPages welcomPages = new WelcomPages(driver);
        welcomPages.clickSignIn();
        Authorization authorization = new Authorization(driver);
        authorization.loginInput();
        authorization.loginClickButton();
        authorization.passwordInput();
        authorization.passwordClickButton();
        Catalog catalog = new Catalog(driver);
        catalog.catalogClickButton();
        catalog.catalogCountprint();
        catalog.sectionRandom();
        catalog.catalogPrint();
    }
}
