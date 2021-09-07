package com.runner.app;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {},
                 features = "src/test/resources/Feature/LoginWithHRM.feature",
                 glue = "com.example.stepdefinitions")

public class HRMRunnerClass {
}
