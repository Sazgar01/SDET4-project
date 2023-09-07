package com.amazon.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	Actions action;
	@FindBy( linkText = "Sign in")
	private WebElement hellosignup;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void hoverOnPointer()
	{
		action.moveToElement(hellosignup).build().perform();
	}
}
