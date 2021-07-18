package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
		//	WebDriver driver = new FirefoxDriver();
			
			driver.get("https://en-gb.facebook.com/");
			//To maximize the windows
			driver.manage().window().maximize();
			//To manage the timeouts ie it will wait if there is any objects else it will proceed.
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement createNewAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
			
			// If we use the text for xpath no need to worry about the tags
			
			createNewAccount.click();
			
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
			WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			
			WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			
			WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
			
			WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
			
			WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
			
			WebElement radioButton = driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
			
			WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
			
			Select MonthDropDown = new Select(month);
			Select DayDropDown = new Select(day);

			Select YearDropDown = new Select(year);
			
			//MonthDropDown.selectByIndex(1);
			//MonthDropDown.selectByValue(1);
			MonthDropDown.selectByVisibleText("Jan");
			DayDropDown.selectByVisibleText("5");
			YearDropDown.selectByVisibleText("1987");
			
			
			firstName.sendKeys("abcdef");
			lastName.sendKeys("ghijk");
			email.sendKeys("abc@xyz.com");
			confirmEmail.sendKeys("abc@xyz.com");
			password.sendKeys("abcdefghijk");
			
			radioButton.click();
			
			signUpButton.click();
			

		

	}

}
