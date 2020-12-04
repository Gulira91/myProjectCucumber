package com.cybertek.step_definitions;


import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;


public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertTrue("in JUnit we pass the note before ", actualTitle.equals(expectedTitle));
        Assert.assertEquals(actualTitle, expectedTitle);
        // Assert.fail(); we are failing the test purposely

    }

    @When("User searches apple")
    public void userSearchesApple() {


        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="apple";

        Assert.assertEquals(expectedTitle,actualTitle);

    }



    @When("User searches {string}")// this is parameterization
    public void userSearches(String searchValue) {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();

        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);

    }


    @Then("User should see {string} in the title")//parameterization
    public void userShouldSeeInTheTitle(String expectedInTitle) {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=expectedInTitle+" - Google Search";

        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Then("User should see About link")
    public void userShouldSeeAboutLink() {

        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        // clicking to about link
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        String expectedTitle="Google - About Google, Our Culture & Company News";
        String actualTitle=Driver.getDriver().getTitle();
    }


    @Then("user should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings) {
        //System.out.println("linkStrings.size() = " + linkStrings.size());


        int expectedSize=linkStrings.size();
        int actualSize=googleSearchPage.footerLinks.size();

        Assert.assertEquals(expectedSize,actualSize);
    }

}


