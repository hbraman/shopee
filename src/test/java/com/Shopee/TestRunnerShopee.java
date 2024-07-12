package com.Shopee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRunnerShopee {
	
	public static WebDriver driver;
	@Test(priority = -1)
	public static void getURL() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shopee.com/");

	}
	@Test(priority = 1)
	public static void selectCountry() {
		driver.findElement(By.xpath("//div[text()='Singapore']")).click();
	}
	//@Test(priority = 2)
	//public static void invalidLoginInput() throws InterruptedException {
//		Thread.sleep(4000);
//		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
//		e1.click();
//		//e1.sendKeys("shopee@123.gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("159357");
		//driver.findElement(By.xpath("//button[@class='oVeLwk']")).click();
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
	}
	
	
	
//	public static void main(String[] args) {
//		getURL();
//		selectCountry();
//	}


