package com.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class tooltip {

	@Test
	void tiptext() {

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement tip=driver.findElement(By.xpath("//input[@id='age']"));
		
		//tooltip
		String title=tip.getAttribute("title");
		System.out.println(title);
		
		driver.quit();
		
		
	}

}
