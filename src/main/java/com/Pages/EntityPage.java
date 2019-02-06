package com.Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.waitdriver;
import com.base.BaseClass;

public class EntityPage extends BaseClass {

	public EntityPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@value='Entity Type']")
	WebElement EntityTypeBtn;
	
	@FindBy(id="tblEntityName")
	WebElement Entity;
	
	@FindBy(xpath="//input[@id='txtShortName']")
	WebElement EntityshortNmae;
	
	@FindBy(xpath="//span[text()='Select Entity Type']")
	WebElement EntityTypeOpt;
	
	@FindBy(xpath="//input[@value='Business Unit']")
	WebElement BusinessUnitBtn; 
	
	@FindBy(xpath="//input[@value='Site Function']")
	WebElement SiteFunctionBtn; 
	
	@FindBy(xpath="//input[@value='Refresh']")
	WebElement RefreshBtn;
	
	@FindBy(id="txtBusinessunit_chzn")
	WebElement BusinessUnitOpt;
	
	@FindBy(id="txtSitefun_chzn")
	WebElement SiteFunctionOpt;
	
	@FindBy(id="ddStatus")
	WebElement Status;
	
	@FindBy(id="ddIsSite")
	WebElement IsSite;
	
	@FindBy(id="txtAddressNew")
	WebElement AddressOpt;
	
	@FindBy(id="txtContactNoNew")
	WebElement ContactPerson;
	
	@FindBy(id="txtFaxNoNew")
	WebElement FaxDetails;
	
	@FindBy(id="Img1")
	WebElement CountryClick;
	
	@FindBy(id="Img2")
	WebElement StateClick;
	
	@FindBy(id="Img3")
	WebElement CityClick;
	
	@FindBy(id="txtBrachNoNew")
	WebElement BranchNumber;
	
	@FindBy(id="ddselCurrencyNew")
	WebElement CurrencyOpt;
	
	@FindBy(id="ddlRoute")
	WebElement Route;

	@FindBy(id="lblAddContactPer")
	WebElement AddContactPerson;
	
	@FindBy(id="AlinkS1")
	WebElement CorporateSite;
	
	@FindBy(id="Detailview")
	WebElement frames;
	
	@FindBy(xpath="//input[@id='btn_Grid_Businessunit_iladd']")
	WebElement EntityAdd;
	
	public void EntityButton() throws Exception{
		
		driver.switchTo().frame(frames);
		
		Thread.sleep(2000);
		
		EntityTypeBtn.click();
		
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		
		Iterator<String> i1 = handle.iterator();

		String parent = i1.next();
		
		String child = i1.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		
		
		
		//EntityAdd.click();
		
		String s1 = driver.getTitle();
		
		System.out.println(s1);
		
		if(s1.equals("Business Unit")){
			
			System.out.println("Display dailog");
			Thread.sleep(6000);
			EntityAdd.click();
			Thread.sleep(6000);
		}
		else{
			System.out.println("entity Dailog box not displaying");
			
		}
		
		
		
	}
	
	
}
