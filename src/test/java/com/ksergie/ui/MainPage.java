package com.ksergie.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target REGISTER_BUTTON = Target.the("Register button").locatedBy(".action__header .bt.register");
    public static final By CUSTOMER_ICON = By.cssSelector(".action__header button.bt.transparent");
    public static final Target ACCEPT_COOKIES_BUTTON = Target.the("Accept Cookies button").locatedBy("(//a[@class='cc-btn cc-allow'])[1]");
}
