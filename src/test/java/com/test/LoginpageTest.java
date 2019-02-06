package com.test;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Pages.Loginpage;
import com.base.BaseClass;

public class LoginpageTest extends BaseClass {

	public static Loginpage login;
	
	public LoginpageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void StarttheBrowser() throws IOException{
		
		start();
		
		login = new Loginpage();
		
		
	}
	
	@Test (enabled = true)
	public void GetNameVerify(){
		
		login.GetnameLoginPage();
	}
	
	@Test(enabled=true)
	public void ImgVerify(){
		login.ImageDisplay();
	}
	
	@Test (enabled = true)
	public void GetBrokenLinks() throws MalformedURLException, IOException{
		
		login.BrokenLinksVerify();
	}
	
	@Test(enabled = true)
	public void LoginVerify() throws IOException, InterruptedException{
		login.LoginEnter();
	}
	
	@Test(enabled = true)
	public void LoginVerifyButton() throws IOException, InterruptedException{
		login.LoginButton();
	}
	
	@Test(enabled = true)
	public void MoreBtnTest() throws InterruptedException{
		login.VerifyMoreBtn();
		
		Thread.sleep(3000);
	}
	
	@Test(enabled = true)
	public void NotesTest() throws InterruptedException, AWTException{
		login.releaseNotesVerify();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void ClosetheBrowser(){
		
		driver.quit();
	}

}
