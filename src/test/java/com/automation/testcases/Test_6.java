package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_6 {

	static WebDriver driver;
		    public static void main(String[] args) {
		       
		    	String path = System.getProperty("user.dir");
				System.out.println(path); 
				System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/sgupta/Downloads/QE-index.html#");	    	
		    	
				// Row 2, Column 2
		        String cellValue = getCellValue(driver, 2, 2); 
		        System.out.println("Cell Value- " + cellValue);
		        driver.quit();
		    }

		    public static String getCellValue(WebDriver driver, int row, int column) {
		        WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-dark']//tbody"));

		        WebElement targetRow = table.findElements(By.tagName("tr")).get(row);
		        WebElement targetCell = targetRow.findElements(By.tagName("td")).get(column);

		        return targetCell.getText();
		    }
		}

		
