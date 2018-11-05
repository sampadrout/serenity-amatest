package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessCardScreen extends PageObject {

    @FindBy(xpath = "//*[@text='Business Card']")
    private WebElementFacade businessCardScreen;

    @FindBy(id = "com.thinkrite.assistant:id/firstNameText")
    private WebElementFacade firstName;


    @FindBy(id = "com.thinkrite.assistant:id/save")
    private WebElementFacade save;

    public void isBusinessCardScreenShown() {
        element(businessCardScreen).waitUntilVisible();
    }

    public void enterFirstName() {
        element(firstName).waitUntilVisible().clear();
        element(firstName).sendKeys("FirstNameUpdate");
    }

    public void tapSave() {
        element(save).waitUntilClickable().click();

    }

    public void isFirstNameUpdated() {
        element(firstName).waitUntilVisible();
        element(firstName).getText().contains("FirstNameUpdated");
    }
}