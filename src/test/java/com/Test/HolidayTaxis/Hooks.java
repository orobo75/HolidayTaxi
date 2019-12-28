package com.Test.HolidayTaxis;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.Test.HolidayTaxis.DriverInstance.driver;

public class Hooks {

    DriverInstance dm=new DriverInstance();

    //This will open the browser
    @Before
    public void setUp()  {
        dm.openBrowser();
    }


    //This will close the browser
    @After
    public void tearDown(Scenario scenario) {

        System.out.println(scenario.isFailed());
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");

        }
        dm.closeBrowser();
    }
}
