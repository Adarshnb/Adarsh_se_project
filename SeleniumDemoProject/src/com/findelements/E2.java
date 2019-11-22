package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		WebElement uname=driver.findElement(By.id("identifierId"));
		uname.sendKeys("adarshnb");
		WebElement next=driver.findElement(By.id("identifierNext"));
		next.click();
		Thread.sleep(5000);
		//WebElement pas=driver.findElement(By.name("password"));
		//pas.sendKeys("9663187586");
		driver.findElement(By.name("password")).sendKeys("12354648",Keys.ENTER);
		//WebElement log=driver.findElement(By.id("passwordNext"));
		//log.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
