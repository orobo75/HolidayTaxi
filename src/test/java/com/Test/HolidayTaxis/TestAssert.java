package com.Test.HolidayTaxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAssert {

    //This will verify page title
    public static boolean validatePageTitle(WebDriver driver, String expectedTitle) {
        boolean result = false;
        if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
            result = true;
        }
        return result;
    }

    //This will verify if Element exist
    public static boolean validateElementExistByXpath(WebDriver driver, String Xpath) {
        boolean result = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
            driver.findElement(By.xpath(Xpath));
            result = true;
        } catch (Exception e) {
        }
        return result;
    }

    public static boolean validateElementExistById(WebDriver driver, String Id) {
        boolean result = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.id(Id)));
            driver.findElement(By.id(Id));
            result = true;
        } catch (Exception e) {
        }
        return result;

    }
}
