package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.ElementHelper;

public class SubeAramaPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    By subeCheckbox = By.cssSelector("span[class='active']");
    By araButton = By.cssSelector(".btn.btn-red.map-search-btn");
    public SubeAramaPage(WebDriver driver) {
        SubeAramaPage.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }
    public void sayfaKaydir() throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,750)", " ");
        Thread.sleep(200);
    }
    public void subeCheckbox() {
        driver.findElement(subeCheckbox).click();

    }

    public void sehirCombobox() throws InterruptedException {

        Select select = new Select(driver.findElement(By.xpath("//*[contains(@id, 'ddlCity')]")));
        select.selectByVisibleText("Ankara");
        Thread.sleep(1000);

    }

    public void ilceCombobox() throws InterruptedException {
        Select select = new Select(driver.findElement(By.xpath("//*[contains(@name, 'ddlTown')]")));
        select.selectByVisibleText("Gölbaşı");
        Thread.sleep(1000);
    }

    public void araButton() throws InterruptedException {
        driver.findElement(araButton).click();
        Thread.sleep(1000);
    }
}
