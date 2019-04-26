package com.selenium.pages.web;

import com.selenium.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ClientPartnerSignupPage extends PageObject
{

    public ClientPartnerSignupPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "[data-agencysignupvalidationkey='agency_country']")
    public WebElement agencyCountry;

    @FindBy(css = "[data-agencysignupvalidationkey='state']")
    public WebElement state;

    @FindBy(css = "#list li:nth-child(1)")
    public WebElement listFirstOption;

    @FindBy(xpath = "//button[contains(@class, 'user-connection__button')]")
    public WebElement saveButton;

    @FindBy(id = "agencyName")
    public WebElement agencyName;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "managerEmail")
    public WebElement managerEmail;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "jobTitle")
    public WebElement jobTitle;

    @FindBy(id = "companyEmail")
    public WebElement companyEmail;

    @FindBy(id = "signup-agreement")
    public WebElement signupAgreement;



}