package com.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.BrokenLinks;
import com.Utilities.waitdriver;
import com.base.BaseClass;

public class Loginpage extends BaseClass {

	//Constructor
	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//WebElement Objects
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(xpath="(//input[@value='Login'])[1]")
	WebElement Button;
	
	@FindBy(xpath="//td[text()='Wrong Username / Password. Try again.']")
	WebElement wrong;
	
	@FindBy(xpath="//*[@id='main']/tbody/tr[1]/td[1]/img")
	WebElement Img;
	
	@FindBy(xpath="//input[@title='More']")
	WebElement moreBtn;
	
	@FindBy(id="moreRelaseNotes")
	WebElement Notes;
	
	//LoginPage Title
	public void GetnameLoginPage(){
		
		String name =driver.getTitle();
		
		System.out.println("Name of Login page:"+name);
	}
	
	//Get the Links from the Login Page
	public void BrokenLinksVerify() throws MalformedURLException, IOException{
		 
		BrokenLinks.FindBrokenLinks();
		
	}
	
	//Check whether the image is Displayed or not
	public void ImageDisplay(){
		
		boolean flag =Img.isDisplayed();
		System.out.println("Image is Displayed:"+flag);
	}
	
	//Verifying the Login page using "Enter" keyword 
	public HomePage LoginEnter() throws IOException, InterruptedException{
		
		Username.sendKeys("administrator");
		Password.sendKeys("a1");
		Password.sendKeys(Keys.ENTER);
		
		String s1 = driver.getCurrentUrl();
		
		if(s1.equalsIgnoreCase("http://192.168.100.249/ewqims_inst1/Common/EwIMSNew/Index/Index")){
			System.out.println("Current Page Title:"+s1);
		}else{
			
			String s2 = wrong.getText();
			System.out.println(s2);
		}

		Thread.sleep(8000);
		
		return new HomePage();
	}
	
	//Verifying the Login page using "Button" click
	public HomePage LoginButton() throws IOException, InterruptedException{
		
		Username.sendKeys("administrato");
		Password.sendKeys("admin");
		Button.click();
		
		String s1 = driver.getCurrentUrl();
		
		if(s1.equalsIgnoreCase("http://192.168.100.249/ewqims_inst1/Common/EwIMSNew/Index/Index")){
			System.out.println("Current Page Title:"+s1);
		}else{
			
			String s2 = wrong.getText();
			System.out.println(s2);
		}

		Thread.sleep(3000);
		return new HomePage();
	}
	
	//Verifying MoreButton
	public void VerifyMoreBtn(){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", moreBtn);
		
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		
		Iterator<String> i1 = handle.iterator();

		String parent = i1.next();
		
		String child = i1.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	}
	
	//verifying RelaseNotes Link
	public void releaseNotesVerify() throws AWTException, InterruptedException
	{
		Notes.click();
		
		WebElement target = driver.switchTo().activeElement();
		waitdriver.ExpWait(driver,target , 20);
		
		driver.switchTo().frame("iloadDialog");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		
	}




}
