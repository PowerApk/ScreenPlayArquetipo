package com.newtours.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.newtours.ui.NewToursReservationsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Button implements Question<Boolean>{

	
	@Override
    public Boolean answeredBy(Actor actor) {
        return the(NewToursReservationsPage.FLIGHTS)
        		.answeredBy(actor).isCurrentlyVisible();
    }

    public static Button isDisplayed() {
        return new Button();
    }

}
