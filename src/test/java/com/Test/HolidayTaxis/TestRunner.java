package com.Test.HolidayTaxis;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = "@booking",
        format = {
                "pretty", "html:target/cucumber-html-report",
                "json:target/json/report_example.json"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)

public class TestRunner {

    @BeforeClass
    public static void setup() {

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
        Date curDate = new Date();
        java.lang.String strDate = sdf.format(curDate);
        String fileName = "E:\\Extent_Reports\\report" + strDate + ".html";
        ExtentProperties.INSTANCE.setReportPath(fileName);

    }

    @AfterClass
    public static void teardown() {

        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
