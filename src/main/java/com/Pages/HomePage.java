package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import com.Utilities.BrokenLinks;
import com.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Entity']")
	WebElement Entityclick;
	
	@FindBy(id="CompanyLogo")
	WebElement CompanyImg;
	
	@FindBy(xpath="//img[@title='EwQIMS']")
	WebElement ProductImg;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[6]/div/button/img")
	WebElement logoutImg;
	
	@FindBy(id="logout")
	WebElement logout;
	
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
	
	public void OmnexImageVerify(){
		
		boolean flag = CompanyImg.isDisplayed();
		
		System.out.println("Company Image:"+flag);
		
	}
	
	public void OmnexProductImageVerify(){
		
		boolean flag1 = ProductImg.isDisplayed();
		
		System.out.println("Product Image:"+flag1);
		
	}
	
	public Loginpage Logout() throws Exception{
		Thread.sleep(4000);
		Screen s = new Screen();
		
		Pattern p = new Pattern("C:\\SikuliImages\\Logout.PNG");
		
		s.click(p);
	
		
		//logoutImg.click();
		Thread.sleep(4000);
		
		logout.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		return new Loginpage();
		
		
	}
	
	public EntityPage EntityCheck() throws IOException{
		
		Entityclick.click();
		
		return new EntityPage();
		
	}
	
}
