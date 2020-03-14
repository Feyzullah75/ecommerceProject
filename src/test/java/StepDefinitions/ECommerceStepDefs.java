package StepDefinitions;

import Pages.ECommercePage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class ECommerceStepDefs {



    ECommercePage eCommercePage=new ECommercePage();
    WebDriver driver= Driver.getDriver();

    @When("The user click sign in button")
    public void the_user_click_sign_in_button() {
       driver.manage().window().fullscreen();
        eCommercePage.signInButton.click();
    }

    @Given("The user navigate to automation practice website")
    public void the_user_navigate_to_automation_practice_website() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @Then("The user provide valid email {string}")
    public void the_user_provide_valid_email(String string) {

        eCommercePage.emailBox.sendKeys("payzyllaa@gmail.com");
    }

    @Then("The user click create an account button")
    public void the_user_click_create_an_account_button() throws InterruptedException {

        eCommercePage.createButton.click();
        Thread.sleep(3000);
        eCommercePage.title.click();

    }
    @Then("The user validate your personal info")
    public void the_user_validate_your_personal_info(Map<String,String> allInfo) throws InterruptedException {

        Thread.sleep(1000);
    eCommercePage.firstName.sendKeys(allInfo.get("FirstName"));
    eCommercePage.lastName.sendKeys(allInfo.get("LastName"));
    eCommercePage.password.sendKeys(allInfo.get("Password"));
        Select day = new Select(eCommercePage.bDay);
        day.selectByValue("2");
        Select month = new Select(eCommercePage.bMonth);
        month.selectByValue("1");
        Select year = new Select(eCommercePage.bYear);
        year.selectByValue("2000");
    eCommercePage.company.sendKeys(allInfo.get("Company"));
    eCommercePage.address.sendKeys(allInfo.get("Address"));
    eCommercePage.city.sendKeys(allInfo.get("City"));
    eCommercePage.state.sendKeys(allInfo.get("State"));
    eCommercePage.zip.sendKeys(allInfo.get("Zip"));
    eCommercePage.country.sendKeys(allInfo.get("Country"));
    eCommercePage.homePhone.sendKeys(allInfo.get("HomePhone"));




    }


    @Then("The user click register button")
    public void the_user_click_register_button() {

        eCommercePage.registerButton.click();
    }



}
