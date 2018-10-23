package com.newtours.runers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		monochrome = true,
		features="src/test/resources/features/newTours_login.feature",
		glue="com.newtours.stepsdefinition",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"}
		)

public class NewToursLoginRunner {

}
