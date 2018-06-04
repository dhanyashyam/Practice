package com.dan.testing;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	 
	public class IndeedTests {
	    FirefoxDriver driver;
	    public void invokeBrowser()
	    {
	        System.setProperty("webdriver.gecko.driver","C:\\Users\\dhanyashyam\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	        		FirefoxDriver driver = new FirefoxDriver();
	        driver.get("http://www.indeed.co.in");
	    }
	    public void enterJSDetails()
	    {
	        //Identify the element using id 'what' and enter the text 'Selenium'
	                driver.findElement(By.id("what")).sendKeys("Selenium");
	                driver.findElement(By.id("where")).clear();
	                driver.findElement(By.id("where")).sendKeys("Bangalore");
	                driver.findElement(By.id("fj")).click();
	    }
	     
	    @Test(description="Validate Job Search",priority=1)
	    public void validateJobSearch_TC_001(){
	         
	        invokeBrowser();
	        enterJSDetails();
	       // String actual = driver.findElement(By.className("summary")).getText();
	       // Assert.assertTrue(actual.contains("Selenium"));
	         
	    }
	   /* @Test(description="Validate Job Count",priority=2)
	    public void validateJobCount_TC_002(){
	         invokeBrowser();
	         enterJSDetails();
	         String actual = driver.findElement(By.id("searchCount")).getText();
	         Assert.assertTrue(Integer.parseInt(actual.split("")[5])>0);
	          
	         
	    }*/
	}

