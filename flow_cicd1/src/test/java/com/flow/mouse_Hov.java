package com.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouse_Hov {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
		void launch() {
			System.setProperty("webdriver.http.factory", "jdk-http-client");

			WebDriver driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
			
			
			//action class
			Actions a=new Actions(driver);
			a.moveToElement(fashion).build().perform();
			
			WebElement foot = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
			a.moveToElement(foot).build().perform();
			
	}

}

