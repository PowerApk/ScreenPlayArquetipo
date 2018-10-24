package com.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.ui.NewToursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Entry implements Task {
		
	private String userName;
	private String password;	
	
	public Entry (String usuario,String password) {
		this.userName = usuario;
		this.password = password;
		
				}

	@Override
	@Step("{0} Enter the credentials in to NewTours login fields")
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(
				Enter.theValue(userName).
				into(NewToursHomePage.USER_NAME),
				Enter.theValue(password).
				into(NewToursHomePage.PASSWORD));
	}
	
	public static Entry credentials (String user,String pass) {
		return instrumented(Entry.class,user,pass);
		
	}

}
