import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeProgram1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Saumya\\selenium\\Chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.actitime.com/");
driver.findElement(By.linkText("Start Using actiTIME")).click();
driver.close();
driver.quit();
	}

}
