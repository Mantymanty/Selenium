package Gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Init_gen 
{
	public WebDriver driver;
	public Init_gen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
