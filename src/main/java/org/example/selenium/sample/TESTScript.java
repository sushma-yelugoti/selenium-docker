package org.example.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTScript {

	static String  DRIVER_NAME="webdriver.chrome.driver";
	static String CHROME_PATH="/Users/sivajiyelugoti/Sushma/selenium-docker/src/main/resources/chromedriver";


	public static void main(String[] args) {

		try {

			//System.setProperty(DRIVER_NAME,CHROME_PATH);
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.amazon.co.uk/");
			Thread.sleep(3000);
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ap_email")).sendKeys("sushmap18@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("continue")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ap_password")).sendKeys("sushma4@8");
			Thread.sleep(3000);
			driver.findElement(By.id("signInSubmit")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}