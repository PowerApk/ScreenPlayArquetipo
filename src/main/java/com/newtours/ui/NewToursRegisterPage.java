package com.newtours.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercuryregister.php")
public class NewToursRegisterPage extends PageObject {
	
	//public static final Target[] targets = {/--Aca todos los Targets--/};
	
	public static final Target FIRST_NAME = 
			Target.the("NewTours Register form First name").
			located(By.name("firstName"));
	
	public static final Target LAST_NAME = 
			Target.the("NewTours Register form Last name").
			located(By.name("lastName"));
	
	public static final Target PHONE = 
			Target.the("NewTours Register form phone").
			located(By.name("phone"));
	
	public static final Target EMAIL = 
			Target.the("NewTours Register form Email").
			located(By.name("userName"));
	
	public static final Target ADDRESS1 = 
			Target.the("NewTours Register form Address 1").
			located(By.name("address1"));
	
	public static final Target ADDRESS2 = 
			Target.the("NewTours Register form Address 2").
			located(By.name("address2"));
	
	public static final Target CITY = 
			Target.the("NewTours Register form ciry").
			located(By.name("city"));
	
	public static final Target STATE = 
			Target.the("NewTours Register form State").
			located(By.name("state"));
	
	public static final Target POSTAL_CODE = 
			Target.the("NewTours Register form Postal Code").
			located(By.name("postalCode"));
	
	public static final Target COUNTRY = 
			Target.the("NewTours Register form Country selector").
			located(By.name("country"));

	public static final Target USER_NAME = 
			Target.the("NewTours Register form User Name").
			located(By.name("email"));
	
	public static final Target PASSWORD = 
			Target.the("NewTours Register form Postal Code").
			located(By.name("password"));
	
	public static final Target CONFIRM_PASSWORD = 
			Target.the("NewTours Register form Postal Code").
			located(By.name("confirmPassword"));
	
	public static final Target CONFIRM_REGISTER = 
			Target.the("NewTours Register form Register Button").
			located(By.name("register"));
	
	public static final Target CONFIRM_MESSAGE =
			Target.the("NewTours Confirmation message").
			locatedBy("//b[contains(text(),'Dear')]");
		
	
	
	

}
