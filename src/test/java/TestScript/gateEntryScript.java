package TestScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gateEntryScript {
	@FindBy(xpath="//a[text()='Gate Entry']")
	public static WebElement ClickOnGateLinkPage;
	
	@FindBy(xpath="//button[text()='+ Gate Entry']")
	public static WebElement ClickOnGateButton;
	
	@FindBy(xpath="//input[@name='license']")
	public static WebElement EnterTheLicensePlate;
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement ClickOnContinue;
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement EnterTheVIN;
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement EnterTheManufactureYear;
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement EnterTheRegisterYear;
	
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement EnterTheRegisterManufactureYear;
}
