package com.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Alert {
	//simple alert
	//comform alert
	//prompt alert
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");
		
		
		//simple alert-accept
		WebElement simple_alert = driver.findElement(By.xpath("//button[@id='accept']"));
		simple_alert.click();
		
		
	   //gettext form alert
       org.openqa.selenium.Alert alt = driver.switchTo().alert();
       String text = alt.getText();
       System.out.println(text);
       alt.accept();
       //alt.dismiss();
       
       //conform alert
       WebElement conf = driver.findElement(By.xpath("//button[@id='confirm']"));
       conf.click();
       alt.dismiss();
       
       //prompt alert
       WebElement prompts = driver.findElement(By.xpath("//button[@id='prompt']"));
       prompts.click();
       alt.sendKeys("thanks");
       alt.accept();
       WebElement alt_text = driver.findElement(By.xpath("//p[@id='myName']"));
       String text2 = alt_text.getText();
       System.out.println(text2);
       
       
		
	}

}
