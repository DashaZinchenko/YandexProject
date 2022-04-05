package YandexMarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Catalog {
    private WebDriverWait wait;
    private int count;
    private WebDriver driver;

    public Catalog(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By catalogClick = By.xpath("//*[@id=\"catalogPopupButton\"]");

    public void catalogClickButton() {
        wait.until(ExpectedConditions.elementToBeClickable(catalogClick));
        driver.findElement(catalogClick).click();
    }

    private By catalog = By.xpath("//*[@id=\"catalogPopup\"]/div/div/div/div/div/div/div[1]/div/ul/li");

    public void catalogCountprint() {
        count = driver.findElements(catalog).size();
        System.out.println(count);
    }

    public void sectionRandom() {
        List<WebElement> catalogAll = driver.findElements(catalog);
        Random random = new Random();
        int numberOfSection = random.nextInt(catalogAll.size());
        wait.until(ExpectedConditions.elementToBeClickable(catalog));
        catalogAll.get(numberOfSection).click();
    }

    private By catalogCount = By.xpath("//*[@id=\"header-search\"]");
    public void catalogPrint(){
        driver.findElement(catalogCount).sendKeys("Количество разделов на сайте: "+count);
    }
}
