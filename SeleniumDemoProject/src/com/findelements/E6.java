package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String s1=driver.getTitle();
		System.out.println(s1);
		Thread.sleep(5000);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		Thread.sleep(5000);
		WebElement log=driver.findElement(By.id("loginButton"));
		log.click();
		Thread.sleep(5000);
		String s2=driver.getTitle();
		System.out.println(s2);
		if(s1!=s2)
			System.out.println("successfully logged in");
	    else
			System.out.println("failed login");
		
		
	}

}
