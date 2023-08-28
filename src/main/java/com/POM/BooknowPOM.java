package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooknowPOM {
	
	public WebDriver driver;
	
	@FindBy (xpath="//input[@id='first_name']")
	private WebElement Fname;
	
	@FindBy (xpath="//input[@id='last_name']")
	private WebElement Lname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCno() {
		return Cno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getEdatemonth() {
		return Edatemonth;
	}

	public WebElement getEdateyear() {
		return Edateyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBnow() {
		return Bnow;
	}

	@FindBy (xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy (xpath="//input[@id='cc_num']")
	private WebElement Cno;
	
	@FindBy (id="cc_type")
	private WebElement cctype;
	
	@FindBy (id="cc_exp_month")
	private WebElement Edatemonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement Edateyear;
	
	@FindBy (xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy (xpath="//input[@id='book_now']")
	private WebElement Bnow;
	
    public WebElement getFname() {
		
		return Fname;
    }
		
		public BooknowPOM(WebDriver d) {
			
			driver =d ;
			PageFactory.initElements(driver, this);
	

}
}
