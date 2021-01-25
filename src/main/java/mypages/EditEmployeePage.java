package mypages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditEmployeePage extends BasePage 
{

	public EditEmployeePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	private By Searchemployee = By.xpath("//input[@placeholder='Search by name…']");
	private By Searchlist = By.xpath("//p[@class='view-name pl-2 m-0']");
	
	//Edit personal details
	private By personaldetailtab = By.xpath("//p[@class='employee-head']");
	private By firstname = By.xpath("//input[@placeholder='Enter first name']");
	private By MiddleName = By.xpath("//input[@placeholder='Enter middle name']");
	private By Lastname = By.xpath("//input[@placeholder='Enter last name']");
	private By EmailAddress = By.xpath("//input[@placeholder='Enter email address']");
	private By Phonenumber = By.xpath("//input[@placeholder='Enter phone number']");
	private By EmergencyContactName = By.xpath("//input[@placeholder='Enter emergency contact name']");
	private By EmergencyContactPhoneNumber = By.xpath("//input[@placeholder='Enter emergency contact phone number']");
	private By EDOB = By.xpath("//input[@placeholder='DD/MM/YYYY']");
	private By DOBclickdate = By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
	private By Male = By.xpath("//input[@type='radio' and @ng-reflect-value='Male']");
	private By Female = By.xpath("//input[@type='radio' and @ng-reflect-value='Female']");
	private By others = By.xpath("//input[@type='radio' and @ng-reflect-value='Others']");
	private By ResidentialAddress = By.xpath("//textarea[@placeholder='Enter residential address']");
	private By Permanentaddresscheckbox = By.xpath("//span[@class='checkbox-checkmark']");
	private By Permanentaddress = By.xpath("//textarea[@placeholder='Enter permanent address']");
	private By Fathername = By.xpath("//input[@ng-reflect-name='father_name']");
	private By Mothername = By.xpath("//input[@ng-reflect-name='mother_name']");
	private By Spousename = By.xpath("//input[@ng-reflect-name='spouse_name']");
	private By Qualification = By.xpath("//input[@placeholder='Enter qualification']");
	private By Bloodgroup = By.xpath("//select[@ng-reflect-name='blood_group_id']");
	private By DependentName = By.xpath("//input[@placeholder='Enter name']");
	private By DependentRelationType = By.xpath("//select[@ng-reflect-name='relation_type_id']");
	private By DependentDOB = By.xpath("//input[@placeholder='DD/MM/YYYY']");
	private By DependentDOBclickdate = By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
	private By updatebutton = By.xpath("//button[@type='submit']");
	
	//Tab details other than personal details
	private By othetabs = By.xpath("//button[@Class='employee-menu active ng-star-inserted']");
	
	//Edit Employee details
	private By Edittab 		= By.xpath("//button[@class='employee-menu ng-star-inserted']");
	private By Employeetype = By.xpath("//select[@ng-reflect-name='employment_type_id']");
	private By Earningtype  = By.xpath("//select[@ng-reflect-name='earning_type_id']");
	private By Gross	    = By.xpath("//input[@placeholder='Enter gross salary']");
	private By State	    = By.xpath("//select[@ng-reflect-name='state_id']");
	private By City		    = By.xpath("//select[@ng-reflect-name='city_id']");
	private By Location     = By.xpath("//select[@ng-reflect-name='location_id']");
	private By Shift        = By.xpath("//select[@ng-reflect-name='shift_id']");
	private By Mode         = By.xpath("//select[@ng-reflect-name='checkin_available_option_id']");
	private By Roleid       = By.xpath("//select[@ng-reflect-name='role_id']");
	private By Designation  = By.xpath("//input[@placeholder='Enter designation']");
	private By Manager 		= By.xpath("//input[@role='combobox']");
	private By Supervisior  = By.xpath("//input[@role='combobox']");
	
	//Edit Employee History details
	private By Dates 				= By.xpath("//input[@placeholder='DD/MM/YYYY']");
	//Edit Employee History details
	private By Aadhar 		= By.xpath("//input[@placeholder='Enter aadhar number']");
	private By PAN	 		= By.xpath("//input[@placeholder='Enter PAN']");
	private By UAN	 		= By.xpath("//input[@placeholder='Enter UAN']");
	private By ESI 			= By.xpath("//input[@placeholder='Enter ESI number']");
	private By PF	 		= By.xpath("//input[@placeholder='Enter PF number']");
	private By BANKACCNU	= By.xpath("//input[@placeholder='Bank Account number']");
	private By IFSC			= By.xpath("//input[@placeholder='Enter IFSC code']");
	private By BANKNAME		= By.xpath("//input[@placeholder='Enter bank name']");
	private By NAMEINBANK	= By.xpath("//input[@ng-reflect-name='name_as_per_bank']");
	
	//Getting web elements in employee tab
	public WebElement editbutton() 
	{
		By Editbutton = By.xpath("//img[@alt='Edit' and @class='pr-1']");
		return get_Element(Editbutton);
	}
	
	public WebElement personaldetailtab() 
	{
		return get_Element(personaldetailtab);
	}
	
	public WebElement searchemployee() 
	{
		return get_Element(Searchemployee);
	}
	
	public List<WebElement> searchlist() 
	{
		return get_Elements(Searchlist);
	}
	
	//Getting the employee personal detail web elements
	public WebElement firstname() 
	{
		return get_Element(firstname);
	}
	
	public WebElement MiddleName() 
	{
		return get_Element(MiddleName);
	}
	
	public WebElement Lastname() 
	{
		return get_Element(Lastname);
	}
	
	public WebElement EmailAddress() 
	{
		return get_Element(EmailAddress);
	}
	
	public WebElement Phonenumber() 
	{
		return get_Element(Phonenumber);
	}
	
	public WebElement EmergencyContactName() 
	{
		return get_Element(EmergencyContactName);
	}
	
	public WebElement EmergencyContactPhoneNumber() 
	{
		return get_Element(EmergencyContactPhoneNumber);
	}
	
	public List<WebElement> get_date() 
	{
		return get_Elements(EDOB);
	}
	
	public WebElement DOBclick() 
	{
		return get_Element(DOBclickdate);
	}
	public WebElement Male() {
		return get_Element(Male);
	}

	public WebElement Female() {
		return get_Element(Female);
	}

	public WebElement Others() {
		return get_Element(others);
	}
	
	public WebElement ResidentialAddress() 
	{
		return get_Element(ResidentialAddress);
	}
	
	public WebElement Permanentaddresscheckbox() 
	{
		return get_Element(Permanentaddresscheckbox);
	}
	
	public WebElement Permanentaddress() 
	{
		return get_Element(Permanentaddress);
	}
	
	public WebElement Fathername() 
	{
		return get_Element(Fathername);
	}
	
	public WebElement Mothername() 
	{
		return get_Element(Mothername);
	}
	
	public WebElement Spousename() 
	{
		return get_Element(Spousename);
	}
	
	public WebElement Qualification() 
	{
		return get_Element(Qualification);
	}
		
	public Select Bloodgroup() 
	{
		return selectby(Bloodgroup);
	}
	
	public WebElement DependentName() 
	{
		return get_Element(DependentName);
	}
	
	public Select DependentRelationType() 
	{
		return selectby(DependentRelationType);
	}
	
	public WebElement DependentDOB() 
	{
		return get_Element(DependentDOB);
	}
	
	public WebElement DependentDOBclick() 
	{
		return get_Element(DependentDOBclickdate);
	}
	
	//Getting the list of tab in edit mode of employee
	public List<WebElement> gettab() 
	{
		return get_Elements(Edittab);
	}
	
	//Getting the employee detail web elements
	public Select Employeetype() 
	{
		return selectby(Employeetype);
	}
	
	public Select Earningtype() 
	{
		return selectby(Earningtype);
	}
	
	public WebElement Gross() 
	{
		return get_Element(Gross);
	}
	
	public Select State() 
	{
		return selectby(State);
	}
	public Select City() 
	{
		return selectby(City);
	}
	public Select Location() 
	{
		return selectby(Location);
	}
	public Select Shift() 
	{
		return selectby(Shift);
	}
	public Select Mode() 
	{
		return selectby(Mode);
	}
	public Select Roleid() 
	{
		return selectby(Roleid);
	}
	public WebElement Designation() 
	{
		return get_Element(Designation);
	}
	public WebElement Manager() 
	{
		return get_Element(Manager);
	}
	public WebElement Supervisior() 
	{
		return get_Element(Supervisior);
	}
	
	public List<WebElement> comobox() 
	{
		return get_Elements(Manager);
	}
	
	//Getting Employment History Details web elements
	public List<WebElement> Dates() 
	{
		return get_Elements(Dates);
	}
	
	public WebElement offerdateclickdate() 
	{
		By offerdateclickdate 	= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(offerdateclickdate);
	}
	public WebElement HDOJclickdate() 
	{
		By HDOJclickdate= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(HDOJclickdate);
	}
	public WebElement PStartdateclickdate() 
	{
		By PStartdateclickdate 	= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(PStartdateclickdate);
	}
	public WebElement EStartdateclickdate() 
	{
		By EStartdateclickdate 	= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(EStartdateclickdate);
	}
	public WebElement DORclickdate() 
	{
		By DORclickdate= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(DORclickdate);
	}
	public WebElement Lworkingdateclickdate() 
	{
		By Lworkingdateclickdate= By.xpath("//span[@ng-reflect-ng-class='[object Object]' and @tabindex='0']");
		return get_Element(Lworkingdateclickdate);
	}
	
	//Getting the Statuatoary web elements
	public WebElement Aadhar() 
	{
		return get_Element(Aadhar);
	}
	public WebElement PAN() 
	{
		return get_Element(PAN);
	}
	public WebElement UAN() 
	{
		return get_Element(UAN);
	}
	public WebElement ESI() 
	{
		return get_Element(ESI);
	}
	public WebElement PF() 
	{
		return get_Element(PF);
	}
	public WebElement BANKACCNU() 
	{
		return get_Element(BANKACCNU);
	}
	public WebElement IFSC() 
	{
		return get_Element(IFSC);
	}
	public WebElement BANKNAME() 
	{
		return get_Element(BANKNAME);
	}
	public WebElement NAMEINBANK() 
	{
		return get_Element(NAMEINBANK);
	}
	
	//Clicking the update button in edit mode of the employee
	public WebElement updatebutton() 
	{
		return get_Element(updatebutton);
	}
	
	//Clicking the employment tab
	public void employeetab() throws InterruptedException
	{
		By Configuration = By.xpath("//a[@ng-reflect-router-link='/employees']");
		Thread.sleep(5000);
		get_Element(Configuration).click();
		wait_For_clickable_WebElement(Configuration);
	}
	
	//Searching the employee name from the list
	public void searchemployeelist(String Firstname) throws InterruptedException 
	{
		//Enter the text in search field
		//searchemployee().sendKeys(Firstname);
		int j = searchlist().size();
		for (int i = 0; i < j; i++) 
		{
			String elementText = searchlist().get(i).getText();
			if(elementText.equals(Firstname))
			{
				try
				{
					System.out.println("Found-"+elementText);
					Thread.sleep(3000);
					searchlist().get(i).click();
				}
				catch(ElementClickInterceptedException e)
				{
					System.out.println("Found-"+elementText);
					Thread.sleep(3000);
					searchlist().get(i).click();
				}

			}
			else
			{
				System.out.println("Name not found in the list");
			}
			System.out.println(elementText);
		}
	}
	
	public void editingemployeedetails() throws InterruptedException, IOException 
	{
		String EditEmployee								=get_Property_Data("EditEmployee");
		ArrayList <String> phonenumber					=readexceldatas(EditEmployee,0);
		ArrayList <String> Firstname					=readexceldatas(EditEmployee,1);
		ArrayList <String> Middlename					=readexceldatas(EditEmployee,2);
		ArrayList <String> Lastname						=readexceldatas(EditEmployee,3);
		ArrayList <String> EmailAddress					=readexceldatas(EditEmployee,4);
		ArrayList <String> EmergencyContactName			=readexceldatas(EditEmployee,5);
		ArrayList <String> EmergencyContactPhoneNumber	=readexceldatas(EditEmployee,6);
		ArrayList <String> EDOB							=readexceldatas(EditEmployee,7);
		ArrayList <String> Resenditaladdress			=readexceldatas(EditEmployee,8);
		ArrayList <String> Gender						=readexceldatas(EditEmployee,9);
		ArrayList <String> permanent 					=readexceldatas(EditEmployee,10);
		ArrayList <String> Permanentaddress				=readexceldatas(EditEmployee,11);
		ArrayList <String> Fathername					=readexceldatas(EditEmployee,12);
		ArrayList <String> Mothername					=readexceldatas(EditEmployee,13);
		ArrayList <String> Spousename					=readexceldatas(EditEmployee,14);
		ArrayList <String> Qualification				=readexceldatas(EditEmployee,15);
		ArrayList <String> Bloodgroup					=readexceldatas(EditEmployee,16);
		ArrayList <String> DependentName				=readexceldatas(EditEmployee,17);
		ArrayList <String> DependentRelationType		=readexceldatas(EditEmployee,18);	
		ArrayList <String> DependentDOB					=readexceldatas(EditEmployee,19);
		ArrayList <String> Employeetype					=readexceldatas(EditEmployee,20);
		ArrayList <String> Earningtype					=readexceldatas(EditEmployee,21);
		ArrayList <String> Gross						=readexceldatas(EditEmployee,22);
		ArrayList <String> State						=readexceldatas(EditEmployee,23);
		ArrayList <String> City							=readexceldatas(EditEmployee,24);
		ArrayList <String> Location						=readexceldatas(EditEmployee,25);
		ArrayList <String> Shift						=readexceldatas(EditEmployee,26);
		ArrayList <String> Mode							=readexceldatas(EditEmployee,27);
		ArrayList <String> Roleid						=readexceldatas(EditEmployee,28);
		ArrayList <String> Designation					=readexceldatas(EditEmployee,29);
		ArrayList <String> Manager 						=readexceldatas(EditEmployee,30);
		ArrayList <String> Supervisior					=readexceldatas(EditEmployee,31);
		ArrayList <String> offerdate					=readexceldatas(EditEmployee,32);
		ArrayList <String> HDOJ							=readexceldatas(EditEmployee,33);
		ArrayList <String> PStartdate					=readexceldatas(EditEmployee,34);
		ArrayList <String> EStartdate					=readexceldatas(EditEmployee,35);
		ArrayList <String> DOR							=readexceldatas(EditEmployee,36);
		ArrayList <String> Lworkingdate					=readexceldatas(EditEmployee,37);
		ArrayList <String> Aadhar						=readexceldatas(EditEmployee,38);
		ArrayList <String> PAN							=readexceldatas(EditEmployee,39);
		ArrayList <String> UAN							=readexceldatas(EditEmployee,40);
		ArrayList <String> ESI							=readexceldatas(EditEmployee,41);
		ArrayList <String> PF							=readexceldatas(EditEmployee,42);
		ArrayList <String> BANKACCNU					=readexceldatas(EditEmployee,43);
		ArrayList <String> IFSC							=readexceldatas(EditEmployee,44);
		ArrayList <String> BANKNAME						=readexceldatas(EditEmployee,45);
        ArrayList <String> NAMEINBANK                   =readexceldatas(EditEmployee,46);                                                
		
		for(int i=0;i<Firstname.size();i++)
		{
			//Clicking the employee Tab
			employeetab();
			
			//Search the employee from the added list and clicking the employee
			searchemployeelist(Firstname.get(i));
			
			//Clicking the edit button from the listing
			Thread.sleep(3000);
			editbutton().click();
			Thread.sleep(3000);
			wait_For_WebElement(Phonenumber);
			
			//Filling the employee basic detail information validating the phonenumber from the sheet
			//personaldetailtab().click();
			if(Phonenumber().getAttribute("value").equalsIgnoreCase(phonenumber.get(i)))
			{
				System.out.println("Phone Number is validated sucessfully");
				wait_For_WebElement(firstname);
				firstname().clear();
				firstname().sendKeys(Firstname.get(i));
				MiddleName().sendKeys(Middlename.get(i));
				Lastname().sendKeys(Lastname.get(i));
				EmailAddress().sendKeys(EmailAddress.get(i));
				EmergencyContactName().sendKeys(EmergencyContactName.get(i));
				EmergencyContactPhoneNumber().sendKeys(EmergencyContactPhoneNumber.get(i));
				scrolldown();
				//get_date().get(0).clear();
				//Thread.sleep(5000);
				//get_date().get(0).sendKeys(EDOB);
				//Thread.sleep(10000);
				//DOBclick().click();
				scrolldown();
				ResidentialAddress().clear();
				ResidentialAddress().sendKeys(Resenditaladdress.get(i));
				if (Gender.get(i).equals("Male"))
				{ 
					wait_For_WebElement(Male); 
					Male().click(); 
				}
				 else if (Gender.get(i).equals("Female"))
					 Female().click(); 
				 else 
				 { 
					 Others().click();
				 }
				if(permanent.get(i).equalsIgnoreCase("Yes"))
				{
					Permanentaddresscheckbox().click();
					if(Permanentaddress().getAttribute("value").equalsIgnoreCase(Resenditaladdress.get(i)))
					{
						System.out.println("Resendital Address is updated sucessfully");
					}
					else
					{
						System.out.println("Resendital Address is not updated");
					}
				}
				else
				{
					Permanentaddress().sendKeys(Permanentaddress.get(i));
				}
				Fathername().sendKeys(Fathername.get(i));
				Mothername().sendKeys(Mothername.get(i));
				Spousename().sendKeys(Spousename.get(i));
				Qualification().sendKeys(Qualification.get(i));
				Bloodgroup().selectByVisibleText(Bloodgroup.get(i));
				DependentName().sendKeys(DependentName.get(i));
				DependentRelationType().selectByVisibleText(DependentRelationType.get(i));
				get_date().get(1).sendKeys(DependentDOB.get(i));
				DependentDOBclick().click();
				scrollup();
			}
			else
			{
				System.out.println("Phone Number provided is not valid in data sheet");
			}
			//Filling employee details tab
			gettab().get(0).click();
			Employeetype().selectByVisibleText(Employeetype.get(i));
			Earningtype().selectByVisibleText(Earningtype.get(i));
			Gross().clear();
			Gross().sendKeys(Gross.get(i));
			State().selectByValue(State.get(i));
			City().selectByVisibleText(City.get(i));
			Thread.sleep(5000);
			Location().selectByVisibleText(Location.get(i));
			Shift().selectByVisibleText(Shift.get(i));
			Mode().selectByVisibleText(Mode.get(i));
			Roleid().selectByVisibleText(Roleid.get(i));
			Designation().clear();
			Designation().sendKeys(Designation.get(i));
			comobox().get(0).sendKeys(Manager.get(i),Keys.ENTER);
			comobox().get(1).sendKeys(Supervisior.get(i),Keys.ENTER);
			
			//Filling employee history details
			gettab().get(1).click();
			Dates().get(0).sendKeys(offerdate.get(i));
			offerdateclickdate().click();
			//Dates().get(1).sendKeys(HDOJ);
			//Thread.sleep(5000);
			//HDOJclickdate().click();
			Dates().get(2).sendKeys(PStartdate.get(i));
				try
				{
					PStartdateclickdate().click();
				}
				catch (ElementClickInterceptedException e)
				{
					PStartdateclickdate().click();
				}
				catch (StaleElementReferenceException e)
				{
					PStartdateclickdate().click();
				}
			Dates().get(3).sendKeys(EStartdate.get(i));
				try
				{
					EStartdateclickdate().click();
				}
				catch (ElementClickInterceptedException e)
				{
					EStartdateclickdate().click();
				}
				catch (StaleElementReferenceException e)
				{
					EStartdateclickdate().click();
				}
			Dates().get(4).sendKeys(DOR.get(i));
				try
				{
					DORclickdate().click();
				}
				catch (ElementClickInterceptedException e)
				{
					DORclickdate().click();
				}
				catch (StaleElementReferenceException e)
				{
					DORclickdate().click();
				}
			Dates().get(5).sendKeys(Lworkingdate.get(i));
			try
			{
				Lworkingdateclickdate().click();
			}
			catch (ElementClickInterceptedException e)
			{
				Lworkingdateclickdate().click();
			}
			catch (StaleElementReferenceException e)
			{
				Lworkingdateclickdate().click();
			}
			
			//Filling employee statutory details
			gettab().get(2).click();
			Aadhar().sendKeys(Aadhar.get(i)); 
			PAN().sendKeys(PAN.get(i));
			UAN().sendKeys(UAN.get(i));
			ESI().sendKeys(ESI.get(i));
			PF().sendKeys(PF.get(i));
			BANKACCNU().sendKeys(BANKACCNU.get(i));
			IFSC().sendKeys(IFSC.get(i));
			BANKNAME().sendKeys(BANKNAME.get(i));
			NAMEINBANK().sendKeys(NAMEINBANK.get(i));
			
			//clicking the update button in edit mode
			clickingupdatebutton();
			Thread.sleep(5000);
		}
		
	}

	public void clickingupdatebutton()
	{
		updatebutton().click();
	}

}
