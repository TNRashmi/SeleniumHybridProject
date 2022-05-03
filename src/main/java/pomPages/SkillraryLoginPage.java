package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.BaseClass;

public class SkillraryLoginPage{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtextfield;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	public void searchfield(String coursename) {
		searchtextfield.sendKeys(coursename);
	}
	
	public void iconsearch() {
		searchicon.click();
	}
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gearsbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}

}
