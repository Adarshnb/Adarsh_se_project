package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(5000);
		WebElement search1=driver.findElement(By.name("q"));
		search1.clear();
		Thread.sleep(5000);
		search1.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		driver.close();
		
	}

}
