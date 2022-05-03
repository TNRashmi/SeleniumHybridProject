package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		driverutilities.dropDown(sd.getAddressdropdown(), pdata.getPropertyFileData("datadropdown"));
		
		TestingPage t = new TestingPage(driver);
		driverutilities.draganddrop(driver, t.getSeleniumtraining(), t.getMycart());
		Point loc=t.getMycart().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver, x, y);
		
	}

}
