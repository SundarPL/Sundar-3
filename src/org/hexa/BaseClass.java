package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();

	}
	public static void loadUrl(String url) {

		driver.get(url);
	}
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public static void fill(WebElement e,String name) {
		e.sendKeys(name);

	}
	public static void btnClick(WebElement f) {
		f.click();
	}
}

