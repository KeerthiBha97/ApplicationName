package com.window;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Monitors']"))).click();
//		WebElement montiors = driver.findElement(By.xpath("//div[text()='Monitors']/parent::div/preceding-sibling::div"));
//		montiors.click();
//		driver.navigate().back();
		
		WebElement samsung = driver.findElement(By.xpath("//div[text()='Samsung Essential Series S3 55.88 cm (22 inch) Full HD LED Backlit IPS Panel with D-Sub, HDMI Flat Mon...']"));
		try
		{
		samsung.click();
		}
		catch(Exception  e)
		{
			samsung =driver.findElement(By.xpath("//div[text()='Samsung Essential Series S3 55.88 cm (22 inch) Full HD LED Backlit IPS Panel with D-Sub, HDMI Flat Mon...']"));
			samsung.click();

		}
		
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Two windows id"+ windows);
		List<String> all_windows = new ArrayList(windows);
		System.out.println(all_windows.get(0));
		driver.switchTo().window(all_windows.get(0));
		
		
		
		
		
		
	}

}
