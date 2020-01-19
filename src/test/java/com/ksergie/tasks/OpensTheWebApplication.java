package com.ksergie.tasks;

import com.ksergie.ui.MainPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpensTheWebApplication {
    public static Performable onTheHomePage() {
        return Task.where("{0} opens the web application",
                Open.url("https://admin:ba8f3418f414fe@staging.lotteryheroes.com/"),
                WaitUntil.the(MainPage.ACCEPT_COOKIES_BUTTON, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(MainPage.ACCEPT_COOKIES_BUTTON),
                Click.on(MainPage.REGISTER_BUTTON));
    }
}
