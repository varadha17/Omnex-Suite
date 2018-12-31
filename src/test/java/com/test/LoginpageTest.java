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
	
	@Test (enabled = false, priority =1)
	public void GetNameVerify(){
		
		login.GetnameLoginPage();
	}
	
	@Test(enabled=false, priority =2)
	public void ImgVerify(){
		login.ImageDisplay();
	}
	
	@Test (enabled = false)
	public void GetBrokenLinks() throws MalformedURLException, IOException{
		
		login.BrokenLinksVerify();
	}
	
	@Test(enabled = false, priority =6)
	public void LoginVerify() throws IOException, InterruptedException{
		login.LoginEnter();
	}
	
	@Test(enabled = false, priority =5)
	public void LoginVerifyButton() throws IOException, InterruptedException{
		login.LoginButton();
	}
	
	@Test(enabled = false, priority =3)
	public void MoreBtnTest() throws InterruptedException{
		login.VerifyMoreBtn();
		
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority =4)
	public void NotesTest() throws InterruptedException, AWTException{
		login.releaseNotesVerify();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void ClosetheBrowser(){
		
		driver.quit();
	}

}
