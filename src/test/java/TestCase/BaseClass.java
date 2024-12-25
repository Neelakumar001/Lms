package TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
 
	   protected static Properties properties = null;
       static String browser =null;
       protected static  WebDriver driver=null;
       static String  website =null;
       
	   public static void main(String[] args) {
		  
		   BaseClass base = new BaseClass();
	        try {
	            base.browserOpen();
	                
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public Properties file() throws IOException {
	    	
	     try (FileInputStream stream = new FileInputStream("CommonFuctions1.Properties")) {
	            properties = new Properties();
	            properties.load(stream);
	        }
	        return properties;
	    }
	       @BeforeSuite
	    public void browserOpen() throws IOException {
	    	
	        file();
	        if (properties == null) {
	            System.out.println("Properties are null. Exiting.");
	            return;
	        }
	        String browser = properties.getProperty("browser");
	        
	        String url = properties.getProperty("url");
	        String website = properties.getProperty("website");

	        if (browser.equalsIgnoreCase("chrome")) {
	        	 driver = new ChromeDriver();
	            
	        } else if (browser.equalsIgnoreCase("firefox")) {
	     
	        	 driver =new FirefoxDriver();
	        } else {
	            System.out.println("Please choose Chrome or Firefox");
	            return;
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        if (url.equalsIgnoreCase(website)) {
	            driver.get(url);
	            System.out.println("URL: " + url);
	        } else {
	            System.out.println("URL: " + url);
	            System.out.println("Please check URL");
	           // driver.close();
	        }
	    }

	  
	  
 
	   
	   
	   
	   
   }

