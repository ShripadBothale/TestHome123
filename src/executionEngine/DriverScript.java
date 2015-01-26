package executionEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverScript {

	public static void main(String[] args) {
		

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.store.demoqa.com");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys("AutomationUser");
        driver.findElement(By.id("pwd")).sendKeys("yUBmk67fRjbc");
        driver.findElement(By.id("login")).click();
        driver.findElement (By.xpath("//*[text()='Log out']")).click();
//        driver.findElement (By.xpath("//*[@id='wp-admin-bar-logout']")).click();
      // driver.quit();

		
	}

}
