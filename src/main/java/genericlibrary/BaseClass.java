package genericlibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public PropertyFile p=new PropertyFile();
	public WebdriverUtility w=new WebdriverUtility();
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		
	}
	
	@AfterMethod
	public void closeApp() {
	//	driver.close();
	}
	
	

}
