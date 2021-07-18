package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
//	
		
		
        WebElement CustId = driver.findElement(By.xpath("//*[@name='cusid']"));
        
        WebElement Submit = driver.findElement(By.xpath("//*[@name='submit']"));
    	driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		


		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
//		driver.findElement(By.name("cusid")).sendKeys("12345");
//		driver.findElement(By.name("submit")).submit();
		
		driver.findElement(By.id("promtButton")).click();
		 
		Alert obj = driver.switchTo().alert();
		 
		 
		System.out.println("Error " + obj.getText());
		 
		obj.sendKeys("Hi");
		Thread.sleep(2000);
		 obj.accept();
		 //obj.dismiss();
		 
		 // Two websites on the same program. it is an example for accept and cancel.
	}

}
