package com.Test.OrangeHRM;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class StepsForForgetPasswordPage extends PageObject {

    @Step("Click Forget Password Link")
    public void clickForgetPasswordLink() {
        $(By.linkText("Forgot your password?")).click();
    }

    @Step("Verify Forget Password Page ")
    public boolean ForgetPasswordPage() {
        Boolean resetPasswordButton = $(By.id("btnSearchValues")).isDisplayed();

        return resetPasswordButton;
    }
}
