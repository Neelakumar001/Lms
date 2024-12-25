package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.ModelFulTypeEmission;
import TestScript.SettingPage;
import TestScript.categoryTestScript;

public class Model extends BaseClass {
	//Click on model page link
  @Test
  public void ModelTestCase1() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  PageFactory.initElements(driver,ModelFulTypeEmission.class);
	 // SettingPage.SettingPage.click();
	  Thread.sleep(3000);
	  ModelFulTypeEmission.ClickOnModelPage.click();
    }
  @Test
public void ModelTestCase2() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(properties.getProperty("Model"));
	  SettingPage.ClickOnSaveButton.click(); 
  }
@Test
public void ModelTestCase3() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(" ");
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();
}

@Test
public void ModelTestCase4() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(properties.getProperty("Model"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();

}

@Test
public void ModelTestCase5() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  SettingPage.ClickOnClosePopup.click();
}


@Test
public void ModelTestCase6() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(properties.getProperty("Model"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnClosePopup.click();  
}


@Test
public void ModelTestCase7() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(properties.getProperty("Model"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnMakesButton.click();
	  SettingPage.ClickOnMakesType.sendKeys("model05");
	  SettingPage.ClickOnSaveButton.click();   
}
@Test
public void ModelTestCase8() {
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  ModelFulTypeEmission.EnterThevehicleMode.sendKeys(properties.getProperty("Model"));
	  SettingPage.ClickOnClosePopup.click();
	  ModelFulTypeEmission.ClickOnModelButton.click();
	  SettingPage.ClickOnSaveButton.click();
//not is  not cleared
	  
}


}
