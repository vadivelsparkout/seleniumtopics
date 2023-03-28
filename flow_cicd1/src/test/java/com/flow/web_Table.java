package com.flow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class web_Table {

	// find number of table present in page inspect-ctrl+f--//table
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/table");

		WebElement table1 = driver.findElement(By.xpath("//table[@id='simpletable']"));

		// finding table headers in table
		List<WebElement> table_head = table1.findElements(By.tagName("th"));
		int col_size = table_head.size();
		System.out.println(col_size);
		for (WebElement head : table_head) {
			System.out.println(head.getText());

		}
		// finding rows and number of rows in a table
		List<WebElement> table_r1 = table1.findElements(By.xpath("//table[@id='simpletable']//tbody/tr"));
		int rowsize = table_r1.size();
		System.out.println(rowsize);
		for (WebElement r1 : table_r1) {
			System.out.println(r1.getText());
		}

		// printing perticular row data
		for (WebElement r : table_r1) {
			List<WebElement> r1 = r.findElements(By.tagName("td"));// getting data in row
			WebElement r1_table = r1.get(0);// first row -index 0
			String text = r1_table.getText();
			System.out.println(text);// getting index 0 text

			// click one perticular data in table rows
			if (text.equalsIgnoreCase("Yashwanth")) {
				WebElement nw = r1.get(3);
				WebElement n1 = nw.findElement(By.tagName("input"));
				n1.click();
				System.out.println("clicked");
				Thread.sleep(2000);
				break;
			}

		}
		driver.quit();
	}
}
