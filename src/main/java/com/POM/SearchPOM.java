package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM {
	
	public WebDriver driver;
	
	@FindBy (id="location")
	private WebElement Location;
	
	@FindBy (name="hotels")
	private WebElement Hotels;
	
	@FindBy (xpath="//select[@name='room_type']")
	private WebElement Hoteltype;
	
	@FindBy (id="room_nos")
	private WebElement norooms;
	

	@FindBy (name="datepick_in")
	private WebElement Checkindate;
	
	@FindBy (name="datepick_out")
	private WebElement Checkoutdate;
	
	@FindBy (id="adult_room")
	private WebElement Adtroom;
	
	@FindBy (xpath="//select[@name='child_room']")
	private WebElement CProom;
	
	@FindBy (name="Submit")
	private WebElement Search;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getHoteltype() {
		return Hoteltype;
	}

	public WebElement getNorooms() {
		return norooms;
	}

	public WebElement getCheckindate() {
		return Checkindate;
	}

	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}

	public WebElement getAdtroom() {
		return Adtroom;
	}

	public WebElement getCProom() {
		return CProom;
	}

	public WebElement getSearch() {
		return Search;
	}

	
	public WebElement getLocation() {
		return Location;
	}
	
	
	public SearchPOM(WebDriver d) {
		
		driver =d ;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
