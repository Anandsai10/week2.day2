package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
			public static void main(String[] args) {
//				
//				 * //Pseudo Code
//				 * 
//				 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.opencart.com/index.php?route=account/register");
				
//				 * 
//				 * 2. Enter UserName and Password Using Id Locator
				driver.findElement(By.id("input-username")).sendKeys("AnandSai");
				driver.findElement(By.id("input-firstname")).sendKeys("Anand");
				driver.findElement(By.id("input-lastname")).sendKeys("G");
				driver.findElement(By.id("input-lastname")).sendKeys("anandsairam10@gmail.com");
				driver.findElement(By.id("input-country")).sendKeys("Iceland");
				driver.findElement(By.id("input-password")).sendKeys("leaf@12");
				driver.close();
				
			}

		}
