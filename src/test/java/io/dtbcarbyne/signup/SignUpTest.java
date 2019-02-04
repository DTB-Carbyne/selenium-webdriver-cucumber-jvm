package io.dtbcarbyne.signup;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.dtbcarbyne.signup.base.BaseTestCase;

import static org.junit.Assert.assertEquals;

public class SignUpTest extends BaseTestCase {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Given("I am on farmdrop's signup page")
    public void i_am_on_farmdrop_s_signup_page() {
        assertEquals(BASE_URL + "/signup", driver.getCurrentUrl());
    }

    @When("I enter my details")
    public void i_enter_my_details() {
        SignUpTestHelpers.enterEmailAddress(SignUpTestHelpers.EMAIL_ADDRESS);
        SignUpTestHelpers.enterPassword(SignUpTestHelpers.PASSWORD);
        SignUpTestHelpers.enterPostcode(SignUpTestHelpers.ZIPCODE);
        SignUpTestHelpers.clickMarketingOptOutButton();
    }

    @And("click the submit button")
    public void click_the_submit_button() {
        SignUpTestHelpers.clickSumbitButton();
    }

    @Then("I am logged in to my city's instance of Farmdrop")
    public void i_am_logged_in_to_my_city_s_instance_of_Farmdrop() {
        SignUpTestHelpers.checkThatURLPathEndsWithLondon();
    }
}
