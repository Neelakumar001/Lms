package TestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCase.BaseClass;

public class SettingPage extends BaseClass {
	
   static String VehicleClass=properties.getProperty("VehicleClass");
   
	
	@FindBy(xpath="//a[text()='Settings']")
	public static WebElement SettingPage;
	
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	public static WebElement SearchOption;
	
	@FindBy(xpath="//button[text()='+ Vehicle Type']")
	public static WebElement ClickOnVehicleButton;
	
	@FindBy(xpath="//button[text()='Save']")
	public static WebElement ClickOnSaveButton;
	
	@FindBy(xpath="//button[text()='Reset']")
	public static WebElement ClickOnResetButton;
	
	@FindBy(xpath="//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeMedium css-m5cpgq\"]")
	public static WebElement ClickOnClosePopup;
	
//	@FindBy(xpath="//input[@name='vehicleTypeName']")
//	public static WebElement EnterVechileType;
	
	@FindBy(xpath="(//button[@type=\"button\"])[4]")
	public static WebElement ClickOnEditButton;
	
	@FindBy(xpath="//button[text()='Update']")
	public static WebElement ClickOnUpdateButton;
	
	@FindBy(xpath="//div[@id='active']//parent::div//div")
	public static WebElement ClickOnStatus;
	
	 //choose status
	
	public static void SelectStatus() { // method start

		String option = properties.getProperty("Status");
		List<WebElement> list = driver.findElements(By.xpath("(//div[@tabindex='-1'])[2]//ul//li"));
		// System.out.println("option"+option);

		if (list.size() == 0) {
			System.out.println("No matching elements found in the list.");
			return;
		}
		for (WebElement webElement : list) {
			String text = webElement.getText();
			// System.out.println("text" +text);
			if (text.equalsIgnoreCase(option)) {
				try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
					WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(webElement));
					clickableElement.click();
					System.out.println("Clicked on the element successfully.");
				} catch (Exception e) {
					System.err.println("Error clicking on the element: " + e.getMessage());
				}
				break;
			}
		}

	} //method end
	

	@FindBy(xpath="//a[text()='Makes']")
	public static WebElement ClickOnMakesLink;
	
	@FindBy(xpath="//input[@name='vehicleMakeName']//parent::div")
	public static WebElement ClickOnMakesType;

	@FindBy(xpath="//a[text()='Makes']")
	public static WebElement ClickOnMakesButton;
	
	
     static int value=0;

	 public static String method(String name){
		      String result = name + value + 1;
		    return result;
         }
	 
	 public static void Vehicle() {
		 String Result = method(VehicleClass);
		WebElement send = driver.findElement(By.xpath("//input[@name='vehicleTypeName']"));
		send.sendKeys(Result);
		 
	 }
	
	
	

}
