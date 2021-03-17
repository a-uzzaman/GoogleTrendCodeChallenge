Feature: Google Trends for WebDriver vs WebDriverIO

Scenario: Verify the percentile ratio between WebDriver and WebDriverIO.
  Given That we are on google trends page
  When we search for "Selenium WebDriver" in google trends
  And compare with "Javascript WebDriverIO" in "US => New York" location in the "Past 90 days"
  Then Verify if Selenium WebDriver is more popular than WebdriverIO