package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPage;

public class AutomationStepDefinitions {
    AutomationPage automationPage=new AutomationPage();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.singInButton.click();
    }
    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {

    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {

    }
    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {

    }

    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {

    }
}