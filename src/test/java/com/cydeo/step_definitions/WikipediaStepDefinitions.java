package com.cydeo.step_definitions;

import com.cydeo.pagers.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String expectedTitle = string + " - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user sees {string} is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header(String string) {
        String actualHeader = wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(string, actualHeader);
    }


}
