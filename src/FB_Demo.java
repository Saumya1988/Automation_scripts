import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Demo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Saumya\\selenium\\Chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.name("firstname")).sendKeys("ssaumya");
driver.findElement(By.name("lastname")).sendKeys("bbajpai");
driver.findElement(By.id("u_0_o")).sendKeys("9643022308");
driver.findElement(By.id("u_0_v")).sendKeys("Welcome123");
driver.findElement(By.id("day")).sendKeys("1");
driver.findElement(By.id("month")).sendKeys("Aug");
driver.findElement(By.id("year")).sendKeys("1988");
driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
driver.findElement(By.name("websubmit")).click();

	}

}
