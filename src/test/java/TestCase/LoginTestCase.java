package TestCase;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.Login;

public class LoginTestCase extends BaseClass{
      @Test(priority = 1)
      public static void login() throws IOException, InterruptedException {
  	   PageFactory.initElements(driver,Login.class);
  	  //Clear Auto suggestions
  	   Login.ClickOnEmailTextfield.clear();
	   Login.ClickOnpasswordTextfield.clear();
	   Thread.sleep(3000);
	  //Get Auto filled username
	   Login.ClickOnEmailTextfield.click();	
	   String inputFiled = Login.ClickOnEmailTextfield.getAttribute("value");
	   System.out.println(inputFiled);
	   //Check value is or not
  	   if(!inputFiled.isEmpty()) {
  	   Login.ClickOnEmailTextfield.sendKeys(Keys.CONTROL + "a");
       Login.ClickOnEmailTextfield.sendKeys(Keys.DELETE);
       Login.ClickOnEmailTextfield.sendKeys(properties.getProperty("user"));    
  	   }
  	   else {
  	   Login.ClickOnEmailTextfield.sendKeys(properties.getProperty("user"));
  	   }
      //PasswordField
      Thread.sleep(3000);
      //Get Auto filled password
      Login.ClickOnpasswordTextfield.click();
      String inputFiled2 = Login.ClickOnpasswordTextfield.getAttribute("value");
	  System.out.println(inputFiled2);
	  //Check value is or not
      if(!inputFiled2.isEmpty()) {
      Login.ClickOnpasswordTextfield.sendKeys(Keys.CONTROL + "a");
      Login.ClickOnpasswordTextfield.sendKeys(Keys.DELETE);
  	  Login.ClickOnpasswordTextfield.sendKeys(properties.getProperty("password"));
      }
      else {
      	  Login.ClickOnpasswordTextfield.sendKeys(properties.getProperty("password"));
      }
      Login.selectLane();
      //click on login button
      Login.ClickOnLogin.click();	  
	  if (driver.getTitle().equals("Expected Title of the Next Page")) {
            // Perform actions on successful login
        }
}
}
