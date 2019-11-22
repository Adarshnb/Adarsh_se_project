import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getWindowHandles());
		String s=driver.getWindowHandle();
		driver.close();
	}

}
