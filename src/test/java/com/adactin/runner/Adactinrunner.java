package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mainpackage.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", glue = "com.adactin.stepdefinition")

public class Adactinrunner extends Baseclass{
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		driver = getBrowser("chrome");
	}
} 
