package StefDef;

import Base.Config;
import PageObjects.TrendsPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTrends extends Config {
    @Given("That we are on google trends page")
    public void thatWeAreOnGoogleTrendsPage() {

    }

    @When("we search for {string} in google trends")
    public void weSearchForInGoogleTrends(String arg0) {
        TrendsPageObjects tp= new TrendsPageObjects(driver);
        tp.searchTopic1();

    }

    @And("compare with {string} in {string} location in the {string}")
    public void compareWithInLocationInThe(String arg0, String arg1, String arg2) {
        TrendsPageObjects tp= new TrendsPageObjects(driver);
        tp.compareTopic();
    }

    @Then("Verify if Selenium WebDriver is more popular than WebdriverIO")
    public void verifyIfSeleniumWebDriverIsMorePopularThanWebdriverIO() {
    }
}
