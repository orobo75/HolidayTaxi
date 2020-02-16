package com.Test.HolidayTaxis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateABookingPO {
    private WebDriver driver;

    //To Initialise Web element
    public CreateABookingPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy(css = "body > div.app.d-flex.w-100 > div.d-flex.flex-column.flex-fill > div.container.flex-fill > div.search-results.row > div:nth-child(1) > div.d-none.d-md-flex.d-lg-none > form > div.col-12.row.m-0.no-gutters.border-top > div.col-6.d-flex.justify-content-end > button")
//    private WebElement SelectProduct;

    @FindBy(id = "create_booking_passenger_details_firstname")
    private WebElement Firstname;


//    public void ctaSelectProduct() throws Throwable {
//        Thread.sleep(2000);
//
//        driver.switchTo().defaultContent();
//
//        Thread.sleep(2000);
//
//            SelectProduct.click();
//        }

    public void ctaFirstname (String passenger){
            Firstname.sendKeys(passenger);


        }


    }
