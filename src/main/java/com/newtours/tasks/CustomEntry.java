package com.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.lang.reflect.Method;

import com.newtours.model.RegisterData;
import com.newtours.ui.NewToursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class CustomEntry implements Task  {
	
private RegisterData data;
	
//proximamente inplementando reflection para
//que se pueda ingresar cualquier clase
//TODO
	private Class<?> c = RegisterData.class;
	private Method[] f = c.getDeclaredMethods();
	
	public CustomEntry (RegisterData data) {
		this.data = data;
	}

	/*@Override
	public <T extends Actor> void performAs(T actor) {
			for (int i = 0;i<data.values().length;i++) {
			actor.attemptsTo(Enter.theValue(data.values()[i]).
				into(NewToursRegisterPage.targets[i]));
				System.out.println(data.values()[i]);
			
		}
	}*/
	
	@Override
	@Step("{0} fill the fields in from")
	public <T extends Actor> void performAs(T actor) {
			
			actor.attemptsTo(
					Enter.theValue(data.getNombre()).
					into(NewToursRegisterPage.FIRST_NAME),
					Enter.theValue(data.getApellido()).
					into(NewToursRegisterPage.LAST_NAME),
					Enter.theValue(data.getPhone()).
					into(NewToursRegisterPage.PHONE),
					Enter.theValue(data.getEmail()).
					into(NewToursRegisterPage.EMAIL),
					Enter.theValue(data.getAddress1()).
					into(NewToursRegisterPage.ADDRESS1),
					Enter.theValue(data.getAddress2()).
					into(NewToursRegisterPage.ADDRESS2),
					Enter.theValue(data.getCity()).
					into(NewToursRegisterPage.CITY),
					Enter.theValue(data.getState()).
					into(NewToursRegisterPage.STATE),
					Enter.theValue(data.getPostal_cod()).
					into(NewToursRegisterPage.POSTAL_CODE),
					SelectFromOptions.byValue(data.getCountry()).
					from(NewToursRegisterPage.COUNTRY),
					Enter.theValue(data.getUserName()).
					into(NewToursRegisterPage.USER_NAME),
					Enter.theValue(data.getPass()).
					into(NewToursRegisterPage.PASSWORD),
					Enter.theValue(data.getConf_pass()).
					into(NewToursRegisterPage.CONFIRM_PASSWORD));			
		
	}
	
	public static CustomEntry fromData (RegisterData data) {
		return instrumented(CustomEntry.class,data);
		
	}

}
