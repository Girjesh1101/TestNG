package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allBasicConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Girjesh\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getTitle());
		
		//if(url.equals(url))
		
		
	}

}
