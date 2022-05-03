package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaSeleniumPage;
import pomPages.SeleniumTraining;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{

	@Test
	public void tc3() throws IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchfield(pdata.getPropertyFileData("searchtext"));
		s.iconsearch();
		
		CoreJavaSeleniumPage cs = new CoreJavaSeleniumPage(driver);
		cs.javalink();
		driverutilities.switchFrames(driver);
		
		SeleniumTraining st = new SeleniumTraining(driver);
		st.play();
		st.pause();
		
		driverutilities.switchBackFrame(driver);
		st.wishlist();
	}
}
