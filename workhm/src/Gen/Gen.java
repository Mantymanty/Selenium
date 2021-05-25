package Gen;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Gen implements brow
{
	public WebDriver driver;
	@BeforeMethod
	public void opbr()
	{
		System.setProperty(chrkey,chrval);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void cls(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Scrshot.scrnshot(driver);
		}
		driver.close();
	}
}
