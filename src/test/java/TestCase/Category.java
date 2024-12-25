package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestScript.SettingPage;
import TestScript.categoryTestScript;
@Test
public class Category extends BaseClass {
	
	//.Click On CategoryLinkPage
	public static void ClickOnCategory() {
    PageFactory.initElements(driver,categoryTestScript.class);
    categoryTestScript.ClickOnCategoryLinkPage.click();
	}
	//1.ClickOnVehicleButton
	//2.select the VehicleType
	//3.EnterCategoryName
	//4.EnterRemarks
	//5.click on save button
	
  @Test
  public void CategorynormalTestCase() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.vehicleType();
	  categoryTestScript.EnterCategoryType.sendKeys(properties.getProperty("categoryName"));
	  categoryTestScript.EnterRemarksType.sendKeys(properties.getProperty("Remarks"));
	  SettingPage.ClickOnSaveButton.click();   
  }
  
  //1.ClickOnVehicleButton
  //2.click on save button
  //3.click on popup close button,closed popup
  //output-->display  field is requiered

  @Test
  public void CategoryTestCase1() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  SettingPage.ClickOnSaveButton.click();   
	  SettingPage.ClickOnClosePopup.click();
  }
  
    //1.ClickOnVehicleButton
    //2.with out select vehicle type
    //3.EnterCategoryName
	//4.EnterRemarks
	//5.click on save button,closed popup
  //output-->display  field is requiered

  @Test
  public void CategoryTestCase2() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.EnterCategoryType.sendKeys(properties.getProperty("categoryName"));
	  categoryTestScript.EnterRemarksType.sendKeys(properties.getProperty("Remarks"));
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();

  }
  
   //1.ClickOnVehicleButton
   //2.select select vehicle type
   //3.with out EnterCategoryName
   //4.EnterRemarks
	//5.click on save button,closed popup
  //output-->display  field is requiered

  @Test
  public void CategoryTestCase3() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.vehicleType();
	  categoryTestScript.EnterRemarksType.sendKeys(properties.getProperty("Remarks"));
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();

  }
  //1.ClickOnVehicleButton
  //2.select select vehicle type
  //3.EnterCategoryName
  //4.With out EnterRemarks
  //5.click on save button,closed popup
  //output-->display  field is requiered
  @Test
  public void CategoryTestCase4() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.vehicleType();
	  categoryTestScript.EnterCategoryType.sendKeys(properties.getProperty("categoryName"));
	  SettingPage.ClickOnSaveButton.click(); 
	  SettingPage.ClickOnClosePopup.click();

  }
   //1.ClickOnVehicleButton
	//2.select the VehicleType
	//3.EnterCategoryName
	//4.EnterRemarks
	//5.click on reset button
  //output-->clear all data
  @Test
  public void CategorynormalTestCase5() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.vehicleType();
	  categoryTestScript.EnterCategoryType.sendKeys(properties.getProperty("categoryName"));
	  categoryTestScript.EnterRemarksType.sendKeys(properties.getProperty("Remarks"));
	  SettingPage.ClickOnResetButton.click();   
	  SettingPage.ClickOnClosePopup.click();

  }
    //1.ClickOnVehicleButton
 	//2.select the VehicleType
 	//3.EnterCategoryName
 	//4.EnterRemarks
 	//5.click on reset button
  //6.click on save button
  //output-->display  field is requiered  
  @Test
  public void CategorynormalTestCase6() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();
	  categoryTestScript.vehicleType();
	  categoryTestScript.EnterCategoryType.sendKeys(properties.getProperty("categoryName"));
	  categoryTestScript.EnterRemarksType.sendKeys(properties.getProperty("Remarks"));
	  SettingPage.ClickOnResetButton.click();   
  }
  //1.ClickOnVehicleButton
	//2.select the VehicleType
	//3.EnterCategoryName
	//4.In remark-->enter the 100 characters
	//5.click on save button
  @Test
  public void CategorynormalTestCase7() {
	  PageFactory.initElements(driver,categoryTestScript.class);
	  PageFactory.initElements(driver,SettingPage.class);
	  categoryTestScript.ClickOnVehicleButton.click();;
	  categoryTestScript.vehicleType();

	  //categoryTestScript.EnterRemarksType.sendKeys(remark);
	  SettingPage.ClickOnResetButton.click();   
  }
}
