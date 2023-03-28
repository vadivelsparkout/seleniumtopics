package com.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class window_handling {

	@Test
	void newtab() {

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/windows");

		//getting parent window
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		WebElement first = driver.findElement(By.xpath("//button[@id='home']"));
        first.click();
		
        //after click multiple window open-get all child window
		Set<String>window2=driver.getWindowHandles();
		System.out.println(window2);
		
		//storing all child into list
		List<String>list= new ArrayList<String>(window2);
		
		//switching to required child by using index
		driver.switchTo().window(list.get(1));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//switching to parent window
		driver.switchTo().window(window1);
		String win=driver.getCurrentUrl();
		System.out.println(win);
		
		
		//quit
		driver.quit();
		
		

	}
}
