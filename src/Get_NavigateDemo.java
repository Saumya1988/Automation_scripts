import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_NavigateDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Saumya\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.google.com");
		Thread.sleep(3000);*/
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		//driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
		driver.quit();
	}

}
