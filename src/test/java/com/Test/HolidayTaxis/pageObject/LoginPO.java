package com.Test.HolidayTaxis.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {
    private WebDriver driver;

    //To initialise Web element
    public LoginPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Define element locator
//    @FindBy (xpath = "//*[@id=\'example-navbar-collapse\']/ul/li[3]/ul/li[5]")
//    private WebElement Agents;

    @FindBy (id = "username")
    private WebElement UsernameField;

    @FindBy (id = "password")
    private WebElement PasswordField;

    @FindBy (xpath = "//button[text()='LOG IN']")
    private WebElement Login;



    //Log In
    public void Login (){
        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(Agents));
//        Agents.click();
        wait.until(ExpectedConditions.elementToBeClickable(UsernameField));
        UsernameField.sendKeys("QAGGM");
        wait.until(ExpectedConditions.elementToBeClickable(PasswordField));
        PasswordField.sendKeys("QAGGM");
        wait.until(ExpectedConditions.elementToBeClickable(Login));
        Login.click();

    }
}
