package Pages;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowUsPage {

  public FollowUsPage(){
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//li[@class='youtube']")
  public WebElement youtubeSocialBlock;

  @FindBy(xpath = "//li[@class='facebook']")
  public WebElement facebookSocialBlock;

}
