package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
	Thread.sleep(5000);
	List<WebElement>sug=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	Thread.sleep(2000);
	for(WebElement a:sug)
	{
		System.out.println(a.getText());
	}
	

}
}