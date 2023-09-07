package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;

public class AccessingAmazonHoverOnMenu 
{
	WebDriver driver;
	
	@BeforeTest
	public void StartApp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	public void Hover()
	{
		LandingPage land = new LandingPage(driver);
		land.hoverOnPointer();
	}
	
	@AfterTest
	public void CloseApp()
	{
		
	}
}
