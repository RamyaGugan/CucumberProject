package com.PageObjman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.BooknowPOM;
import com.POM.ContinuePOM;
import com.POM.LoginPOM;
import com.POM.SearchPOM;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPOM launch;

	public WebDriver getDriver() {
		return driver;
	}

	public LoginPOM getLaunch() {
		
		launch = new LoginPOM (driver);
		
		return launch;
	}
	
	public PageObjectManager(WebDriver d) {
		
		driver =d ;
		PageFactory.initElements(driver, this);
	}
	
	private ContinuePOM continu;

	public ContinuePOM getContinu() {
		
		continu = new ContinuePOM(driver);
		
		return continu;
	}
	
	private SearchPOM search;
	
	public SearchPOM getSearch() {
		
		search = new SearchPOM(driver);
		
		return search;
	}

	private BooknowPOM booknow;

	public BooknowPOM getBooknow() {
		
		booknow = new BooknowPOM(driver);
		
		return booknow;
	}

	

}
