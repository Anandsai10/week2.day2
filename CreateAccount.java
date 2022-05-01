package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

		public static void main(String[] args) {
//			
//			 * //Pseudo Code
//			 * 
//			 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/login");
			
//			 * 
//			 * 2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("leaf@12");
//			 * 
//			 * 3. Click on Login Button using Class Locator
			
			driver.findElement(By.xpath("//button[@class =\"btn btn-primary\"]")).click();
			
//			5. Get the title of the page and print
			
			//String titleName= driver.findElement(By.xpath("//title")).getText();
			 String titleName =driver.getTitle();
			System.out.println("Title Name is : " +titleName);  // title name is not printed IF WE USE XPATH
			 
//			6. Click on Log Out
			driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			
//			7. Close the browser (use -driver.close())
			
			driver.close();
			
		}

	}
