package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePOM {
	
	public WebDriver driver;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath="//input[@id='radiobutton_0']")
	private WebElement Ratiobtn;
	
	
	public WebElement getContinue() {
		
		return Continue;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getRatiobtn() {
		return Ratiobtn;
	}
	
public ContinuePOM(WebDriver d) {
		
	    driver =d ;
		PageFactory.initElements(driver, this);

}

}
