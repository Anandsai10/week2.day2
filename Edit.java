package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		// chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// url
		driver.get("http://leafground.com/pages/Edit.html");
		// maximize
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("anandsairam10@gmail.com");
		driver.findElement(By.xpath("(//label[@for ='email'])[2]//following-sibling::input")).sendKeys("hi");
		boolean bvalue = driver.findElement(By.xpath("(//input[@name ='username'])[1]")).getAttribute("value").contains("TestLeaf");
		System.out.println("contains correct text : " +bvalue); 
		
		driver.findElement(By.xpath("(//input[@name ='username'])[2]")).clear();
		boolean bnewvalue = driver.findElement(By.xpath("//label[@for='disabled']//following-sibling::input")).isEnabled();
		System.out.println("is Enabled: " +bnewvalue );
		
		

	}

}
