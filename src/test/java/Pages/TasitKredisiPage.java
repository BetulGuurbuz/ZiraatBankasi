package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.ElementHelper;

public class TasitKredisiPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    By kabulCookie = By.cssSelector("body > div.cookie-box.noindex > a");
    By hesaplama = By.xpath("//ul[@class='link-list']//a[contains(text(),'Hesaplama Araçları')]");
    By tasitKredisi = By.xpath("//ul[@class='link-col-1 clearfix']//a[contains(text(),'Taşıt Kredisi')]");
    By krediTutar = By.cssSelector("#calc-tutar");
    By krediVade = By.cssSelector("#calc-vade");
    By krediFaiz = By.cssSelector("#faiz-orani");
    By hesaplaKredi = By.xpath("//a[@class='btn btn-red calculation-btn']");

    public TasitKredisiPage(WebDriver driver) {
        TasitKredisiPage.driver = driver;
        this.elementHelper = new ElementHelper(driver);

    }

    public void anaSayfa() {
        driver.get("https://www.ziraatbank.com.tr/tr");
    }

    public void kabulCookie() {
        driver.findElement(kabulCookie).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", " ");
    }

    public void hesaplamaAraclari() {
        driver.findElement(hesaplama).click();
    }


    public void tasitKredisi() {
        driver.findElement(tasitKredisi).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", " ");
    }

    public void krediTasit() throws InterruptedException {
        Select select = new Select(driver.findElement(By.cssSelector("#ddlCredit")));
        select.selectByVisibleText("Taşıt Kredisi");
        Thread.sleep(1000);
    }

    public void krediTutar() throws InterruptedException {
        driver.findElement(krediTutar).clear();
        driver.findElement(krediTutar).sendKeys("400000");
        Thread.sleep(1000);
    }

    public void krediVade() throws InterruptedException {
        driver.findElement(krediVade).clear();
        driver.findElement(krediVade).sendKeys("48");
        Thread.sleep(1000);
    }

    public void krediFaiz() throws InterruptedException {
        driver.findElement(krediFaiz).sendKeys("4");
        Thread.sleep(1000);
    }

    public void hesaplaKredi() {
        driver.findElement(hesaplaKredi).click();
    }

    public void konsolaYazdir() {
        int krediTutari = 400000;
        double krediFaizi = 4;
        int krediVadesi = 48;
        double taksitTutari;
        double yillikMaliyet;

        taksitTutari = krediTutari * (krediFaizi * (1 + krediFaizi) /((double) krediVadesi /(krediVadesi - 1)));  //Hesaplama gerçeği yansıtmamaktadır.
        yillikMaliyet = (krediTutari +(krediFaizi*krediVadesi));  //Hesaplama gerçeği yansıtmamaktadır.
        System.out.println("Taksit tutari         :" + taksitTutari);
        System.out.println("Faiz orani            :" + krediFaizi);
        System.out.println("Yillik maliyet orani  :" + yillikMaliyet);

    }
}