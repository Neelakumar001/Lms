package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.SettingPage;
import TestScript.categoryTestScript;

public class VehicleClass extends BaseClass {
	//1.
  @Test
  public void Testcase1() throws InterruptedException {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  Thread.sleep(3000);
	  categoryTestScript.ClickOnClassPage.click();  
  }
  @Test

  public void Testcase2() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.EnterVehicleClassType.sendKeys(properties.getProperty("VehicleClass"));
	  SettingPage.ClickOnSaveButton.click();
  }
  @Test

  public void Testcase3() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.EnterVehicleClassType.sendKeys(" ");
	  SettingPage.ClickOnSaveButton.click();
	  SettingPage.ClickOnClosePopup.click();

  }
  @Test

  public void Testcase4() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.EnterVehicleClassType.sendKeys(properties.getProperty("VehicleClass"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click();
	  SettingPage.ClickOnClosePopup.click();

  }
  @Test

  public void Testcase5() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.vehicleType();
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  categoryTestScript.ClickOnClassButton.click();
	  SettingPage.ClickOnClosePopup.click();	  
  }
  @Test

  public void Testcase6() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  SettingPage.ClickOnClosePopup.click();	  
  }
  @Test

  public void Testcase7() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.EnterVehicleClassType.sendKeys(properties.getProperty("VehicleClass"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.vehicleType();
	  SettingPage.ClickOnSaveButton.click();
  }
  
  @Test

  public void Testcase8() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnClassButton.click();
	  categoryTestScript.vehicleType();
	  SettingPage.ClickOnClosePopup.click();
	  categoryTestScript.ClickOnClassButton.click();
	  SettingPage.ClickOnSaveButton.click();
  }//data is not cleared
  
}
