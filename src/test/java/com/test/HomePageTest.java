package com.test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.Loginpage;
import com.base.BaseClass;

public class HomePageTest extends BaseClass {

	public static Loginpage login;
	public static HomePage home;
	
	public HomePageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void StarttheBrowser() throws IOException, InterruptedException{
		
		start();
		
		login = new Loginpage();
		
		home = login.LoginEnter();
	}
	
	@Test(enabled=true)
	public void BrokenLinksTest() throws MalformedURLException, IOException{
		
		home.BrokenLinksVerify();
	}
	
	@Test(enabled=true)
	public void classframechecktest() throws InterruptedException{
		
		home.frameCheck();
	}
	
	@Test(enabled=true)
	public void OmnexImageTest(){
		
		home.OmnexImageVerify();
	}
	
	@Test(enabled=true)
	public void OmnexProductImageTest(){
		
		home.OmnexProductImageVerify();
	}
	
	@Test(enabled=true)
	public void LogoutTest() throws Exception{
		home.Logout();
		
	}
	
	@Test(enabled=true)
	public void EntityTest() throws InterruptedException, IOException{
		home.EntityCheck();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void ClosetheBrowser(){
		driver.quit();
	}
	
	
}
