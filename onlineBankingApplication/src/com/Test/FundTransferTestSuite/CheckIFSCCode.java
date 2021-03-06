package com.Test.FundTransferTestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckIFSCCode {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch website
		
		// Test name: Check IFSC Code
		// Step # | name | target | value
	    // 1 | open | LoginPage.jsp | 
		driver.get("http://localhost:8092/OnlineBankingApplication/LoginPage.jsp");
		// 2 | type | name=uname | shivani.taru201@gmail.com
		driver.findElement(By.name("uname")).sendKeys("shivani.taru201@gmail.com");
		// 3 | type | name=pass | UsgrvQ85
	    driver.findElement(By.name("pass")).sendKeys("Vini1234");
	    // 4 | click | css=login_btn | 
	    driver.findElement(By.id("login_btn")).click();
	    
	    // Step # | name | target | value
	    // 1 | open | FundTransfer.jsp | 
	    driver.get("http://localhost:8092/OnlineBankingApplication/FundTransfer.jsp");
	    // 2 | type | id=remitterAccountNo | 2700001
	    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700001");
	    // 3 | type | id=beneficiaryAccountNo | 2700002
	    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700002");
	    // 4 | type | id=beneficiaryName | Vini
	    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
	    // 5 | type | id=IFSCCode | dvdf
	    driver.findElement(By.id("IFSCCode")).sendKeys("dvdf");
	    // 6 | click | css=.btn-primary | 
	    driver.findElement(By.cssSelector(".btn-primary")).click();


	}
}
