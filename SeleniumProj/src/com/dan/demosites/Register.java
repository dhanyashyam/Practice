package com.dan.demosites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\dhanyashyam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Danny");
		driver.findElement(By.name("lastName")).sendKeys("Demo");
		driver.findElement(By.name("city")).sendKeys("Winston");
		driver.findElement(By.name("email")).sendKeys("Danny");
		driver.findElement(By.name("password")).sendKeys("Demo123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Demo123");
		driver.findElement(By.name("register")).click();
		
		driver.findElement(By.linkText("Flights")).click();

	}

}
