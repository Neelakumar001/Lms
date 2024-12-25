package TestCase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.SettingPage;
public class SettingVehicle extends BaseClass{
  @Test
	//go to setting page
  public void VehicletestCase() {
  PageFactory.initElements(driver,SettingPage.class);
  SettingPage.SettingPage.click();
  System.out.println("PassMaintestCase"); 
  }
	//positve testCase
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase1() {
  PageFactory.initElements(driver,SettingPage.class);
  SettingPage.ClickOnVehicleButton.click();
  SettingPage.EnterVechileType.sendKeys(properties.getProperty("VechileType"));
  SettingPage.ClickOnSaveButton.click();
  System.out.println("PasstestCase1");
  }
  //in input field enter the space
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase2() {
  PageFactory.initElements(driver,SettingPage.class);
  SettingPage.ClickOnVehicleButton.click();
  SettingPage.EnterVechileType.sendKeys("  ");
//  SettingPage.ClickOnSaveButton.click();
  SettingPage.ClickOnClosePopup.click();
  System.out.println("PasstestCase2");

  }
  
  //with out enter
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase3() {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.ClickOnSaveButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  System.out.println("PasstestCase3");

 }// still issue (validation msg error)
  
//with out enter after click close popup
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase4() {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.ClickOnSaveButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  System.out.println("PasstestCase4");

	  
 }//still issue  
  //open popup after click on popup close button 
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase5() {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  System.out.println("PasstestCase5");

 }
  //first open the popup  after enter the data after click on reset button  
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase6() {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.EnterVechileType.sendKeys(properties.getProperty("VechileType"));
	  SettingPage.ClickOnResetButton.click();
	  System.out.println("PasstestCase6");
	  SettingPage.ClickOnClosePopup.click();
   }  
//first open the popup  after enter the data after click on close popup button
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase7() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.EnterVechileType.sendKeys(properties.getProperty("VechileType"));
	  SettingPage.ClickOnClosePopup.click();
	  System.out.println("PasstestCase7");
 }
  //1.first open the popup
  //2.enter the data
  //3.click on reset button
  //4.click on save button
  @Test(dependsOnMethods = { "VehicletestCase" })
  public void VehicletestCase8() throws InterruptedException {
	  PageFactory.initElements(driver,SettingPage.class);
	  SettingPage.ClickOnVehicleButton.click();
	  SettingPage.EnterVechileType.sendKeys(properties.getProperty("VechileType"));
	  SettingPage.ClickOnResetButton.click();
	  SettingPage.ClickOnSaveButton.click();
	  SettingPage.ClickOnClosePopup.click();
	  System.out.println("PasstestCase8");
 }
  
}
