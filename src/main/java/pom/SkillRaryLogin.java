package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLogin {	
	@FindBy(id="email")
	private WebElement username;	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public SkillRaryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void un(String u) {
		username.sendKeys(u);
	}	
	public void pw(String p) {
		password.sendKeys(p);
	}	
	public void ln() {
		login.click();
	}
}


