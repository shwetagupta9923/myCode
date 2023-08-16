package com.automation.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_5 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sgupta/Downloads/QE-index.html#");
		
		WebElement button = driver.findElement(By.xpath("//h1[text()='Test 5']//following-sibling::button[@id='test5-button']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		
		WebElement successMessage = driver.findElement(By.id("test5-alert"));
		String message = successMessage.getText();
		System.out.println(message);
		
		WebElement disabledButton = driver.findElement(By.xpath("//button[@id='test5-button'][@disabled]"));
		disabledButton.isDisplayed();
		
		driver.quit();
	}			
		

}
