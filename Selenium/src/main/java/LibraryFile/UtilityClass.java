package LibraryFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass extends BaseClass{
	public static void Screenshot () throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Balu Data\\Data Upto 2 Oct 2024\\Testing\\software testing velocity Data");
		FileHandler.copy(src, dest);
	}
	
	public String captureScreenshot(String name) throws IOException
	{
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filePath="C:\\Users\\balas\\OneDrive\\Desktop\\New folder\\ "+name+"_"+timestamp+"screenshot.jpg";
		File dest= new File(filePath);
		FileHandler.copy(src, dest);
		return filePath;
	}
}
