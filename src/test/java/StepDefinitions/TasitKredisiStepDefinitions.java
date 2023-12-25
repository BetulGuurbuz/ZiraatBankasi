package StepDefinitions;

import Pages.TasitKredisiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class TasitKredisiStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    TasitKredisiPage homePage = new TasitKredisiPage(driver);

    @Given("Kullanici anasayfadadir")
    public void kullaniciAnasayfadadir() {
        homePage.anaSayfa();
    }

    @Given("Cookie kabul eder")
    public void cookieKabulEder() {
        homePage.kabulCookie();
    }

    @Given("Hesaplama araclari linkine tiklar")
    public void hesaplamaAraclariLinkineTiklar() {
        homePage.hesaplamaAraclari();
    }

    @Given("Tasit kredisi linkine tiklar")
    public void tasitKredisiLinkineTiklar() {
        homePage.tasitKredisi();
    }

    @When("Kredi turunu tasit kredisi secer")
    public void krediTurunuTasitKredisiSecer() throws InterruptedException {
        homePage.krediTasit();
    }

    @When("Tutar {int} yazar")
    public void tutarYazar(int arg0) throws InterruptedException {
        homePage.krediTutar();
    }

    @When("Vade {int} yazar")
    public void vadeYazar(int arg0) throws InterruptedException {
        homePage.krediVade();
    }

    @When("Faiz {int} yazar")
    public void faizYazar(int arg0) throws InterruptedException {
        homePage.krediFaiz();
    }

    @Then("Hesapla butonuna tiklar")
    public void hesaplaButonunaTiklar() {
        homePage.hesaplaKredi();
    }

    @Then("Hesaplama sonucunu konsola yazdirilir")
    public void hesaplamaSonucunuKonsolaYazdir() {
        homePage.konsolaYazdir();
    }

}
