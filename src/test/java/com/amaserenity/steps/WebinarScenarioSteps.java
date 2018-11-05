package com.amaserenity.steps;

import com.amaserenity.model.UserAccount;
import com.amaserenity.steps.serenity.UserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class WebinarScenarioSteps {

    @Steps
    UserSteps user;

    @Given("user logs in using username, password and phone number")
    public void given_user_logs_in(List<UserAccount> userAccounts) throws Throwable {
        user.opens_login_screen();
        user.enters_user_name(userAccounts);
        user.enters_password(userAccounts);
        user.enters_phone_number(userAccounts);
        user.taps_to_login();
        user.navigates_to_calendar_screen();
        user.taps_to_select_local_calendar();
        user.taps_to_accept_calendar_permission_alert();
        user.taps_to_Done();
        user.navigates_to_contacts_screen();
        user.taps_on_Contacts();
        user.taps_to_accept_contacts_permission_alert();
        user.swipes_and_close_tutorial_screen();
        user.navigates_to_main_screen();
    }

    @When("navigates to settings")
    public void when_navigates_to_settings() {
        user.opens_settings_drawer();
        user.taps_on_settings_option();
        user.navigates_to_settings_screen();
    }

    @And("user taps on joining options setting")
    public void and_user_taps_on_joining_options_setting() {
        user.taps_on_joining_options();
    }

    @And("user should see the joining options setting screen")
    public void and_user_should_see_the_joining_options_setting_screen() {
        user.navigates_to_joining_options_screen();
    }

    @And("user taps on webinars setting")
    public void and_user_taps_on_webinars_setting() {
        user.taps_on_webinars_setting();
    }

    @And("user should see the webinars setting screen")
    public void and_user_should_see_the_webinars_setting_screen() {
        user.navigates_to_webinars_screen();
    }

    @And("user taps on add webinar button")
    public void and_user_taps_on_add_webinar_button() {
        user.taps_on_add_webinar();
    }

    @And("user enters webinar name")
    public void and_user_enters_webinar_name() {
        user.enters_webinar_name();
    }

    @And("user enters webinar url")
    public void and_user_enters_webinar_url() {
        user.enters_webinar_url();
    }

    @And("user taps on save")
    public void and_user_taps_on_save() {
        user.taps_to_save_webinar();
    }

    @Then("user successfully added the webinar")
    public void then_user_successfully_added_the_webinar() {
        user.successfully_saved_webinar();
    }
}