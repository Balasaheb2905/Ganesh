package LibraryFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
@Test
public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Balu Data\\Data Upto 2 Oct 2024\\Testing\\Software Testing Softwares\\Softwares\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https:\\www.gmail.com");
	
}}
