package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECommercePage {

    public ECommercePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(id = "email_create")
    public WebElement emailBox;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    public WebElement title;

    @FindBy(xpath = "//input[@name='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement bDay;

    @FindBy(id = "months")
    public WebElement bMonth;

    @FindBy(id = "years")
    public WebElement bYear;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(xpath = "//select[@name='id_state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement zip;

    @FindBy(xpath = "//select[@name='id_country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement homePhone;

    @FindBy(xpath = "//button[@name='submitAccount']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement signInBtn;





}
