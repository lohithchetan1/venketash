package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pom.SkillRaryLogin;
@Listeners(test.Listner.class)
public class Screen1 extends BaseClass{
	
	@Test
	public void test1() {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();
		Assert.fail();

}
}
