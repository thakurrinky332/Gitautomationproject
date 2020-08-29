package com.facebook.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	WebDriver driver;

	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\software_2020_AT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	public void enterUsername() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("durgesh@rinky@yahoo.co.in");
	}

	public void enterPassword() {
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
	}

	public void clicklogbutton() {
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	}

	public void verifyLogin() {
		System.out.println("logged in successfully");
	}

	public void enterfirstname() {
		driver.findElement(By.xpath("//*[@id='u_f_b']")).sendKeys("durgesh");
	}

}