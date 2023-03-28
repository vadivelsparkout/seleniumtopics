package com.flow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class right_Double_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/context_menu");
		
		WebElement context = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		//right click
		Actions a= new Actions(driver);
		a.contextClick(context).build().perform();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//double click
		//a.doubleClick(context).build().perform();
		
	}

}
