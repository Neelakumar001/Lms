package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestScript.gateEntryScript;
public class gateEntry extends BaseClass {
  @Test
  public void CreateGateEntry() {
 	   PageFactory.initElements(driver,gateEntryScript.class);
 	   gateEntryScript.ClickOnGateLinkPage.click();
 	   String gatePageUrl=driver.getCurrentUrl(); 
 	   System.out.println(gatePageUrl);
 	   gateEntryScript.ClickOnGateButton.click();
 	  
 	   
 	   
 	   
  }
}
