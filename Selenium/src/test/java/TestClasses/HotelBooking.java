package TestClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBooking {
	@Test(priority=1)
	public void bookHotel() throws InterruptedException  {
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.chrome.driver", "D:\\Balu Data\\Data Upto 2 Oct 2024\\Testing\\Software Testing Softwares\\Softwares\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://in.hotels.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
		//driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[3]/div[2]/div[1]/div/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[2]/div[2]/div[1]/div/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[3]/div[2]/div[1]/div/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[4]/div[2]/div[1]/div/button[2]")).click();
//				Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//				
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[5]/div[2]/div[1]/div/button[2]")).click();
//				Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[6]/div[2]/div[1]/div/button[2]")).click();
//				Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[7]/div[2]/div[1]/div/button[2]")).click();
//				Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"traveler_selector_add_room\"]")).click();
//		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[8]/div[2]/div[1]/div/button[2]")).click();
// 
//		
//		for(int i=1; i<=7;i++)
//		{
//			driver.findElement(By.xpath("(//button[@id='traveler_selector_remove_room'])[1]")).click();
//		}
		for(int i=0; i<=5; i++)
		{
			driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[2]")).click();
			
			
		}
		for(int i=0; i<=3; i++)
		{
			driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[1]")).click();
			
		}
		
		WebElement Child2Age = driver.findElement(By.xpath("//select[@id='age-traveler_selector_children_age_selector-0-1']"));
		Child2Age.click();
		Select S=new Select(Child2Age);
	   System.out.println(S.isMultiple());
	   S.selectByValue("3");
	   List<WebElement> options1 = S.getOptions();

       // Print all options
       System.out.println("Dropdown values:");
       for (WebElement option : options1) {
           System.out.println(option.getText());
       }
	
	
		
		
	}
}
