package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestScript.ModelFulTypeEmission;
import TestScript.SettingPage;
import TestScript.categoryTestScript;

public class FuelType extends BaseClass {
  @Test
  public void FulTypeTestCase1() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  PageFactory.initElements(driver,ModelFulTypeEmission.class);
	  Thread.sleep(3000);
	  ModelFulTypeEmission.ClickOnFuelTypePage.click();
  }
  
  @Test
  public void FulTypeTestCase2() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys(properties.getProperty("FullType"));
	  SettingPage.ClickOnSaveButton.click();  
  }
  @Test
  public void FulTypeTestCase3() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys("  ");
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();

	  
  }
  @Test
  public void FulTypeTestCase4() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys(properties.getProperty("FullType"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  
  }
  @Test
  public void FulTypeTestCase5() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  SettingPage.ClickOnClosePopup.click();  
  }
  @Test
  public void FulTypeTestCase6() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys(properties.getProperty("FullType"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();   
  }
  @Test
  public void FulTypeTestCase7() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys(properties.getProperty("FullType"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnMakesButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys("FulType01");
	  SettingPage.ClickOnSaveButton.click();     
  }
  @Test
  public void FulTypeTestCase8() {
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  ModelFulTypeEmission.EnterFulType.sendKeys("FulType02");
	  SettingPage.ClickOnClosePopup.click();
	  ModelFulTypeEmission.ClickOnFuelTypeButton.click();
	  SettingPage.ClickOnSaveButton.click();  
  }
}
