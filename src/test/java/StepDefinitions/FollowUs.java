package StepDefinitions;

import Pages.FollowUsPage;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class FollowUs {
  WebDriver driver = Driver.getDriver();
  FollowUsPage followUsPage = new FollowUsPage();

  @Given("the user navigate to main page")
  public void the_user_navigate_to_main_page() {
    driver.get(ConfigReader.getProperty("mainPageUrl"));
  }

  @When("the user clicked youtube icon")
  public void the_user_clicked_youtube_icon() {
    followUsPage.youtubeSocialBlock.click();


  }

  @Then("the user verifying youtube page")
  public void the_user_verifying_youtube_page() {
    BrowserUtils.switchWindow("Selenium Framework - YouTube");
//    BrowserUtils.switchWindow(driver);
    String actualTitle = driver.getTitle();
    String expectedTitle = "Selenium Framework - YouTube";
    Assert.assertEquals(expectedTitle, actualTitle);
  }

  @When("the user clicked facebook icon")
  public void the_user_clicked_facebook_icon() {
    System.out.println(driver.getTitle());
    followUsPage.facebookSocialBlock.click();
  }

  @Given("the user navigate to back main page")
  public void the_user_navigate_to_back_main_page() {
//    BrowserUtils.switchWindow(driver);
    Set<String> windowHandles = driver.getWindowHandles();
    System.out.println("number of handles: " + windowHandles.size());
    for (String handle :
            windowHandles) {
      if (!handle.equals(driver.getWindowHandle())) {
        driver.close();
        driver.switchTo().window(handle);
        System.out.print("Switched to a old window: ");
        System.out.println(driver.getTitle());
        break;
      }
    }
  }

  @Then("the user navigated facebook page and verify it")
  public void the_user_navigated_facebook_page_and_verify_it() {
    BrowserUtils.switchWindow("Selenium Framework Public Group | Facebook");
    String actualTitle = driver.getTitle();
    String expectedTitle = "Selenium Framework Public Group | Facebook";
    Assert.assertEquals(expectedTitle, actualTitle);
  }
}
