package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.BrokenLinks;
import com.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Entity']")
	WebElement Entityclick;
	
	//BrokenLinks Verification
	public void BrokenLinksVerify() throws MalformedURLException, IOException{
		
		BrokenLinks.FindBrokenLinks();
	
	}
	
	//Switching to frame and scrolling
	public void frameCheck() throws InterruptedException{
		driver.switchTo().frame("Detailview");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
	}
	
	public EntityPage EntityCheck() throws IOException{
		
		Entityclick.click();
		
		return new EntityPage();
		
	}
	
}
