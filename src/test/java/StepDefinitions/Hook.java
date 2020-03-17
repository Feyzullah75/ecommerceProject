package StepDefinitions;

import Utils.BrowserUtils;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook {


  WebDriver driver;
  // It will run before every scenario
  @Before
  public void setUpDriver(){
    driver= Driver.getDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }

  @After
  public void tearDown(Scenario scenario) throws IOException {

    if(scenario.isFailed()){

      BrowserUtils.takeScreenShot();
    }

  }
}
