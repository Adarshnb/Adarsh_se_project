package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]")).click();
		/*WebElement dining=driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/span"));
		Thread.sleep(3000);
		dining.click();
		System.out.println(dining.getText());
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//input[@id=\"search\"]"));
		search.sendKeys(dining.getText());*/
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
		
	}

}
