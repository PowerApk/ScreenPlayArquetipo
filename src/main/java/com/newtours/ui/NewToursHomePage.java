package com.newtours.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class NewToursHomePage extends PageObject {
	
	//Aca mapeo los elementos propios de la pagina

	public static final Target USER_NAME = 
			Target.the("NewTours UserName field").
			located(By.name("userName"));
	
	public static final Target PASSWORD = 
			Target.the("NewTours Password field")
			.located(By.name("password"));
	
	public static final Target LOGIN =
			Target.the("NewTours Log-In Button")
			.located(By.name("login"));
}
