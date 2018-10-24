package com.newtours.stepsdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.newtours.exceptions.NoMatchingButton;
import com.newtours.exceptions.NoWebConnection;
import com.newtours.questions.Button;
import com.newtours.tasks.Entry;
import com.newtours.tasks.OpenTheBrowser;
import com.newtours.tasks.Submit;
import com.newtours.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.exceptions.ActorCannotBrowseTheWebException;
import net.thucydides.core.annotations.Managed;

public class NewToursLoginStepsDef {
	
	@Managed(driver="chrome")
	private WebDriver hisDriver;
	
	private Actor alejo = Actor.named("Alejo");
	private NewToursHomePage newtoursHomePage;
	
	@Before
	public void setup() {
		//aca estamos uniendo el actor con el driver
		//ya que en adelante no hablaremos de driver
		//sino del actor q usa el driver
		alejo.can(BrowseTheWeb.with(hisDriver));
	}
	
	@Given("^User is in NewTours Home Page$")
	public void userIsInNewToursHomePage() throws ActorCannotBrowseTheWebException {
		//Background
		alejo.wasAbleTo(OpenTheBrowser.on(newtoursHomePage));
		alejo.should(
				seeThat(Button.isDisplayed(NewToursHomePage.LOGO)).
				orComplainWith(NoWebConnection.class,"No Aplication Connection"));
	}

	//Ingresando informacion de usuario
	@When("^User type User\"([^\"]*)\" and Pass\"([^\"]*)\"$")
	public void userTypeUserAndPass(String user, String pass) throws Exception {
	    alejo.attemptsTo(Entry.credentials(user, pass));
	}

	//Validando la info
	@And("^User click log-in button$")
	public void userClickLogInButton() throws Exception {
	    alejo.attemptsTo(Submit.button());
	}

	//Comprobando que ingreso exitosamente
	@Then("^User successful login$")
	public void userSuccessfulLogin() throws Exception {
	    alejo.should(
	    		seeThat(Button.isDisplayed(NewToursHomePage.LOGIN)).
	    		orComplainWith(NoMatchingButton.class,
	    				"Missing Button"));
	}
	
	/*public String getMissingFilterButtonMessage() {
	    return String.format("Missing filter '%s'", filter);
	}*/

}
