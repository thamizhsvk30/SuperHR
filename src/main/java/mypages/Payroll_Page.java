package mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Payroll_Page extends BasePage{

	public Payroll_Page(WebDriver driver) {
		super(driver);
	}
	
		//Login Flow
		private By MobileNumber = By.tagName("input");
		private By SubmitBtn = By.xpath("//button[@type='submit']");
		private By Password = By.xpath("//input[@placeholder='Password']");
		private By NextBtn = By.xpath("//button[text()='Next']");
		
		// Add New Deduction Flow
		private By Payroll = By.xpath("//a[@ng-reflect-router-link='/payroll']");
		private By variabledeductionHead = By.xpath("//h1[@class='steps-head']");
		private By AddDeductionBtn = By.xpath("//button[text()='Add Deduction']");
		private By DeductiondetailsHead = By.xpath("//p[@class='deductions-main-text']");
		private By SearchEmployee = By.xpath("//input[@role='combobox']");
		private By SelectTypeofDeduction = By.xpath("//select[@ng-reflect-name='type']");
		private By AmountPerMonth = By.xpath("//input[@ng-reflect-name='amount']");
		private By IncrementBtn = By.xpath("//img[@src='assets/images/plus-icon.svg']");
		private By DecrementBtn = By.xpath("//img[@src='assets/images/minus-icon.svg']");
		private By StartMonth = By.xpath("(//input[@ng-reflect-ng-class='p-inputtext p-component'])[1]");
		private By SaveBtn = By.xpath("//button[text()='Save']");
		
		// Search Employee
		private By EmployeeSearchBox = By.xpath("//input[@placeholder='Search by employee name']");
		private By SearchNameforLoan = By.xpath("//div[@class='mt-4 mb-5']//tbody/tr[1]/td[1]");
		private By Searchnameforother = By.xpath("(//div[@class='mt-4 mb-5'])[2]//tbody/tr[1]/td[1]");
		
		//Add Variable Earnings
		private By VariableEanings = By.xpath("(//p[@class='payroll-name pl-2 m-0'])[2]");
		private By AddEarningsBtn = By.xpath("//button[text()='Add Earnings']");
		private By EarningHead = By.xpath("//p[@class='earnings-head']");
		private By SearchEmpName = By.xpath("//input[@role='combobox']");
		private By selectEarningtype = By.xpath("//select[@ng-reflect-name='type']");
		private By AmountforMonth = By.xpath("//input[@ng-reflect-name='amount']");
		private By EffectiveMonth = By.xpath("(//input[@ng-reflect-ng-class='p-inputtext p-component'])[1]");
		private By SearchEmp = By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr[1]/td[1]");
		
		public WebElement get_Searchnameforother() {
			return get_Element(Searchnameforother);
		}
		public WebElement get_SearchEmpEarning() {
			return get_Element(SearchEmp);
		}
		public WebElement get_VariableEanings() {
			return get_Element(VariableEanings);
		}
		public WebElement get_AddEarningsBtn() {
			return get_Element(AddEarningsBtn);
		}
		public WebElement get_EarningHead() {
			return get_Element(EarningHead);
		}
		public WebElement get_SearchEmpName() {
			return get_Element(SearchEmpName);
		}
		public Select get_selectEarningtype() {
			return selectby(selectEarningtype);
		}
		public WebElement get_AmountforMonth() {
			return get_Element(AmountforMonth);
		}
		public WebElement get_EffectiveMonth() {
			return get_Element(EffectiveMonth);
		}
		
		public WebElement get_EmployeeSearchBox() {
			return get_Element(EmployeeSearchBox);
		}
		public WebElement get_SearchNameforLoan() {
			return get_Element(SearchNameforLoan);
		}
		public WebElement get_MobileNumber() {
			return get_Element(MobileNumber);
		}
		public WebElement get_SubmitBtn() {
			return get_Element(SubmitBtn);
		}
		public WebElement get_Password() {
			return get_Element(Password);
		}
		public WebElement get_NextBtn() {
			return get_Element(NextBtn);
		}
		public WebElement get_Payroll() {
			return get_Element(Payroll);
		}
		public WebElement get_VariabledeductionHead() {
			return get_Element(variabledeductionHead);
		}
		public WebElement get_AddDeductionBtn() {
			return get_Element(AddDeductionBtn);
		}
		public WebElement get_DeductiondetailsHead() {
			return get_Element(DeductiondetailsHead);
		}
		public WebElement get_SearchEmployee() {
			return get_Element(SearchEmployee);
		}
		public Select get_SelectTypeofDeduction() {
			return selectby(SelectTypeofDeduction);
		}
		public WebElement get_AmountPerMonth() {
			return get_Element(AmountPerMonth);
		}
		public WebElement get_IncrementBtn() {
			return get_Element(IncrementBtn);
		}
		public WebElement get_DecrementBtn() {
			return get_Element(DecrementBtn);
		}
		public WebElement get_StartMonth() {
			return get_Element(StartMonth);
		}
		public WebElement get_SaveBtn() {
			return get_Element(SaveBtn);
		}
		
		public void navigatePayRoll() throws InterruptedException {
			
			try {
				Thread.sleep(5000);
				wait_For_clickable_WebElement(Payroll);
				get_Payroll().click();
			}catch (StaleElementReferenceException e) {
				Thread.sleep(4000);
				wait_For_clickable_WebElement(Payroll);
				get_Payroll().click();
			}
		}
		
		public void addNewVariableDeduction() throws InterruptedException {
			
			wait_For_WebElement(variabledeductionHead);
			get_AddDeductionBtn().click();
			Thread.sleep(4000);
			get_SearchEmployee().clear();
			get_SearchEmployee().sendKeys(get_Property_Data("EmployeeDeductionName"));
			get_SelectTypeofDeduction().selectByVisibleText(get_Property_Data("Deduction"));
			get_AmountPerMonth().clear();
			get_AmountPerMonth().sendKeys(get_Property_Data("Amount"));
			Thread.sleep(4000);
			scrolldown();
			for (int i = 0; i < 2; i++) {
				get_IncrementBtn().click();
				Thread.sleep(300);
			}
			get_StartMonth().sendKeys(get_Property_Data("Month"));
			get_SaveBtn().click();
		}
		
		public Boolean verifyEmployeeDeduction() throws InterruptedException {
			try {
				
			get_EmployeeSearchBox().sendKeys(get_Property_Data("EmployeeDeductionName"),Keys.ENTER);
			Thread.sleep(3000);
			String Empname2 = get_SearchNameforLoan().getText();
			System.out.println("Variable deduction Employee name is :"+ Empname2);
				
			//String Empname3 = get_Searchnameforother().getText();
			//System.out.println(Empname3);
			
			if ((get_Property_Data("EmployeeDeductionName").equalsIgnoreCase(Empname2))) {
				System.out.println("Employee Name is Matched");
				System.out.println("Variable Deduction  Verified");
				
			} 
			//else if((get_Property_Data("EmployeeDeductionName").equalsIgnoreCase(Empname3))) {
			//System.out.println("Other Variable Deduction should be Verified");
			//	}
			else {
					
				System.out.println("Employee Name is Not Matched");	
			}
				return true;
			} catch (Exception e) {
				return false;
			}	
	}
		
		public void addNewVariableEarning() throws InterruptedException {
			
			get_VariableEanings().click();
			Thread.sleep(3000);
			get_AddEarningsBtn().click();
			wait_For_clickable_WebElement(EarningHead);
			get_SearchEmpName().clear();
			get_SearchEmpName().sendKeys(get_Property_Data("EmpEarningname"),Keys.ENTER);
			get_selectEarningtype().selectByVisibleText(get_Property_Data("Earning"));
			get_AmountforMonth().sendKeys(get_Property_Data("Amount"));
			get_EffectiveMonth().sendKeys(get_Property_Data("Month"));
			get_SaveBtn().click();
		}
		
		public Boolean verifyEmployeeveriableEaning() throws InterruptedException {
			try {
				
				get_VariableEanings().click();
				get_EmployeeSearchBox().sendKeys(get_Property_Data("EmpEarningname"),Keys.ENTER);
				Thread.sleep(3000);
				String Empname3 = get_SearchEmpEarning().getText();
				System.out.println("Varaible Earnings Employee name is:"+Empname3);
				
				if ((get_Property_Data("EmpEarningname").equalsIgnoreCase(Empname3))) {
					System.out.println("Employee Name is Matched");
					System.out.println("Variable Earnings Verified");
				} else {
					System.out.println("Employee Name is Not Matched");		
			}
				return true;
			} catch (Exception e) {
				return false;
			}	
	}
}
