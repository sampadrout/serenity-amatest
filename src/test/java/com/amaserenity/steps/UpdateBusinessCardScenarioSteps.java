package com.amaserenity.steps;

import com.amaserenity.model.UserAccount;
import com.amaserenity.steps.serenity.UserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class UpdateBusinessCardScenarioSteps {

    @Steps
    UserSteps user;

    @Given("user signs in using username, password and phone number")
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

    @When("user navigates to settings")
    public void when_user_navigates_to_settings() {
        user.opens_settings_drawer();
        user.taps_on_settings_option();
        user.navigates_to_settings_screen();
    }

    @And("taps on my account")
    public void and_taps_on_my_account() {
        user.taps_on_my_account();
    }

    @And("user is on my account screen")
    public void and_user_is_on_my_account_screen() {
        user.navigates_to_my_account_screen();
    }

    @And("user taps on business card setting")
    public void and_user_taps_on_business_card_setting() {
        user.taps_on_business_card();
    }

    @And("user is on business card screen")
    public void and_user_is_on_business_card_screen() {
        user.navigates_to_business_card_screen();
    }

    @And("user updates the first name")
    public void and_user_updates_the_first_name(){
        user.updates_first_name();
    }

    @And("user taps to save updated first name")
    public void and_user_taps_on_save_to_update_first_name() {
        user.taps_on_save_business_card();
    }

    @Then("user successfully updated the business card information")
    public void then_user_successfully_updated_the_bsuiness_card_information() {
        user.successfully_update_firstname();
    }
}
