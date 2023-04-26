package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokesh {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
      driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
			
	
		 
		
	}


}
