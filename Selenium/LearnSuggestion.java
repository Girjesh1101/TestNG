package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSuggestion {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Girjesh\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> suggestion=driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		
		System.out.println(suggestion.size());
		
		
		for(WebElement suggestion_Name:suggestion) {
			
			String Suggestion_Value=suggestion_Name.getText();
			System.out.println(Suggestion_Value);
			
			if(Suggestion_Value.equalsIgnoreCase("selenium testing")) {
				suggestion_Name.click();
			}
		}
		
		
	}

}
