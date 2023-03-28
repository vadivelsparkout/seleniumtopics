package com.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame");
		
		//getting xpath of the frame and switch
		WebElement firstframe = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(firstframe);
		
		
		//diff methods to switch
		//driver.switchTo().frame(0)-giving index of the frame
		//driver.switchTo().frame(Name or id tag)-giving id or name of the frame
		
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
		name.sendKeys("user");
		WebElement pass = driver.findElement(By.xpath("//input[@name='lname']"));
		pass.sendKeys("123");
		
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(inner);
		
		
		//switching to parent frame-one step back(P-F1-F2)-----F2  TO  F1
		driver.switchTo().parentFrame();
		
		//F2  TO  P
		driver.switchTo().defaultContent();

	}

}
