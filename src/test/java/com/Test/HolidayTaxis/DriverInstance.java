package com.Test.HolidayTaxis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class DriverInstance {
    public static WebDriver driver;
    public static String targetBrowser;


    //This will open the browser
    public void openBrowser() {
        ResourceBundle conFig = ResourceBundle.getBundle("conFig");
        String  browserType = conFig.getString("browser");
        String headless = conFig.getString("headless");

        targetBrowser = System.getProperty("targetBrowser",browserType);


        //Check if parameter passed as 'Chrome'
        if (targetBrowser.equalsIgnoreCase("Chrome")) {
            //set path to Chrome.exe
            //System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();

            if(headless.equalsIgnoreCase("true")){

                chromeOptions.addArguments
                        ("--headless","--disable-gpu","window-size=1920,1200");
            }

            //create Chrome instance
            driver = new ChromeDriver(chromeOptions);

            //Check if parameter passed as 'Firefox'
        } else if (targetBrowser.equalsIgnoreCase("Firefox")) {
            //set path to Firefox.exe
            //System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
            WebDriverManager.firefoxdriver().setup();
            //create Firefox instance
            driver = new FirefoxDriver();
        }

        else{


//            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
//            driver = new ChromeDriver();            //Comment to run chrome headless

//            System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
//            driver = new FirefoxDriver();


        }


        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, opts);


        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(conFig.getString("URL"));
        driver.manage().window().maximize();


    }

    //This will close the browser
    public void closeBrowser() {

        //driver.quit();
    }
}
