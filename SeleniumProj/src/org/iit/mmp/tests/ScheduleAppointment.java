
package org.iit.mmp.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScheduleAppointment {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Users\\dhanyashyam\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a/span[contains(text(),'Schedule')]")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		//driver.findElement(By.xpath("//tr/td/ul[@class='list-inline list-users']/li/h4[contains(text(),'Charlie')]")).click();

		driver.findElement(By.xpath("//tr/td/ul[@class='list-inline list-users']/li/h4[contains(text(),'Charlie')]/parent::li/parent::ul/following-sibling::button")).click();


		driver.switchTo().frame(driver.findElement(By.id("myframe")));  
		//driver.switchTo().frame("myframe");
		//String title = driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='myframe']"))).getTitle();  
		//System.out.println("PAge "+ title);

		// driver.switchTo().frame(driver.findElement(By.id("myframe")));  
		//driver.findElement(By.xpath("/p[1]/[@class= 'hasDatepicker']")).click();
		//driver.findElement(By.xpath("//html/body/p[1]/input[@class= 'hasDatepicker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/p[1]/input[@class= 'hasDatepicker']")).click();
		//driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		int count = driver.findElements(By.className("ui-state-default")).size();
		//System.out.println("PAge "+ count);
		
		/*while(!driver.findElement(By.cssSelector("[class='ui-datepicker-title'][class='ui-datepicker-month']")).getText().contains("June"))
				{
					driver.findElement(By.cssSelector("[class='ui-datepicker-next ui-corner-all'][class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
		*/
		
		for(int i =0;i<count;i++)
		{
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("22"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();
			}
		}
		



	}

}
