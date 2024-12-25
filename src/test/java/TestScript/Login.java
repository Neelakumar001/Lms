package TestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCase.BaseClass;

public class Login extends BaseClass {
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement ClickOnEmailTextfield;

	@FindBy(xpath="//input[@name='password']")
	public static WebElement ClickOnpasswordTextfield;

	@FindBy(xpath="//button[@type='submit']")
	public static WebElement ClickOnLogin;
	
	
	public static void selectLane() { // method start
		driver.findElement(By.xpath("//div[@id='lane']")).click();

		String option = properties.getProperty("selectLane");
		List<WebElement> list = driver.findElements(By.xpath("//div[@tabindex='-1']//ul//li"));
		System.out.println("option"+option);

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

}
