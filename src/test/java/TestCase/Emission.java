package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.ModelFulTypeEmission;
import TestScript.SettingPage;

public class Emission extends BaseClass{
  @Test
  public void emissoionTestCase1() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  PageFactory.initElements(driver,ModelFulTypeEmission.class);
	  Thread.sleep(3000);
	  ModelFulTypeEmission.ClickOnEmissioPage.click();
	  
  }
  @Test
  public void emissoionTestCase2() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys(properties.getProperty("Emission"));
	  SettingPage.ClickOnSaveButton.click();  

  }
  
  @Test
  public void emissoionTestCase3() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys("  ");
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();
	  
	  
  }
  @Test
  public void emissoionTestCase4() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys(properties.getProperty("Emission"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();
  }
  
  @Test
  public void emissoionTestCase5() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  SettingPage.ClickOnClosePopup.click();
  }
  
  @Test
  public void emissoionTestCase6() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys(properties.getProperty("Emission"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();
  }
  
  @Test
  public void emissoionTestCase7() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys(properties.getProperty("Emission"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnMakesButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys("EmissionType01");
	  SettingPage.ClickOnSaveButton.click();     
  }
  
  @Test
  public void emissoionTestCase8() {
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  ModelFulTypeEmission.EnterEmissionType.sendKeys("EmissionType02");
	  SettingPage.ClickOnClosePopup.click();
	  ModelFulTypeEmission.ClickOnEmissionButton.click();
	  SettingPage.ClickOnSaveButton.click();  
	  
  }
}
