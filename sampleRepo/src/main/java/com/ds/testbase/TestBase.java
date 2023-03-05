package com.ds.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
@BeforeMethod	
public void setup()
 {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://www.apps.dalalstreet.ai/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }

@Test
public void test()
{
	System.out.println("working testbase class");
}

@AfterMethod
public void tearDown() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}
}
