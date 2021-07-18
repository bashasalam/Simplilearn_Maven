package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	XSSFWorkbook wbook;
    XSSFSheet sheet;



	 WebDriver driver;
//	public static void main(String[] args) {  removing to intro the testNG here
//		
// 
//      LoginTest  loginObject = new LoginTest();
//      
//      loginObject.setup();
//      loginObject.testCase1();
//      loginObject.clean();
//		
//	
//	
//	}
	
	@BeforeMethod
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		//To maximize the windows
		driver.manage().window().maximize();
		//To manage the timeouts ie it will wait if there is any objects else it will proceed.
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		FileInputStream fis = new FileInputStream("exceldata.xlsx");
		
		wbook = new XSSFWorkbook(fis);
	     sheet = wbook.getSheet("Sheet1");
	   //  System.out.println(sheet);


		
		
	}
	@Test
	@Parameters({"username","password"})
	public void testCase1(String username, String password1) {
		//To find the element in a wep page;
		
		WebElement logIn = driver.findElement(By.linkText("Log in"));
		
		logIn.click();	
		//User name element
		WebElement userName = driver.findElement(By.name("user_login"));
		WebElement password = driver.findElement(By.id("password"));
	//	WebElement rememberMe = driver.findElement(By.id("remember-me"));
		WebElement logInBtn = driver.findElement(By.name("btn_login"));
		WebElement Remember = driver.findElement(By.className("rememberMe"));
		
	//now enter the values
		
		//System.out.println(rememberMe);
		
		
		String excelUserName = sheet.getRow(0).getCell(0).getStringCellValue();
		String excelPassWord = sheet.getRow(0).getCell(1).getStringCellValue();
		
//		System.out.println(excelUserName);
//		System.out.println(excelPassWord);
		userName.sendKeys(excelUserName);
		password.sendKeys(excelPassWord);
		
//		userName.sendKeys(username);
//		password.sendKeys(password1);
		
		Remember.click();
		logInBtn.click();
		WebElement logInError = driver.findElement(By.className("error_msg"));
		WebElement errorText = driver.findElement(By.id("msg_box"));
		//String actError = logInError.getText();
		String actError = errorText.getText();
		String expError = "The email or password you have entered is invalid.";
		
//		if(actError.equals(expError)) {      now here we are going to introduce the assert
//			
//			System.out.println("Test case passed");
//		} else {
//			System.out.println("Test case Failed");
//		}
		
		
		Assert.assertEquals(actError, expError);// subahanallaah simple code 
		//Assert will work only inside the TESTNG test. that is inside the@Test
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links: " + links.size());
		
	}
	@AfterMethod
	public void clean(){
		
		driver.quit();
		
	}	

}
