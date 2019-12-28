package com.Test.HolidayTaxis.stepDefinition;

import com.Test.HolidayTaxis.DriverInstance;
import com.Test.HolidayTaxis.pageObject.FAQsPO;
import com.Test.HolidayTaxis.pageObject.Booking_LoginPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FAQs_step extends DriverInstance {
    private FAQsPO faq = new FAQsPO(driver);
    private Booking_LoginPO bl = new Booking_LoginPO(driver);


    @Given("^I log in to agent website$")
    public void iLogInToAgentWebsite()  {
        bl.Login();
    }

    @When("^I click cta FAQ$")
    public void iClickCtaFAQ()  {
        faq.ctaFAQs();
    }

    @Then("^FAQs page should displayed$")
    public void faqsPageShouldDisplayed()  {
        System.out.println(driver.getTitle());
    }


    @Then("^FAQsfeature should displayed$")
    public void faqsfeatureShouldDisplayed() {
        System.out.println(driver.getTitle());

    }


}
