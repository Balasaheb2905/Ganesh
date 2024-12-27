package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	@FindBy(id="email") private WebElement FaceBookUsernameEmail;
	@FindBy(id="pass") private WebElement FaceBookLoginPassword;
	@FindBy(xpath="//button[@name='login']") private WebElement FaceBookLoginButton;
	
	
	public FbLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterFaceBookUsernameEmail(String FaceBookUsername)
	{
		FaceBookUsernameEmail.sendKeys(FaceBookUsername);
	}
	public void enterFaceBookLoginPassword(String FaceBookPassword)
	{
		FaceBookLoginPassword.sendKeys(FaceBookPassword);
	}
	public void clickFaceBookLoginButton()
	{
		FaceBookLoginButton.click();
	}
}
