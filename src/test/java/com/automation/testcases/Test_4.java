package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_4 {
	static WebDriver driver;
	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sgupta/Downloads/QE-index.html#");
		
		WebElement firstButton = driver.findElement(By.xpath
				("//h1[text()='Test 4']/following-sibling::button[text()='Button'][1]"));
		
		//Check if the first button is enabled
		if(firstButton.isEnabled())
		{
		System.out.println("First button is enabled");
		}
		else
		{
			System.out.println("First button is disabled");
		}
		
		WebElement secondButton = driver.findElement(By.xpath
				("//h1[text()='Test 4']/following-sibling::button[text()='Button'][@disabled]"));
		
		if(secondButton.isDisplayed())
		{
			System.out.println("Second button is disabled and is displayed");
		}
		else
		{
			System.out.println("Disabled second button is not displayed");

		}
		
		driver.quit();
	}

}
