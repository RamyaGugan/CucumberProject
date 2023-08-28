package com.mainpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.xmlbeans.impl.inst2xsd.util.Type;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	public static WebDriver getBrowser (String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();	
		}
		

		
		return driver;
	}
	
	public static void url(String ur) {
		
		driver.get(ur);
	}
	
	public static void inputValue (WebElement ele,String value) {
		
		ele.sendKeys(value);
	}
	
	public static void clk(WebElement element) {
		
		element.click();
		
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
		
	}
	
	
	public static void cancel () {
		
		driver.close();
	}
	
	public static void drop () {
		driver.quit();
	}
	
//	public static void  dropdown(WebElement String,String type,String value) {
		
	//	Select s = new Select (String);
		
		//if (type.equalsIgnoreCase("value")) {
			
			//s.selectByVisibleText(value);
			
		//}
		
		//else if (type.equalsIgnoreCase("value")) {
			
			//s.selectByValue(value);
			
		//}
		
		//else if (type.equalsIgnoreCase("value")) {
			
			//int a = Integer.parseInt(value);
			//s.selectByIndex(a);
			
		//}
		
	//}
	
public static Select dropdown(WebElement String) {  
		
	Select s = new Select (String);
		
		return s;
		
}

public static void selectbyindex (WebElement String,int index) {
	
	dropdown(String).selectByIndex(index);
}

public static void selectbyvalue(WebElement String,String value) {
	
	dropdown(String).selectByValue(value);
}

public static void selectbyvisibletext(WebElement String,String visibletext ) {
	
	dropdown(String).selectByVisibleText(visibletext);
}
		
public static void snap (String name) throws IOException {
	
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\91959\\eclipse-workspace\\Frameworknew\\Screenshot"+name+".jpg");
	FileUtils.copyFile(src, des);
}
}

