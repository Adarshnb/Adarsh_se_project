package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));//to access the web elements
		System.out.println(email);
		email.sendKeys("Adarshnb18@gmail.com");             //sending string to email textfield
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("9663187586");
		WebElement log=driver.findElement(By.id("loginbutton"));
		log.click();
		System.out.println(log);
		driver.quit();
	}

}
