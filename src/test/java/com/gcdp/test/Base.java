package com.gcdp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public WebDriver driver = null;
	
	
	//public String url = "http://svr100c001t012.agr.gc.ca:4503/content/aafc-gcdp/en/signin.html";  //QA URL
	public String url = "http://svr100c001u02.agr.gc.ca:4503/content/aafc-gcdp/en/signin.html"; //UAT URL
	
	public String username = "kumar";
	public String password = "canada";

	{

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();

 	/*	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
 		driver = new FirefoxDriver(); */

	}
	
	public void exit() {
		driver.quit();
	}

	public void setUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void setAppURL(String url) {
		this.url = url;
	}

	public void login() {
		driver.navigate().to(this.url);
	/*	WebElement e = findByLink("Login");
		e.click(); */

		WebElement e = findElement("//*[@id=\"guideContainer-rootPanel-contact-userName___widget\"]");
		e.sendKeys(username);

		e = findElement("//*[@id=\"guideContainer-rootPanel-contact-password___widget\"]");
		e.sendKeys(password);

		e = findElement("//*[@id=\"guideContainer-rootPanel-contact-submit___widget\"]/span[2]");
		e.click();
	}

	public void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			throw new RuntimeException(e1);
		}
	}

	public void click(String xpath) {
		WebElement element = findElement(xpath);
		element.click();
	}

	public void selectFromDropdown(String xpath, String value) {
		WebElement e = findElement(xpath);
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	public WebElement findElement(String name) {
		try {
			WebElement element = driver.findElement(By.xpath(name));
			System.out.println("name: " + element.getText() + " : " + element.getTagName());
			return element;
		} catch (Exception e) {
			System.out.println("Not found: " + name);
			return null;
		}
	}

	public WebElement findByLink(String name) {
		try {
			WebElement element = driver.findElement(By.linkText(name));
			System.out.println("name: " + element.getText() + " : " + element.getTagName());
			return element;
		} catch (Exception e) {
			System.out.println("Not found: " + name);
			return null;
		}

	}
}
