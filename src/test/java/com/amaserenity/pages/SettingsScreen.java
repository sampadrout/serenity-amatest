package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsScreen extends PageObject {

    @FindBy(xpath = "//*[@text='Settings']")
    private WebElementFacade settings;

    @FindBy(xpath = "//*[@text='Joining Options']")
    private WebElementFacade joiningOptions;

    @FindBy(xpath = "//*[@text='My Account']")
    private WebElementFacade myAccountSetting;

    @FindBy(xpath = "//*[@text='Sign Out']")
    private WebElementFacade signOut;

    @FindBy(xpath = "//*[@text='OK']")
    private WebElementFacade confirmSignOut;

    public void isSettingsScreenShown() {
        element(settings).waitUntilVisible();
    }

    public void tapJoiningOptionSetting() {
        element(joiningOptions).waitUntilClickable().click();
    }

    public void tapMyAccountSetting() {
        element(myAccountSetting).waitUntilClickable().click();
    }

    public void tapSignout() {
        element(signOut).waitUntilClickable().click();
    }

    public void tapConfirmSignout() {
        element(confirmSignOut).waitUntilClickable().click();
    }
}