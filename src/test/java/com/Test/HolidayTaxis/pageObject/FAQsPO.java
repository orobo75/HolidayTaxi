package com.Test.HolidayTaxis.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FAQsPO<Question> {
    private WebDriver driver;
    private int text;

    //To initialise Web element
    public FAQsPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //To initialise element locator

    @FindBy (xpath = "//*[text()='FAQs']")
    private WebElement FAQs;




    public void ctaFAQs () {
        FAQs.click();
    }



}
