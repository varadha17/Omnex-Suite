package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public BaseClass() throws IOException{
		
		prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Avinash\\workspace\\Dummy\\src\\main\\java\\com\\Properties\\config.properties");
		
		prop.load(file);
		
		
	}
	
	public void start(){
		
		String s = prop.getProperty("browser");
		
		if(s.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avinash\\Downloads\\jar files\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if(s.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Avinash\\Downloads\\geckodriver.exe");
		
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	

}
