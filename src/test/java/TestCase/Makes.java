package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.SettingPage;
import TestScript.categoryTestScript;

public class Makes extends BaseClass {
  @Test
  public void MakesTestcase1() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	//  SettingPage.SettingPage.click(); 
	  Thread.sleep(3000);
	  SettingPage.ClickOnMakesLink.click();  
  }
  
  @Test
  public void MakesTestcase2() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys(properties.getProperty("MakesTestcase"));
	  SettingPage.ClickOnSaveButton.click(); 
  }
  
  @Test
  public void MakesTestcase3() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys(" ");
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();
  }
  
  @Test
  public void MakesTestcase4() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys(properties.getProperty("MakesTestcase"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();
  }
  
  @Test
  public void MakesTestcase5() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys(properties.getProperty("MakesTestcase"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();
  }
  
  
  @Test
  public void MakesTestcase6() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();
  }
  @Test
  public void MakesTestcase7() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys(properties.getProperty("MakesTestcase"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys("markTest05");
	  SettingPage.ClickOnSaveButton.click(); 

  }
  
  @Test

  public void Testcase8() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.EnterVehicleClassType.sendKeys("markTest06");
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnSaveButton.click();
  }//data is not cleared
  
  
}
