package YandexMarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WelcomPages {
    private WebDriver driver;
    private WebDriverWait wait;

    public WelcomPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By signIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a");

    public void clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        driver.findElement(signIn).click();
    }

}
