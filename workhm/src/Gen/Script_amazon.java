package Gen;

import java.util.Set;

import org.testng.annotations.Test;

public class Script_amazon extends Gen
{
	@Test
	public void ama() throws InterruptedException
	{
		String searchbag=excel_gen.getdata("Sheet1", 0,0);
		
		pom pm=new pom(driver);
		Thread.sleep(2000);
		pm.search(searchbag);
		Thread.sleep(2000);
		pm.searchbt();
		Thread.sleep(2000);
		pm.bagimg();
		Thread.sleep(2000);
//		String part=driver.getWindowHandle();
//		Set<String> all = driver.getWindowHandles();
//		all.remove(part);
//		for(String aa:all)
//		{
//			driver.switchTo().window(aa);
//		}
//		Thread.sleep(2000);
		pm.addtocart();
		Thread.sleep(2000);
	}
}
