package StepDefinitions;

import Pages.SubeAramaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class SubeAramaStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    SubeAramaPage subeAramaPage = new SubeAramaPage(driver);

    @Given("Sayfa asagiya kaydirilir")
    public void sayfaAsagiyaKaydirilir() throws InterruptedException {
        subeAramaPage.sayfaKaydir();
    }

    @When("En Yakin Ziraat alanindan Sube checkbox secilir")
    public void enYakinZiraatAlanindanSubeCheckboxSecilir() {
        subeAramaPage.subeCheckbox();
    }

    @When("Sehir seciniz alanina Ankara yazilir")
    public void sehirSecinizAlaninaAnkaraYazilir() throws InterruptedException {
        subeAramaPage.sehirCombobox();
    }

    @When("Ilce seciniz alanina Golbasi yazılır")
    public void ılceSecinizAlaninaGolbasiYazılır() throws InterruptedException {
        subeAramaPage.ilceCombobox();
    }

    @Then("Ara butonuna tiklanir")
    public void araButonunaTiklanir() throws InterruptedException {
        subeAramaPage.araButton();
    }
}
