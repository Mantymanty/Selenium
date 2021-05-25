package Gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom extends Init_gen
{
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mob;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement srch;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement srchcl;
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/I/817Z+jUvfzL._AC_UY218_.jpg']")
	private WebElement bagimgcl;
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocrtcl;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[2]")
	private WebElement mabandacc;
				
	public pom(WebDriver driver)
	{
		super(driver);
	}
	
	public void search(String searche)
	{
		srch.sendKeys(searche);
	}
	public void mobile()
	{
		mob.click();
	}
	public void searchbt()
	{
		srchcl.click();
	}
	public void bagimg()
	{
		bagimgcl.click();
	}
	public void addtocart()
	{
		addtocrtcl.click();
	}
	public void mobandaccer()
	{
		mabandacc.click();
	}
	
}
