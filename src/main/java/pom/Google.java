package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
	//Decliration
	@FindBy(name="q")
	private WebElement textbox;
	
	//initilization
	public Google(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void tex(String sen) {
		textbox.sendKeys(sen);
	}
		
	

	}


