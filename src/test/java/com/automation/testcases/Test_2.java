package com.automation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_2 
	{
	
	static WebDriver driver;
	public static void main(String[] args)
	
		{
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\geckodriver.exe");

		 driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sgupta/Downloads/QE-index.html#");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[contains(.,'Test 2')]//li"));
		int size = links.size();
		System.out.println(size);
		
		WebElement secondElement = driver.findElement(By.xpath("//div[contains(.,'Test 2')]//li[2]"));
		String text = secondElement.getText();
		System.out.println("Value for the second item is " + text);
		
		WebElement secondbadgeValue = driver.findElement(By.xpath("//div[contains(.,'Test 2')]//li[2]/span"));
		String text2 = secondbadgeValue.getText();
		System.out.println("Badge value for the second item is " + text2);
		
		driver.quit();
		}
		
		
	}


