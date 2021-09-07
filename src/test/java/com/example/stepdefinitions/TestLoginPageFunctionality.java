package com.example.stepdefinitions;

import com.Test.OrangeHRM.StepsForDashboardPage;
import com.Test.OrangeHRM.StepsForForgetPasswordPage;
import com.Test.OrangeHRM.StepsForLoginPageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class TestLoginPageFunctionality {

    @Steps
    StepsForLoginPageClass loginPage;

    @Steps
    StepsForDashboardPage dashPage;

    @Steps
    StepsForForgetPasswordPage forgetpasswordPage;

    @Given("User is on Home page")
    public void user_is_on_home_page() {
        loginPage.open();


    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String Username) {
        loginPage.inputUserName(Username);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String Password) {
         loginPage.inputPassword(Password);
         loginPage.ClickLoginButton();
    }

    @Then("User should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
       dashPage.loginVerify();
    }

    @Then("User should be able to see error message {string}")
    public void user_should_be_able_to_see_error_message(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @When("User clicks on Forgot your password link")
    public void user_clicks_on_forgot_your_password_link() {
        forgetpasswordPage.clickForgetPasswordLink();
    }

    @Then("User should be able to see new page which contains Reset Password button")
    public void user_should_be_able_to_see_new_page_which_contains_reset_password_button() {
        Assert.assertTrue(forgetpasswordPage.ForgetPasswordPage());
    }


}
