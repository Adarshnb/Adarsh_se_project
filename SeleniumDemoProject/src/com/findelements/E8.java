package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//label[@for=\"email\"]"));
		System.out.println(email.getText());
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email.getText());
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//label[@for=\"pass\"]"));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pass.getText());
		
	}

}
