package com.flow;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class handling_Cookie {

	String o = "new value date";

	@Test

	void launch() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Cookie first = new Cookie(o, "new date");
		driver.manage().addCookie(first);

		// capture all cookie from the browser
		Set<Cookie> cookie = driver.manage().getCookies();
		// driver.manage().getCookieNamed(null);-Return the list of all cookie
		// driver.manage().addCookie(null);-Return specific cookie named
		// driver.manage().deleteCookie(null);-delete a specific cookie
		// driver.manage().deleteCookieNamed(null);-delete a specific cookie named
		// driver.manage().deleteAllCookies();-delete all the cookie

		System.out.println(cookie);

		for (Cookie coo : cookie) {

			// available methods in cookie

			// coo.getDomain();
			// coo.getExpiry();
			// coo.getName();
			// coo.getPath();
			// coo.getSameSite();
			// coo.getValue();

			System.out.println(coo);
			if (coo.equals(o)) {
				System.out.println("cookie verifeid");
			} else {
				System.out.println("cookie not verified");
			}
		}
		// get total number of cookie
		System.out.println(cookie.size());

		// delete all the cookie from the browser
		driver.manage().deleteAllCookies();
		Set<Cookie> num = driver.manage().getCookies();
		System.out.println(num.size());
		driver.quit();

	}
}
