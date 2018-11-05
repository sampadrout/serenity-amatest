package com.amaserenity.steps.serenity;

import com.amaserenity.model.UserAccount;
import com.amaserenity.pages.*;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class UserSteps extends ScenarioSteps {

    LoginScreen loginScreen;
    CalendarScreen calendarScreen;
    ContactsScreen contactsScreen;
    TutorialScreen tutorialScreen;
    MainScreen mainScreen;
    SettingsScreen settingsScreen;
    JoiningOptionsScreen joiningOptionsScreen;
    WebinarScreen webinarScreen;
    MyAccountScreen myAccountScreen;
    BusinessCardScreen businessCardScreen;

    @Step
    public void opens_login_screen() {
        loginScreen.openLoginScreen();
    }

    @Step
    public void enters_user_name(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterUserName(userAccounts);
    }

    @Step
    public void enters_password(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterPassword(userAccounts);
    }

    @Step
    public void enters_phone_number(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterPhoneNo(userAccounts);
    }

    @Step
    public void taps_to_login() {
        loginScreen.tapLogin();
    }

    @Step
    public void sees_login_error_meesage() {
        loginScreen.isLoginFailedMsgShown();
    }

    @Step
    public void navigates_to_calendar_screen() {
        calendarScreen.isCalendarScreenShown();
    }

    @Step
    public void taps_to_select_local_calendar() {
        calendarScreen.selectLocalCalendar();
    }

    @Step
    public void taps_to_accept_calendar_permission_alert() {
        calendarScreen.acceptCalendarAlert();
    }

    @Step
    public void taps_to_Done() {
        calendarScreen.tapDone();
    }

    @Step
    public void navigates_to_contacts_screen() {
        contactsScreen.isContactsScreenShown();
    }

    @Step
    public void taps_on_Contacts() {
        contactsScreen.tapContacts();
    }

    @Step
    public void taps_to_accept_contacts_permission_alert() {
        contactsScreen.acceptContactsAlert();
    }

    @Step
    public void swipes_and_close_tutorial_screen() {
        tutorialScreen.closeTutorialScreen();
    }

    @Step
    public void navigates_to_main_screen() {
        mainScreen.isMainScreenShown();
    }

    @Step
    public void opens_settings_drawer() {
        mainScreen.openSettingsDrawer();
    }

    @Step
    public void taps_on_settings_option() {
        mainScreen.tapSettingsOption();
    }

    @Step
    public void navigates_to_settings_screen() {
        settingsScreen.isSettingsScreenShown();
    }

    @Step
    public void taps_on_joining_options() {
        settingsScreen.tapJoiningOptionSetting();
    }

    @Step
    public void navigates_to_joining_options_screen() {
        joiningOptionsScreen.isJoiningOptionsScreenShown();
    }

    @Step
    public void taps_on_webinars_setting() {
        joiningOptionsScreen.tapWebinars();
    }

    @Step
    public void navigates_to_webinars_screen() {
        webinarScreen.isWebinarsScreenShown();
    }

    @Step
    public void taps_on_add_webinar() {
        webinarScreen.tapAddWebinar();
    }

    @Step
    public void navigates_to_add_webinar_screen() {
        webinarScreen.isAddWebinarScreenShown();
    }

    @Step
    public void enters_webinar_name() {
        webinarScreen.enterWebinrName();
    }

    @Step
    public void enters_webinar_url() {
        webinarScreen.enterURL();
    }

    @Step
    public void taps_to_save_webinar() {
        webinarScreen.tapSave();
    }

    @Step
    public void successfully_saved_webinar() {
        webinarScreen.isWebinarSaved();
    }

    @Step
    public void taps_on_my_account() {
        settingsScreen.tapMyAccountSetting();
    }

    @Step
    public void navigates_to_my_account_screen() {
        myAccountScreen.isMyAccountScreenShown();
    }

    @Step
    public void taps_on_business_card() {
        myAccountScreen.tapBusinessCard();
    }

    @Step
    public void navigates_to_business_card_screen() {
        businessCardScreen.isBusinessCardScreenShown();
    }

    @Step
    public void updates_first_name() {
        businessCardScreen.enterFirstName();
    }

    @Step
    public void taps_on_save_business_card() {
        businessCardScreen.tapSave();
    }

    @Step
    public void successfully_update_firstname() {
        myAccountScreen.tapBusinessCard();
        businessCardScreen.isFirstNameUpdated();
    }

    @Step
    public void taps_on_signout() {
        settingsScreen.tapSignout();
    }

    @Step
    public void taps_to_confirms_signout() {
        settingsScreen.tapConfirmSignout();
    }

    @Step
    public void navigates_to_login_screen() {
        loginScreen.openLoginScreen();
    }
}
