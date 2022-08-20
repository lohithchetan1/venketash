package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pom.SkillRaryLogin;
import pom.SkillRaryLogo;

public class SkillRaryTest extends BaseClass{

	
	@Test
	public void test1() {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();

		SkillRaryLogo s1=new SkillRaryLogo(driver);
		w.mouseHovering(driver, s1.getLogo());
		
		
	}

}
