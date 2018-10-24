package com.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.ui.NewToursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Register implements Task{
	
	private Target buttonRecursive;
	
	public Register (Target button) {
		this.buttonRecursive = button;
	}
	
	@Override
	@Step("{0} Click on Button")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(buttonRecursive));
		
	}
	
	public static Register button(Target button) {
		return instrumented(Register.class,button);
		
	}

}
