package YNAP.com.StepDefinitions;

import YNAP.com.PageObjects.Homepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuperbrandSteps {

    Homepage homepage = new Homepage();

    @When("user click on any superbrand")
    public void user_click_on_any_superbrand() {
        homepage.clickOnAnySuperbrand();
    }
    @Then("user able to see the respective products of that superbrand")
    public void user_able_to_see_the_respective_products_of_that_superbrand() {
        homepage.assertforCoatPage();
    }

}
