package com.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.ui.NewToursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Submit implements Task{

	@Override
	@Step("{0} Click on Submit Button")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursHomePage.LOGIN));
		
	}
	
	public static Submit button() {
		return instrumented(Submit.class);
		
	}

}
