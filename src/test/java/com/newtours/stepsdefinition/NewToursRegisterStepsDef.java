package com.newtours.stepsdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.exceptions.NoMatchingButton;
import com.newtours.exceptions.NoWebConnection;
import com.newtours.model.RegisterData;
import com.newtours.questions.Button;
import com.newtours.tasks.CustomEntry;
import com.newtours.tasks.OpenTheBrowser;
import com.newtours.tasks.Register;
import com.newtours.ui.NewToursHomePage;
import com.newtours.ui.NewToursRegisterPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class NewToursRegisterStepsDef {
	
	@Managed(driver="chrome")
	private WebDriver hisDriver;
	
	private Actor alejo = Actor.named("Alejo");
	private NewToursRegisterPage newtoursRegisterPage;
	//private int filaActual = 0;
	//private List<RegisterData> fromData;
	
	//esto es un tipo de constructor en el cual estoy pasando el data
	//de cucumber y la guardo en una variable para toda la prueba
	//TODO
	/*public void fromInfo(List<RegisterData> fromData){
		
		this.fromData = fromData;
	}*/
	
	@Before
	public void setup() {
		
		//aca estamos uniendo el actor con el driver
		//ya que en adelante no hablaremos de driver
		//sino del actor q usa el driver
		alejo.can(BrowseTheWeb.with(hisDriver));
	}
	
	//aca lo que hago es que cuando finalice el test me muevo
	//a la proxima columna de la tabla de datos de ccucumber
	//@After
	//public void cucumberIterator() {
		//filaActual++;//por ahora no funciono, talvez sirva mas adelnte
	//}
	
	@Given("^User is in NewTours Register Page$")
	public void userIsInNewToursRegisterPage() {
		//System.out.println("actualmente en: "+filaActual);
		//Background
				alejo.wasAbleTo(OpenTheBrowser.on(newtoursRegisterPage));
				alejo.should(
						seeThat(Button.isDisplayed(NewToursHomePage.LOGO)).
						orComplainWith(NoWebConnection.class,"No Aplication Connection"));
	}

	@When("^User fill the form info (\\d+)$")
	public void userFillTheFormInfo(int index,List<RegisterData> fromData) {//fromInfo(fromData);
		/*{
		 * System.out.println(this.fromData.get(index).getNombre());
		 *System.out.println(this.fromData.get(index).getApellido()); 
		 * }
		 */
		alejo.attemptsTo(CustomEntry.fromData(fromData.get(index)));
	}

	@When("^User sumbit on register button$")
	public void userSumbitOnRegisterButton() {
		alejo.attemptsTo(Register.button(NewToursRegisterPage.CONFIRM_REGISTER));
	}

	@Then("^User successful registered$")
	public void userSuccessfulRegistered() {
		alejo.should(
	    		seeThat(Button.isDisplayed(NewToursRegisterPage.CONFIRM_MESSAGE)).
	    		orComplainWith(NoMatchingButton.class,
	    				"Missing Confirmation"));
	}

}
