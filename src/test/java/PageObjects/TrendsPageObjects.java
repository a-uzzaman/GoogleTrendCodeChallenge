package PageObjects;

import Base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TrendsPageObjects extends Config {

    public TrendsPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    //Page Objects
    @FindBy(how= How.ID, using = "input-254")
    WebElement topicSearch;

    @FindBy(how= How.XPATH, using = "//h2[@class='header-sub-title']")
    WebElement subTitle;

    @FindBy(how= How.XPATH, using = "//*[@class='add-term-icon']")
    WebElement addCompareButton;

    @FindBy(how= How.XPATH, using = "//input[@type='search']")
    List<WebElement> searchInput;

    @FindBy(how= How.XPATH, using = "//*[@class='hierarchy-select ng-pristine ng-valid']")
    List<WebElement> locationFilter;

    @FindBy(how= How.XPATH, using = "//md-select[contains(@aria-label,'Past 12 months')]")
    WebElement periodFilter;

    @FindBy(how= How.XPATH, using = "//div[contains(text(),'Past 90 days')]")
    WebElement periodSelector;

    @FindBy(how= How.XPATH, using = "//span[@class='progress-bar-multi-heat-volume']")
    WebElement ratioBar;


    public void searchTopic1(){
        topicSearch.click();
        topicSearch.sendKeys("selenium webdriver"+Keys.ENTER);
        Assert.assertTrue(subTitle.findElement(By.xpath("//span[contains(text(),'Explore')]")).isDisplayed());
    }

    public void compareTopic(){
        addCompareButton.click();
        searchInput.get(1).sendKeys("webdriverio"+Keys.ARROW_DOWN+Keys.ENTER);
        locationFilter.get(0).click();
        searchInput.get(3).sendKeys("New York"+Keys.ARROW_DOWN+Keys.ENTER);
    }




}
