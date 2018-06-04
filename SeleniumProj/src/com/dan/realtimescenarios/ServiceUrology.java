package com.dan.realtimescenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceUrology {

	private static final TimeUnit SECONDS = null;
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\dhanyashyam\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/appointmentschedulingui/manageAppointmentTypes.page");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.xpath("//form[@id='login-form']")).submit();
		boolean result = verifyServiceType("Urology");
		//boolean result = verifyServiceType("Dermatology");
		System.out.println(result);
	 

	}
	public static boolean verifyServiceType(String sName) throws InterruptedException
	{
		boolean result=false ; 
		List<WebElement> pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));
		List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
		//System.out.println(pageList);
		//Example for Nested for loop
		System.out.println(pageList.size());
		outerloop:
		for(int i = 0 ; i< pageList.size();i++)
		{
			System.out.println("loop " + i);
			//System.out.println(tdList);
			for(int j=0;j<tdList.size();j++)
			{
				System.out.println(tdList.get(j).getText());
				if(tdList.get(j).getText().contains(sName))
				{
					System.out.println("Service Type Found!!!");
					result = true;
					break outerloop;
				}
			}
			pageList =driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a")); 
			pageList.get(i+1).click();

	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
			//tdList.clear();
			//System.out.println(tdList.size());
			
			
	        tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
	       // System.out.println(tdList);
		}
		return result;
	}
}
