package com.seassignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'interview questions')]")).click();
		Thread.sleep(5000);
		List<WebElement> web=driver.findElements(By.xpath("//h3[@class=\"LC20lb\"]/span[@class=\"S3Uucc\"]"));
		for(WebElement a:web)
		{
			System.out.println(a.getText());
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-hveid=\"CAYQAA\"]/div/div/a/h3/span[@class=\"S3Uucc\"]")).click();
		
		
	}

}
