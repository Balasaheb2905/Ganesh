package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBook {
	
	@FindBy(xpath="(//div[@class='uitk-field has-floatedLabel-label has-icon'])[1]") private WebElement Goingto;
	@FindBy(xpath="(//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder'])[1]") private WebElement Dates;
	@FindBy(xpath="(//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder'])[2]") private WebElement Travellers;
	
public HotelBook(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
