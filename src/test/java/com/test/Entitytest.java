package com.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.Loginpage;
import com.base.BaseClass;

public class Entitytest extends BaseClass {

	public static EntityPage ent;
	public static Loginpage login;
	public static HomePage home;
	
	public Entitytest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void Begin() throws Exception{
		
		start();
		
		login = new Loginpage();
		
		home = login.LoginEnter();
		
		ent = home.EntityCheck(); 
		
		
	}
	
	
	@Test(enabled=true)
	public void EntitybtnTest() throws Exception{
		
		ent.EntityButton();
		
	}
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
	}
	
	

}
