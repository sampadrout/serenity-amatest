package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebinarScreen extends PageObject {

    @FindBy(xpath = "//*[@text='Webinars']")
    private WebElementFacade webinarsScreen;

    @FindBy(id = "com.thinkrite.assistant:id/floatingActionButton")
    private WebElementFacade addWebinar;

    @FindBy(xpath = "//*[@text='Webinar']")
    private WebElementFacade addWebinarScreen;

    @FindBy(id = "com.thinkrite.assistant:id/joiningOptionLabelEditText")
    private WebElementFacade webinarname;

    @FindBy(id = "com.thinkrite.assistant:id/joiningOptionValueEditText")
    private WebElementFacade url;

    @FindBy(id = "com.thinkrite.assistant:id/save")
    private WebElementFacade save;

    @FindBy(xpath = "//*[@text='test webinar']")
    private WebElementFacade webinarName;

    public void isWebinarsScreenShown() {
        element(webinarsScreen).waitUntilVisible();
    }

    public void tapAddWebinar() {
        element(addWebinar).waitUntilVisible().click();
    }

    public void isAddWebinarScreenShown() {
        element(addWebinarScreen).waitUntilVisible();
    }

    public void enterWebinrName() {
        element(webinarname).sendKeys("test webinar");
    }

    public void enterURL() {
        element(url).sendKeys("http://google.com");
    }

    public void tapSave() {
        element(save).waitUntilClickable().click();
    }

    public void isWebinarSaved() {
        element(webinarName).isPresent();
    }
}

