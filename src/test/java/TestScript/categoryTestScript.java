package TestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCase.BaseClass;

public class categoryTestScript extends BaseClass{
	
	@FindBy(xpath="//a[text()='Category']")
	public static WebElement ClickOnCategoryLinkPage;
	
	@FindBy(xpath="//button[text()='+ Vehicle Category']")
	public static WebElement ClickOnVehicleButton;
	
	
	public static void vehicleType() {
		String option = properties.getProperty("vehicleType");
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
	}
	
	@FindBy(xpath="//a[text()='Class']")
	public static WebElement ClickOnClassPage;
	
	
//	@FindBy(xpath="//input[@placeholder='Enter category Name']")
//	public static WebElement EnterCategoryType;
//	
	
	
	static String cat=properties.getProperty("categoryName");
	public static void EnterCategoryType(){
		
	String result=SettingPage.method(cat);
	WebElement Category = driver.findElement(By.xpath("//input[@placeholder='Enter category Name']"));
	Category.sendKeys(result);
	
	}
	
//	static int value=0;
//	 public static String method(String name){
//	      String result = name + value + 1;
//	    return result;
//    }
//	
	
	
	@FindBy(xpath="//textarea[@name='remark']")
	public static WebElement EnterRemarksType;
	
	
	@FindBy(xpath="//button[text()='+ Class']")
	public static WebElement ClickOnClassButton;
	
	@FindBy(xpath="//input[@placeholder='Enter vehicle Class']")
	public static WebElement EnterVehicleClassType;
	
	@FindBy(xpath="//button[text()='+ Make']")
	public static WebElement ClickOnMakeButton;
	
	@FindBy(xpath="//input[@placeholder='Enter Vehicle Make']")
	public static WebElement EnterVehicleMakeType;
	
	static String Class=properties.getProperty("VehicleClass");
	public static void EnterClassType(){
		
	String result=SettingPage.method(Class);
	WebElement Category = driver.findElement(By.xpath("//input[@placeholder='Enter vehicle Class']"));
	Category.sendKeys(result);
	
	}
	
	
	
   public static String  remark="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English";
	

   
   
   
}
