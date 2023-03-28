package com.flow;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_Types {

	public static void main(String[] args) {

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		//implicit wait-applicable only findelement,findelements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Explicit wait-webdriver wait-element dependent
		WebDriverWait n = new WebDriverWait(driver, Duration.ofSeconds(30));
		Boolean win_avail = n.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(win_avail);
	}

}
