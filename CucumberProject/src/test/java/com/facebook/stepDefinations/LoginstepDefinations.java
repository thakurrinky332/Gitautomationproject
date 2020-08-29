package com.facebook.stepDefinations;

import com.facebook.pagesObjects.LoginPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefinations extends LoginPageObject {

	LoginPageObject lpo = new LoginPageObject();

	@Given("^I am a user of facebook applications$")
	public void i_am_a_user_of_facebook_applications() throws Throwable {
		lpo.enterUsername();

	}

	@When("^I enter valid usernames$")
	public void i_enter_valid_usernames() throws Throwable {
		lpo.enterUsername();

	}

	@When("^I enter valid passwords$")
	public void i_enter_valid_passwords() throws Throwable {
		lpo.enterPassword();

	}

	@When("^I click on Login buttons$")
	public void i_click_on_Login_buttons() throws Throwable {
		lpo.clicklogbutton();

	}

	@Then("^user should be able to log in successfullys$")
	public void user_should_be_able_to_log_in_successfullys() throws Throwable {
		lpo.verifyLogin();
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		lpo.enterfirstname();

	}

}