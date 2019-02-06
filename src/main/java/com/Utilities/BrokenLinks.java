package com.Utilities;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class BrokenLinks extends BaseClass {

	public BrokenLinks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void FindBrokenLinks() throws MalformedURLException, IOException{
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links:"+ list.size());
		
		List<WebElement> ActiveLinks = new ArrayList<WebElement>();
		
		for(int i=0; i<list.size();i++){
			
			if(list.get(i).getAttribute("href") != null && (!list.get(i).getAttribute("href").contains("javascript"))){
				
				ActiveLinks.add(list.get(i));
				
				
			}
			
		}
		
		System.out.println("List of ActiveLinks:"+ ActiveLinks.size());
		
		for(int j=0; j<ActiveLinks.size();j++){
			
			HttpURLConnection url = (HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href")).openConnection();
			
			url.connect();
			
			String s1 = url.getResponseMessage();
			
			url.disconnect();
			
			System.out.println(ActiveLinks.get(j).getAttribute("href")+"--------->"+s1);
		}
	}
}
