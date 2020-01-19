package com.ksergie.tasks;

import com.ksergie.ui.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

public class FillsOutTheRegistrationForm implements Performable{

    public FillsOutTheRegistrationForm() {
    }

    private Map<String, String> contacts;

    public FillsOutTheRegistrationForm(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("test180106@test.com").into(RegistrationForm.EMAIL),
                Enter.theValue(contacts.get("Password")).into(RegistrationForm.PASSWORD),
                Enter.theValue(contacts.get("First Name")).into(RegistrationForm.FIRST_NAME),
                Enter.theValue(contacts.get("Last Name")).into(RegistrationForm.LAST_NAME),
                Click.on(RegistrationForm.CREATE_BUTTON)
        );
    }

    public static Performable withDetails(Map<String, String> contacts) {
        return new FillsOutTheRegistrationForm(contacts);
    }
}
