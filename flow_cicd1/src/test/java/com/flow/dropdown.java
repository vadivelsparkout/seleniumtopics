package com.flow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+ -increase the size of dom
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropdowns");
		
		WebElement d_down = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		//handling drop down
		Select a=new Select(d_down);
		a.selectByVisibleText(null);
		a.selectByValue(null);
		a.selectByIndex(0);
		a.deselectByIndex(0);
		a.deselectByValue(null);
		a.deselectByVisibleText(null);
		a.getAllSelectedOptions();
		a.deselectAll();
		//get all the available options
		List<WebElement> options2 = a.getOptions();
		for (WebElement opy : options2) {
			System.out.println(opy.getText());
			
		}
	}

}
