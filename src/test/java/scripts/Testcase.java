package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase extends BaseClass{
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddtoCart a = new AddtoCart(driver);
		driverutilities.doubleClick(driver, a.getAdd());
		a.addtocart();
		
		
		
	}

}
