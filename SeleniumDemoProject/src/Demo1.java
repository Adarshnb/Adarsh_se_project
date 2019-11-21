import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Object title=driver.getTitle();//used the get the title of the entered URL//String returntype
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());//non-static method present in WebDriver used tp get URL//string returntype*/
		String parent=driver.getWindowHandle();//this method switch the particular parent tab and aslo  its returns reference
		System.out.println(parent);
		Thread.sleep(5000);
		Set<String> wins=driver.getWindowHandles();//this method switch to every tab i.e parents as well child tabs/window and gives their ref.
		Thread.sleep(5000);
		/*wins.remove(parent);
		for(String win:wins)//closing child windows in forward without closing parent
		{
			System.out.println(win);
			Thread.sleep(2000);
			driver.switchTo().window(win).close();
		}*/
		
		//driver.quit();//used to close all the tabs
		ArrayList<String> ls=new ArrayList<>(wins);//closing parent and child windows in rev order or (ls.addAll(wins))
		for(int i=ls.size()-1;i>=0;i--)
		{
			System.out.println(ls.get(i));
			Thread.sleep(1000);
			driver.switchTo().window(ls.get(i)).close();
		}
	}

}
