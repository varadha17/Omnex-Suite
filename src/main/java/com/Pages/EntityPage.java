package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	
	
}
