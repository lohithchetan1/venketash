package screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener  {

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot t = (TakesScreenshot)DemoListner.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./screen/" + "a.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
