package com.flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class basic_auth {
	@Test
	
	 void launch() {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
			
		 WebDriver driver = new ChromeDriver();
		
		 ChromeOptions options = new ChromeOptions();
		
		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");
		
		driver.manage().window().maximize();
		
		// https://username:password@test.com
	
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
		
		System.out.println("web page with basuc auth sucessfully entered");
		
		
	}
}

