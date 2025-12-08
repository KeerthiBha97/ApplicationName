package com.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Switch to frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		
		//enter the data
		WebElement textbox =driver.findElement(By.xpath("//input[@name=\"mytext1\"]"));
		textbox.sendKeys("Test1");
		
		//Go back to the page
		driver.switchTo().defaultContent();
		
		//switch into the 3rd frame
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		
		//then switch into inner frame in 3rd frame
		driver.switchTo().frame(0);
		
		WebElement radio = driver.findElement(By.xpath("//span[text()='I am a human']/parent::div"));
		radio.click();
		
	   List<WebElement> checkbox = driver.findElements(By.xpath("//div[@role=\"checkbox\"]"));
	   for(WebElement c : checkbox)
	   {
	   if(!c.isSelected())
	   c.click();
	   }
	   
	   WebElement dropdownclick = driver.findElement(By.xpath("//div[@role=\"option\"]"));
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   dropdownclick.click();
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
	 //  js.executeScript("arguments[0].click();", yes);
//	   yes.click();
//	   WebElement yes = driver.findElement(By.xpath("//span[text()=\"Yes\"]"));
//	   WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(50));
//	   waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Yes\"]"))).click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   Actions action = new Actions(driver);
	   action.moveToElement(yes).build().perform();
//	   action.click(yes).build().perform();
//	   yes.click();
	   js.executeScript("arguments[0].click();", yes);
	   System.out.println("Test123");
//	   WebElement text = driver.findElement(By.xpath("//span[text()='Yes']"));
//	   text.click(); 
	   
	   
	   
	   driver.switchTo().defaultContent();
	   
	   WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
	   driver.switchTo().frame(frame5);
	   
	   WebElement text5 = driver.findElement(By.xpath("//input[@name=\"mytext5\"]"));
	   text5.sendKeys("Selenium");
	   
	   driver.findElement(By.tagName("a")).click();
	   
	
	   
	   
	   
	   
		
	}

}
