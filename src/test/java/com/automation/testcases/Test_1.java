package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_1 {
	static WebDriver driver;

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\geckodriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sgupta/Downloads/QE-index.html#");

		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInButton.isDisplayed();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='inputEmail']"));
		username.isDisplayed();
		username.sendKeys("testassignment33@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword']"));
		password.isDisplayed();
		password.sendKeys("P@ssw0rd");

		driver.quit();
		
	}

}
