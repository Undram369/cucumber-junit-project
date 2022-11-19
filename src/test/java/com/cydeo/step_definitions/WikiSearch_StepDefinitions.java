package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiSearch_StepDefinitions {

   WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.com");

    }
    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        WikiSearchPage.searchBox.sendKeys("Steve Jobs");

    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        WikiSearchPage.searchButton.click();

    }
    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue("Title verification is failed!",Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchKeyword) {
        WikiSearchPage.searchBox.sendKeys(searchKeyword);

        
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));

    }
}
