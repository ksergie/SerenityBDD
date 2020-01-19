package com.ksergie.questions;

import com.ksergie.ui.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheRegisteredUsersName {

    public static Question<String> registered() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(MainPage.CUSTOMER_ICON).viewedBy(actor).asString();
            }
        };
    }
}
