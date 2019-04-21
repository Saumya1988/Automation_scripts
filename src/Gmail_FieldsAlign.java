import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_FieldsAlign 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Saumya\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
int x=driver.findElement(By.id("email")).getLocation().getX();
System.out.println(x);

/*int x2=driver.findElement(By.id("next")).getLocation().getX();
if (x1==x2)
{
	System.out.println("value is same");
}
System.out.println("value is different");*/
	}
}

