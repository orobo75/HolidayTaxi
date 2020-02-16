package com.Test.HolidayTaxis.stepDefinition;

import com.Test.HolidayTaxis.DriverInstance;
import com.Test.HolidayTaxis.pageObject.FAQsPO;
import com.Test.HolidayTaxis.pageObject.LoginPO;
import com.Test.HolidayTaxis.pageObject.SearchPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FAQs_step extends DriverInstance {
    private FAQsPO faq = new FAQsPO(driver);
    private LoginPO bl = new LoginPO(driver);
    private SearchPO sea = new SearchPO(driver);


    @Given("^I log in to agent website$")
    public void iLogInToAgentWebsite()  {
        bl.Login();
    }

    @When("^I click cta FAQ$")
    public void iClickCtaFAQ()  {
        //faq.ctaFAQs();
        sea.Search();

    }

//    @Then("^FAQs page should displayed$")
//    public void faqsPageShouldDisplayed()  {
//        System.out.println(driver.getTitle());
//    }





}
