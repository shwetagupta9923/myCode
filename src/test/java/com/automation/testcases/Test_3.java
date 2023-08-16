package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_3 

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
			
			WebElement defaultSelected = driver.findElement(By.xpath
					("//div[contains(.,'Test 3')]//div[@class='dropdown']"));
			
			String defaultText = defaultSelected.getText();
			
			if(defaultText.equals("Option 1"))
			{
				System.out.println("Text matches");
			}
			else {
				System.out.println("Text doesn't match");
			} 
				
			//Open the dropdown
			
			WebElement openDropdown = driver.findElement(By.id("dropdownMenuButton"));
			openDropdown.click();
			
			//Select the Option 3 from the dropdown	
			
			WebElement thirdOption = driver.findElement(By.xpath
					("//div[contains(.,'Test 3')]//div[@class='dropdown-menu show']//a[text()='Option 3']"));
			thirdOption.click();
			
			//Get the text of the selected value in the dropdown
			String defaultText2 = defaultSelected.getText();
			System.out.println(defaultText2);
			
			driver.quit();
	}

}
