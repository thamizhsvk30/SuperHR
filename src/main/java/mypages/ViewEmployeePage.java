package mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewEmployeePage extends BasePage
{

	public ViewEmployeePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Search Parameters and clicking the tab
	private By Tab = By.xpath("//a[@ng-reflect-ng-class='']");
	private By Searchlist = By.xpath("//p[@class='view-name pl-2 m-0']");
	
	//Field in values
	private By Header = By.xpath("//p[@class='view-label']");
	private By namevalue = By.xpath("//p/span");
	private By otherfieldvalues = By.xpath("//p/span");
	private By otherfieldvalue = By.xpath("//p/span");
	
	//Verifying the tab details
	private By headervalue = By.xpath("//a[@class='ng-star-inserted']");
	
	public List<WebElement> Tabclick() 
	{
		return get_Elements(Tab);
	}
	
	public List<WebElement> searchlist() 
	{
		return get_Elements(Searchlist);
	}
	
	public List<WebElement> Header() 
	{
		return get_Elements(Header);
	}
	
	public WebElement namevalue() 
	{
		return get_Element(namevalue);
	}
	public List<WebElement> otherfieldvalues() 
	{
		return get_Elements(otherfieldvalues);
	}
	
	public List<WebElement> otherfieldvalue() 
	{
		return get_Elements(otherfieldvalue);
	}
	
	public void searchlist(String Firstname) throws InterruptedException 
	{
		//Enter the text in search field
		//searchemployee().sendKeys(Firstname);
		Thread.sleep(2000);
		int j = searchlist().size();
		for (int i = 0; i < j; i++) 
		{
			String elementText = searchlist().get(i).getText();
			if(elementText.equals(Firstname))
			{
				Thread.sleep(2000);
				searchlist().get(i).click();
				System.out.println("Found"+elementText);
				Thread.sleep(5000);
			}
			else
			{
				System.out.println("Name not found in the list");
			}
			System.out.println(elementText);
		}
	}
	
	public void pesronaldetailsverification(String Firstname) throws InterruptedException 
	{
		System.out.println("Pesronal details");
		System.out.println(Header().get(0).getText()+"-"+namevalue().getText());
		
		int m,j = Header().size();
		for (m=1; m < j;m++) 
		{
		    try 
		    {
		    	System.out.println(Header().get(m).getText()+"-"+otherfieldvalue().get(m).getText());
		    }
		    catch(ArrayIndexOutOfBoundsException e) 
		    {
		         System.out.println("The index you have entered is invalid");
		         System.out.println("Please enter an index number between 1 and 15");
		    }
			
		}
	}
	
	public void employeedetailsverification(String Firstname) throws InterruptedException 
	{
		System.out.println("Employment details");
		Tabclick().get(3).click();
		int j = Header().size();
		for (int i = 0; i < j; i++) 
		{
			System.out.println(Header().get(i).getText()+"-"+otherfieldvalue().get(i).getText());
		}
	}
	
	public void employeehistorydetailsverification(String Firstname) throws InterruptedException 
	{
		System.out.println("Employment History");
		Tabclick().get(4).click();
		int j = Header().size();
		for (int i = 0; i < j; i++) 
		{
			System.out.println(Header().get(i).getText()+"-"+otherfieldvalue().get(i).getText());
		}
	}
	
	public void statutorydetailsverification(String Firstname) throws InterruptedException 
	{
		System.out.println("Statutory Details");
		Tabclick().get(5).click();
		int j = Header().size();
		for (int i = 0; i < j; i++) 
		{
			System.out.println(Header().get(i).getText()+"-"+otherfieldvalue().get(i).getText());
		}
	}
}
