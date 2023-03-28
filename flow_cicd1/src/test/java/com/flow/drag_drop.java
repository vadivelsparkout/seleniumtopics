package com.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropable");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//drag and drop
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		
		int x = drag.getLocation().getX();
		int y = drag.getLocation().getY();
		//no need to get location of drop because drop based on coordinates
		
		a.dragAndDropBy(drop, x+70, y+80).build().perform();
		
	}

}
