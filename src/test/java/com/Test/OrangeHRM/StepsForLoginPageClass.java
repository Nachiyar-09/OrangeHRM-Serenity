package com.Test.OrangeHRM;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class StepsForLoginPageClass extends PageObject {

    @Step("Enter Username")
    public void inputUserName(String Username){
        $("#txtUsername").sendKeys(Username);
    }
    @Step("Enter Password")
    public void inputPassword(String Password){
        $("#txtPassword").sendKeys(Password);
    }
    @Step("Click Submit")
    public void ClickLoginButton(){
        $("#btnLogin").click();
    }
     @Step("Error Message on unsuccessful login")
        public String errorMessage() {
            String actualErrorMessage = $(By.id("#spanMessage")).getText();
            return actualErrorMessage;
        }

    }
