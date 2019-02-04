package io.dtbcarbyne.signup;

import io.dtbcarbyne.signup.base.BaseTestCase;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class SignUpTestHelpers extends BaseTestCase {
    static final String SIGN_UP = "Sign up";
    static final String EMAIL_ID = "email";
    static final String EMAIL_ADDRESS = "will@" + RandomStringUtils.randomAlphanumeric(10) + ".com";
    static final String PASSWORD = "Password1";
    static final String PASSWORD_ID = "password";
    static final String ZIPCODE_ID = "zipcode";
    static final String ZIPCODE = "EC1V 2NX";
    static final String MARKETING_OPT_IN_ID = "//label[text()='No, thanks']";
    static final String SIGNUP_SUBMIT_BUTTON_ID = "email-signup-form-submit";

    static void enterEmailAddress(String email) {
        driver.findElement(By.id(EMAIL_ID)).sendKeys(email);
    }

    static void enterPassword(String password) {
        driver.findElement(By.id(PASSWORD_ID)).sendKeys(password);
    }

    static void enterPostcode(String zipcode) {
        driver.findElement(By.id(ZIPCODE_ID)).sendKeys(zipcode);
    }

    static void clickMarketingOptOutButton() {
        driver.findElement(By.xpath(MARKETING_OPT_IN_ID)).click();
    }

    static void clickSumbitButton() {
        driver.findElement(By.id(SIGNUP_SUBMIT_BUTTON_ID)).click();
    }

    static void checkThatURLPathEndsWithLondon() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe(BASE_URL + "/london"));
        assertEquals(BASE_URL + "/london", driver.getCurrentUrl());
    }
}
