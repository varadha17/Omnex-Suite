package com.Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class waitdriver extends BaseClass {

	public waitdriver() throws IOException {
		super();
		
	}
	
	public static void ExpWait(WebDriver driver, WebElement element, int timeout){
		
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));	
	element.click();	
	}
	
	
	
	

}
