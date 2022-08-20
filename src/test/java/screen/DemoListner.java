package screen;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pom.SkillRaryLogin;

@Listeners(screen.ListnerTest.class)
public class DemoListner extends BaseClass {
	@Test
	public void TakeScree() {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();
		Assert.fail();
		
		
	}

}
