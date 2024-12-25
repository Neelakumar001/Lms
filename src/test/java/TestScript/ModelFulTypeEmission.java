package TestScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelFulTypeEmission {
 /// model page script
	
	@FindBy(xpath="//a[text()='Model']")
	public static WebElement ClickOnModelPage;
	
	@FindBy(xpath="//button[text()='+ Model']")
	public static WebElement ClickOnModelButton;
	
//	@FindBy(xpath="//input[@name='vehicleModelName']//parent::div")
//	public static WebElement EnterThevehicleMode;

	//fuel-type page script
	
	@FindBy(xpath="//a[text()='Fuel Type']")
	public static WebElement ClickOnFuelTypePage;
	
	@FindBy(xpath="//button[text()='+ Fuel Type']")
	public static WebElement ClickOnFuelTypeButton;
	
	@FindBy(xpath="//input[@name='fuelTypeName']//parent::div")
	public static WebElement EnterFulType;
	
	//emission
	@FindBy(xpath="//a[text()='Emission Norms]")
	public static WebElement ClickOnEmissioPage;
	
	@FindBy(xpath="//button[text()='+ Emission Norms']")
	public static WebElement ClickOnEmissionButton;

	@FindBy(xpath="//input[@name='norm']//parent::div")
	public static WebElement EnterEmissionType;
	
	
	
}
