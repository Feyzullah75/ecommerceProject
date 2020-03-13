package Pages;

import Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class ECommercePage {

    public ECommercePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

}
