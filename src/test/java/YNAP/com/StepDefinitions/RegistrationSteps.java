package YNAP.com.StepDefinitions;

import YNAP.com.PageObjects.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

    Homepage homepage = new Homepage();

    @Given("user is on the outnet homepage")
    public void user_is_on_the_outnet_homepage() {
        homepage.aseertHomepage();
    }
    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        homepage.clickSignInBtn();
    }
    @When("user enter email address")
    public void user_enter_email_address() {
        homepage.enterEmail();
    }
    @When("click on I'm new to outlet radio button")
    public void click_on_i_m_new_to_outlet_radio_button() {
        homepage.clickRradioBtn();
    }
    @When("user enter the password")
    public void user_enter_the_password() {
        homepage.enterPassword();
    }
    @When("user enter the First name and Last name")
    public void user_enter_the_first_name_and_last_name() {
        homepage.enterFAndLname();
    }
    @When("user click on {string} promotional eamil radio button")
    public void user_click_on_promotional_eamil_radio_button(String string) {
        homepage.noThanksRadioBtn();
    }
    @When("user click on register")
    public void user_click_on_register() {
        homepage.clickRegisterBtn();
    }
    @Then("user shoul be able to register successfully")
    public void user_shoul_be_able_to_register_successfully() {

    }

}
