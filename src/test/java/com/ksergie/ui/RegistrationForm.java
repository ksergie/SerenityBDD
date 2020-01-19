package com.ksergie.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    public static final Target CREATE_BUTTON = Target.the("Create your account button").located(By.cssSelector(".bt.plain-modal-inner"));
    public static final Target EMAIL = Target.the("Email field").located(By.id("signup-email"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("signup-password"));
    public static final Target FIRST_NAME = Target.the("First Name field").located(By.id("signup-name"));
    public static final Target LAST_NAME = Target.the("Last Name field").located(By.id("signup-surname"));
}
