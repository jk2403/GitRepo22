package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverSampleProgram {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("*****************"+driver.getTitle()+"****************");
		
		driver.quit();
		
		System.out.println("*****************Task Completed***********************");
	}
}
