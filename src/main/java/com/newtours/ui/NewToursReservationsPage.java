package com.newtours.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursReservationsPage {

	public static final Target FLIGHTS  = 
			Target.the("NewTours search flights Button")
			.located(By.name("findFlights"));
}
