package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.PageObjman.PageObjectManager;
import com.adactin.runner.Adactinrunner;
import com.mainpackage.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinstepdefinition extends Baseclass {

	public WebDriver driver = Adactinrunner.driver;

	PageObjectManager p = new PageObjectManager(driver);

	@Given("user launch the url of the adctin")
	public void user_launch_the_url_of_the_adctin() {
		System.out.println(driver);
		url("https://adactinhotelapp.com/");

	}

	@When("user enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() {
		inputValue(p.getLaunch().getusername(), "Ramya16697");

	}

	@When("user ender the password in the password field")
	public void user_ender_the_password_in_the_password_field() {
		inputValue(p.getLaunch().getPassword(), "BNGAF4");
	}

	@Then("user should click the login and it will be navigate to the search page")
	public void user_should_click_the_login_and_it_will_be_navigate_to_the_search_page() {
		clk(p.getLaunch().getLogin());

	}

}
