package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountScreen extends PageObject {

    @FindBy(xpath = "//*[@text='My Account']")
    private WebElementFacade myAccountScreen;

    @FindBy(xpath = "//*[@text='Business Card']")
    private WebElementFacade businessCard;

    @FindBy(xpath = "//*[@text='FirstNameUpdated Test5']")
    private WebElementFacade firstNameText;

    public void isMyAccountScreenShown() {
        element(myAccountScreen).waitUntilVisible();
    }

    public void tapBusinessCard() {
        element(businessCard).waitUntilClickable().click();
    }

    public void isFirstNameUpdated() {
        element(firstNameText).waitUntilVisible();
        element(firstNameText).getText().contains("FirstNameUpdated");
    }
}
