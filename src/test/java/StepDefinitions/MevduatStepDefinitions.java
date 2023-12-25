package StepDefinitions;

import Pages.MevduatPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MevduatStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    MevduatPage mevduatPage = new MevduatPage(driver);

    @Given("Mevduat getirisi linkine tiklar")
    public void mevduatGetirisiLinkineTiklar() {
        mevduatPage.mevduatGetirisiLink();
    }

    @When("Doviz cinsi TL secer")
    public void dovizCinsiTLSecer() throws InterruptedException {
        mevduatPage.dovizCinsi();
    }

    @When("Vade süresi {int} yazar")
    public void vadeSüresiYazar(int arg0) throws InterruptedException {
        mevduatPage.vadeSuresi();
    }

    @When("Vade Tutar {int} yazar")
    public void vadeTutarYazar(int arg0) throws InterruptedException {
        mevduatPage.vadeTutari();
    }

    @Then("Vade hesaplama butonuna tiklar")
    public void vadeHesaplamaButonunaTiklar() {
        mevduatPage.vadeHesaplamaButton();
    }

    @Then("Vade hesaplama sonucunu konsola yazdirilir")
    public void vadeHesaplamaSonucunuKonsolaYazdirilir() {
        mevduatPage.vadeHesaplamaSonucu();
    }


}
