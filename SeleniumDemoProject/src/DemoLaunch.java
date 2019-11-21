import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//to tell jvm that I have a  driver executable
		WebDriver driver=new ChromeDriver();                                           //to open browser
	   driver.manage().window().maximize(); //manage return type is options where windows method is present //to make full screen window                                      
		//driver.get("https://www.facebook.com/");                                    //entering URL to open facebook
	   driver.navigate().to("https://www.facebook.com/");                     //one more method to enter URL
	   Thread.sleep(5000) ;                                                  //using thread inbuilt method to stay in webpage for 5secs
	    //driver.close();                                         //to close web page     
        driver.navigate().back();                                 //to move backward
        Thread.sleep(5000);                         
        driver.navigate().forward();                               //to move backward
        Thread.sleep(5000);
        driver.navigate().refresh();                               //to refresh
        Thread.sleep(5000);
       
	}
	

}
