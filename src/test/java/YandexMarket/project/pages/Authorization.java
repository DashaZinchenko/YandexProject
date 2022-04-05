package YandexMarket.project.pages;

import YandexMarket.Creds;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Authorization  extends Creds{
    private WebDriverWait wait;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private WebDriver driver;

    public Authorization(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By loginIn = By.xpath("//*[@id=\"passp-field-login\"]");
    public void loginInput(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.findElement(loginIn).sendKeys(config.getLogin());
    }
    private By loginClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void loginClickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginClick));
        driver.findElement(loginClick).click();
    }
    private By passwordIn = By.xpath("//*[@id=\"passp-field-passwd\"]");
    public void passwordInput(){
        // driver.findElement(passwordIn).sendKeys("mailtest123");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        // wait.until(ExpectedConditions.textToBePresentInElementValue(passwordIn,config.getPassword()));
        driver.findElement(passwordIn).sendKeys(config.getPassword());
    }
    private By passwordClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void passwordClickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(passwordClick));
        driver.findElement(passwordClick).click();
    }
}
