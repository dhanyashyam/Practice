package com.dan.realtimescenarios;

import java.util.Random;

import com.dan.realtimescenarios.RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPatient {

	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Users\\dhanyashyam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "\\Users\\dhanyashyam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		//Click on Register button
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Random rnd = new Random();
		String username = "test"+rnd.nextInt(90);
		String password = "test";
		String email = "test"+rnd.nextInt(90)+"@gmail.com";
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.register(email,username,password);

	}
}
