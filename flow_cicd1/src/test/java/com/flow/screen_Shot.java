package com.flow;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

//import org.apache.commons.io;
public class screen_Shot {
	
	@Test
void screen() throws IOException, InterruptedException {
	

		System.setProperty("webdriver.http.factory", "jdk-http-client");

	WebDriver	driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		//screenshot
		
		File src2=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File trg2 =new File("D:\\version2023\\flow_cicd1\\ss_Shot\\new2.png");
		
		Files.copy(src2, trg2);
		
		Thread.sleep(10000);
		
		//partial screenshot
		
		WebElement taking=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		File src3=taking.getScreenshotAs(OutputType.FILE);
		
		File trg3 =new File("D:\\version2023\\flow_cicd1\\ss_Shot\\new3.png");
		
		Files.copy(src3, trg3);
		
		driver.quit();
		
}
}

