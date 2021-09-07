package com.Test.OrangeHRM;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class StepsForDashboardPage extends PageObject {


        @Step("Successful login")
        public void loginVerify() {
            String dashboardTitle = $(By.id("welcome")).getText();
            assertThat(dashboardTitle.contentEquals("Welcome"));
        }
    }

