package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alpha {
	WebDriver driver;

	@Test
	public void facebook() {	
		driver.get("https://www.facebook.com");
	}

	@Test
	public void manabadi() {	
		driver.get("https://www.manabadi.com");
	}

	@Test
	public void flipkart() {
		driver.get("https://www.flipkart.com");
	}

	@Test
	public void google() {
		driver.get("https://www.cricbuzz.com");
	}

	@Test
	public void cricbuzz() {	
		driver.get("https://www.google.com");
	}
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
