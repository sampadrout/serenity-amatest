package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JoiningOptionsScreen extends PageObject {

    @FindBy(xpath = "//*[@text='Joining Options']")
    private WebElementFacade joiningOptionsScreen;

    @FindBy(xpath = "//*[@text='Webinars']")
    private WebElementFacade webinars;

    public void isJoiningOptionsScreenShown() {
        element(joiningOptionsScreen).waitUntilVisible();
    }

    public void tapWebinars() {
        element(webinars).waitUntilClickable().click();
    }
}
