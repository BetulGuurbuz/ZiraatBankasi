package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.ElementHelper;

public class MevduatPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;

    By mevduatGetirisi = By.cssSelector("div[id='landingNav'] div:nth-child(1) div:nth-child(1) h2:nth-child(1) a:nth-child(1)");
    By vadeSuresi = By.cssSelector("#deposit-calc-vade");
    By vadeTutari = By.cssSelector("#tutar");
    By vadeHesaplamaButton = By.cssSelector(".btn.btn-red.btn-save");

public MevduatPage(WebDriver driver) {
    MevduatPage.driver = driver;
    this.elementHelper = new ElementHelper(driver);
}

    public void mevduatGetirisiLink() {
    driver.findElement(mevduatGetirisi).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");

    }

    public void dovizCinsi() throws InterruptedException {
    Select select = new Select(driver.findElement(By.xpath("//*[contains(@id, 'dovizCinsi')]")));
    select.selectByVisibleText("TL");
    Thread.sleep(1000);

    }

    public void vadeSuresi() throws InterruptedException {
    driver.findElement(vadeSuresi).clear();
    driver.findElement(vadeSuresi).sendKeys("32");
    Thread.sleep(1000);

    }

    public void vadeTutari() throws InterruptedException {
    driver.findElement(vadeTutari).clear();
    driver.findElement(vadeTutari).sendKeys("100000");
    Thread.sleep(1000);
    }

    public void vadeHesaplamaButton() {
    driver.findElement(vadeHesaplamaButton).click();
    }

    public void vadeHesaplamaSonucu() {
    int vadeTutar = 100000;
    int vadeFaiz = 40;
    int vadeSonuTutar;

        vadeSonuTutar = (vadeTutar/100)*(vadeFaiz/12);

        System.out.println("Vade sonu tutari  :" + vadeSonuTutar);          //Hesaplama gerçeği yansıtmamaktadır.
        System.out.println("Vade faizi        :" + vadeFaiz);               //Hesaplama gerçeği yansıtmamaktadır.
    }
}