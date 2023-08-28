package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	public WebDriver driver;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath="//input[@id='login']")
	private WebElement Login;
	
	public WebElement getusername() {
		
		return Username;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	public LoginPOM(WebDriver d) {
		
		driver =d ;
		PageFactory.initElements(driver, this);
	}

	
	
	

}
