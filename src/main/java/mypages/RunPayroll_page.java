package mypages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunPayroll_page extends BasePage{

	public RunPayroll_page(WebDriver driver) {
		super(driver);
	}
	AdminDailyAttendancePage admindailyattendpage;
	
	
	// Get List_Employees Details
	private By Employee = By.xpath("//a[@ng-reflect-router-link='/employees']");
	private By EmployeeHead = By.xpath("//p[@class='view-total m-0']");
	private By EmpName = By.xpath("//p[@class='view-name pl-2 m-0']");
	
	private By Payroll = By.xpath("//a[@ng-reflect-router-link='/payroll']");
	
	//Runpayroll page
	private By RunPayroll = By.xpath("(//p[@class='payroll-name pl-2 m-0'])[3]");
	private By PayrollHead = By.xpath("//p[@class='run-head']");
	private By ConfirmNewJoinee = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[1]");
	private By ConfirmnewjoineeHead = By.xpath("//h1[@class='steps-head']");
	private By NewJoineeEmpname = By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr[1]/td[1]");
	private By NewEmpJoindate = By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr[1]/td[3]");
	private By EmpSearchbox = By.xpath("//input[@aria-label='search']");
	private By SearchEmpname = By.xpath("//p[@class='view-name pl-2 m-0']");
	private By EmployeeHistry = By.xpath("(//a[@class='ng-star-inserted'])[2]");
	private By EmployeeDateofJoin = By.xpath("(//span[@class='ng-star-inserted'])[1]");
	private By GoodtoProceed = By.xpath("//button[@type='submit']");
	
	private By ConfirmExit = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[2]");
	private By ExitDate = By.xpath("(//span[@class='ng-star-inserted'])[5]");
	private By ConfirmVariablededuction = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[3]");
	private By ConfirmVariableEarnings = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[4]");
	private By VariableEanings = By.xpath("(//p[@class='payroll-name pl-2 m-0'])[2]");
	private By VariableDeduction = By.xpath("(//p[@class='payroll-name pl-2 m-0'])[1]");
	private By variabledeductionHead = By.xpath("//h1[@class='steps-head']");
	
	// Confirm Attendance and Leaves
	private By Confirmattendance = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[5]");
	private By ConfirmattendanceHead = By.xpath("//h1[@class='steps-head']");
	private By AttendanceLeaves = By.xpath("(//img[@class='normal mr-1'])[4]");
	private By AttendanceMonthly = By.xpath("//a[@ng-reflect-router-link='/leave/attendance-monthly']");
	//Confirm Salary
	private By SalaryAdjust = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[6]");
	private By Ename = By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr[2]/td[1]");
	private By Esalary = By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr[2]/td[2]");
	private By EDetails = By.xpath("(//a[@class='ng-star-inserted'])[1]");
	private By ESalary = By.xpath("(//p[@class='view-value ng-star-inserted'])[8]");
	//Confirm Process Payroll
	private By ProcessPayroll = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[7]");
	private By Popup = By.xpath("//p[@class='text-center message ng-star-inserted']");
	private By CloseIcon = By.xpath("//img[@alt='Close']");
	private By ReviewOutput = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[8]");
	private By Closepayroll = By.xpath("(//a[@ng-reflect-ng-class='[object Object]'])[9]");
	
	
	public WebElement get_Closepayroll() {
		return get_Element(Closepayroll);
	}
	public WebElement get_ReviewOutput() {
		return get_Element(ReviewOutput);
	}
	public WebElement get_ProcessPayroll() {
		return get_Element(ProcessPayroll);
	}
	public WebElement get_Popup() {
		return get_Element(Popup);
	}
	public WebElement get_CloseIcon() {
		return get_Element(CloseIcon);
	}
	public WebElement get_ESalary() {
		return get_Element(ESalary);
	}
	public WebElement get_EDetails() {
		return get_Element(EDetails);
	}
	public WebElement get_Esalary() {
		return get_Element(Esalary);
	}
	public WebElement get_Ename() {
		return get_Element(Ename);
	}
	public WebElement get_SalaryAdjust() {
		return get_Element(SalaryAdjust);
	}
	public WebElement get_AttendanceMonthly() {
		return get_Element(AttendanceMonthly);
	}
	public WebElement get_AttendanceLeaves() {
		return get_Element(AttendanceLeaves);
	}
	public WebElement get_ConfirmattendanceHead() {
		return get_Element(ConfirmattendanceHead);
	}
	public WebElement get_Confirmattendance() {
		return get_Element(Confirmattendance);
	}
	public WebElement get_ExitDate() {
		return get_Element(ExitDate);
	}
	public WebElement get_EmployeeDateofJoin() {
		return get_Element(EmployeeDateofJoin);
	}
	public WebElement get_EmployeeHistry() {
		return get_Element(EmployeeHistry);
	}
	public WebElement get_SearchEmpname() {
		return get_Element(SearchEmpname);
	}
	public WebElement get_EmpSearchbox() {
		return get_Element(EmpSearchbox);
	}
	public WebElement get_NewEmpJoindate() {
		return get_Element(NewEmpJoindate);
	}
	public WebElement get_NewJoineeEmpname() {
		return get_Element(NewJoineeEmpname);
	}
	public WebElement get_variabledeductionHead() {
		return get_Element(variabledeductionHead);
	}
	public WebElement get_VariableDeduction() {
		return get_Element(VariableDeduction);
	}
	public WebElement get_VariableEanings() {
		return get_Element(VariableEanings);
	}
	public WebElement get_ConfirmVariableEarnings() {
		return get_Element(ConfirmVariableEarnings);
	}
	public WebElement get_ConfirmVariablededuction() {
		return get_Element(ConfirmVariablededuction);
	}
	public WebElement get_ConfirmExit() {
		return get_Element(ConfirmExit);
	}
	public WebElement get_GoodtoProceed() {
		return get_Element(GoodtoProceed);
	}
	public WebElement get_Payroll() {
		return get_Element(Payroll);
	} 
	public WebElement get_RunPayroll() {
		return get_Element(RunPayroll);
	}
	public WebElement get_PayrollHead() {
		return get_Element(PayrollHead);
	}
	public WebElement get_ConfirmNewJoinee() {
		return get_Element(ConfirmNewJoinee);
	}
	public List<WebElement> get_EmpNames() {
		return get_Elements(EmpName);
	}
	public WebElement get_Employee() {
		return get_Element(Employee);
	}
	public WebElement get_EmployeeHead() {
		return get_Element(EmployeeHead);
	}
	
	
	List<String> List_Employee;
	List<WebElement> ListEmployees;
	String List__Employees;
	List<String> Newjoinee_List;
	List<String> Exits_List;
	List<WebElement> row;
	String row_xpath;
	String New_joinee;
	String Exit_list;
	
	public Boolean verifyConfirmNewJoineeName() throws InterruptedException {
		
		try {
		
		//Get the Whole Employee Details
			
		Thread.sleep(4000);
		get_Employee().click();
		wait_For_clickable_WebElement(EmployeeHead);
		List_Employee = new ArrayList<String>();
	    ListEmployees = driver.findElements(By.xpath("//p[@class='view-name pl-2 m-0']"));
		System.out.println("Total Employees:"+ListEmployees.size());
		
		for (int i = 0; i < ListEmployees.size(); i++) {
		    List__Employees = ListEmployees.get(i).getText();
			List_Employee.add(List__Employees);
			}
		System.out.println("Total Employee Names:"+List_Employee);
		
		Thread.sleep(4000);
		get_Payroll().click();
		get_RunPayroll().click();
		wait_For_WebElement(PayrollHead);
		get_ConfirmNewJoinee().click();
		
		//get the New joinee Name list
		
		Thread.sleep(4000);
		Newjoinee_List = new ArrayList<String>();
		row = driver.findElements(By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr"));
		System.out.println("Total New Joinee Count is:"+row.size());
		
		for (int i = 1; i <= row.size(); i++) {
			row_xpath = "//div[@class='steps ng-star-inserted']//tbody/tr["+i+"]/td[1]";
			New_joinee = driver.findElement(By.xpath(row_xpath)).getText();
			Newjoinee_List.add(New_joinee);
		}
		System.out.println("Total New Joinee Names :"+ Newjoinee_List);
		
		if (List_Employee.containsAll(Newjoinee_List)) {
			System.out.println("New joinee names is verified ");
		}else {
			System.out.println("New Joinee Names Not Matched");
		}
			return true;
		}catch(Exception e) {
			return false;
		}	
		}
	
	public Boolean verifyEmployeeJoinDate() throws InterruptedException {
		try {
		
		String Empname = get_NewJoineeEmpname().getText();
		String EmpName1 = Empname.toLowerCase();
		System.out.println("Employee name is:"+EmpName1);
		
		String Empdate = get_NewEmpJoindate().getText();
		String Empjoindate = Empdate.replace("-","/");
		System.out.println("Employee Join date is :"+Empjoindate);
		
		Thread.sleep(4000);
		get_Employee().click();
		Thread.sleep(7000);
		
		get_EmpSearchbox().sendKeys(EmpName1,Keys.ENTER);
		get_SearchEmpname().click();
		Thread.sleep(4000);
		get_EmployeeHistry().click();
		String JoinDate = get_EmployeeDateofJoin().getText();
		System.out.println("Employee Date of Joinig is :"+ JoinDate);
		if (JoinDate.equals(Empjoindate)) {
			System.out.println("Employee joining date is Matched and verified");
		}else {
			System.out.println("Joining date not matched");
		}
		Thread.sleep(4000);
		get_Payroll().click();
		get_RunPayroll().click();
		wait_For_WebElement(PayrollHead);
		get_ConfirmNewJoinee().click();
		get_GoodtoProceed().click();
		
		
		return true;
		} catch (Exception e) {
			return false;
		}
	
	}
	
	public Boolean verifyConfirmExitsName() throws InterruptedException {
		
		try {
		
			get_RunPayroll().click();
			wait_For_WebElement(PayrollHead);
			get_ConfirmExit().click();
			Thread.sleep(4000);
		
		//get the New joinee Name list
			
			Exits_List = new ArrayList<String>();
			row = driver.findElements(By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr"));
			System.out.println("Total Exits Employee Count is :"+row.size());
			
			for (int i = 1; i <= row.size(); i++) {
				row_xpath = "//div[@class='steps ng-star-inserted']//tbody/tr["+i+"]/td[1]";
				Exit_list = driver.findElement(By.xpath(row_xpath)).getText();
				Exits_List.add(Exit_list);
			}
			System.out.println("Total Exits Employee Names is :"+ Exits_List);
		
			
		//Get the Whole Employee Details
			
		
		Thread.sleep(4000);
		get_Employee().click();
		wait_For_clickable_WebElement(EmployeeHead);
		List_Employee = new ArrayList<String>();
	    ListEmployees = driver.findElements(By.xpath("//p[@class='view-name pl-2 m-0']"));
		System.out.println("Total Employees:"+ListEmployees.size());
		
		for (int i = 0; i < ListEmployees.size(); i++) {
		    List__Employees = ListEmployees.get(i).getText();
			List_Employee.add(List__Employees);
			}
		System.out.println("Total Employee Names:"+List_Employee);
		
		if (List_Employee.containsAll(Exits_List)) {
			System.out.println("Confirm Exits names is verified ");
		}else {
			System.out.println("Confirm Exits Names Not Matched");
		}
		
			return true;
		}catch(Exception e) {
			return false;
		}	
		}
	
	
	public Boolean verifyEmpExitDate() throws InterruptedException {
		try {
			Thread.sleep(4000);
			get_Payroll().click();
			Thread.sleep(3000);
			get_RunPayroll().click();
			wait_For_WebElement(PayrollHead);
			get_ConfirmExit().click();
			Thread.sleep(3000);
			
		
			String Empname = get_NewJoineeEmpname().getText();
			String EmpName1 = Empname.toLowerCase();
			System.out.println("Employee name is:"+EmpName1);
			
			String Empdate = get_NewEmpJoindate().getText();
			String Empjoindate = Empdate.replace("-","/");
			System.out.println("Employee Exit date is :"+Empjoindate);
			
			Thread.sleep(4000);
			get_Employee().click();
			Thread.sleep(5000);
			
			get_EmpSearchbox().sendKeys(EmpName1,Keys.ENTER);
			get_SearchEmpname().click();
			Thread.sleep(4000);
			get_EmployeeHistry().click();
			String JoinDate = get_ExitDate().getText();
			System.out.println("Employee Date of Exit is :"+ JoinDate);
		
			if (JoinDate.equals(Empjoindate)) {
				System.out.println("Employee Exit date is Matched and verified");
			}else {
				System.out.println("Exit date not matched");
			}
			Thread.sleep(4000);
			get_Payroll().click();
			Thread.sleep(3000);
			get_RunPayroll().click();
			wait_For_WebElement(PayrollHead);
			get_ConfirmExit().click();
			Thread.sleep(3000);
			get_GoodtoProceed().click();
			return true;
			} catch (Exception e) {
				return false;
			}
			
		
	}
	
	// Confirm Variable Earnings method
	
	List<String> VeriableEarn_List;
	List<WebElement> Row;
	String	Row_path;
	String VeriableEarn;
	List<String> VeriableEarn1_List;
	List<WebElement> Row1;
	String	Row_path1;
	String VeriableEarn1;
	
	public void variableEarnings() throws InterruptedException {
		
		try {
			
			//get_Payroll().click();
			//get_RunPayroll().click();
			//get_ConfirmVariableEarnings().click();
			
		//} catch (StaleElementReferenceException e) {
			
			//get_Payroll().click();
			get_RunPayroll().click();
			get_ConfirmVariableEarnings().click();
		
			VeriableEarn_List = new ArrayList<String>();
			Row = driver.findElements(By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr"));
			System.out.println("Number of Confirm Employee Variable Earning List:"+Row.size());
			Thread.sleep(4000);
			for (int j = 1; j <= Row.size(); j++) {
			Row_path = "//div[@class='steps ng-star-inserted']//tbody/tr["+j+"]/td[1]";
			VeriableEarn = driver.findElement(By.xpath(Row_path)).getText();
			VeriableEarn_List.add(VeriableEarn);
			}
			System.out.println(VeriableEarn_List);
			
			get_VariableEanings().click();
			
			VeriableEarn1_List = new ArrayList<String>();
			Row1 = driver.findElements(By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr"));
			System.out.println("Number of Added Employee Earning List:"+Row1.size());
			
			for (int k = 1; k <= Row1.size(); k++) {
			Row_path1 = "//div[@class='steps ng-star-inserted']//tbody/tr["+k+"]/td[1]";
			VeriableEarn1 = driver.findElement(By.xpath(Row_path)).getText();
				VeriableEarn1_List.add(VeriableEarn1);
			}
			System.out.println(VeriableEarn1_List);
			
	
		if (VeriableEarn_List.containsAll(VeriableEarn_List)) {
			System.out.println("Confirm Variable Earnings has been verified ");
		}else {
			System.out.println("Confirm Variable Earnings above the names are not matched ");
		}
		get_RunPayroll().click();
		get_ConfirmVariableEarnings().click();
		get_GoodtoProceed().click();	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// Confirm Attendance and Leaves
	List<String> EmpConfirmAttendance_List;
	List<String> EmpMmonthlyattendance_List;
	String path;
	String path2;
	String path3;
	String EmployeeDetails;
	String EmployeDetailss;
	
	public Boolean verifyAttendanceandLeaves() throws InterruptedException {
		
		try {
			
		Thread.sleep(4000);
		//get_Payroll().click();
		get_RunPayroll().click();
		get_Confirmattendance().click();
		wait_For_WebElement(ConfirmattendanceHead);
		
		EmpConfirmAttendance_List = new ArrayList<String>();
		for (int i = 1; i <=3; i++) {
			//path ="//div[@class='steps ng-star-inserted']//tbody/tr["+i+"]/td[1]";
			for (int j = 1; j <=4 ; j++) {
				path2 = "//div[@class='steps ng-star-inserted']//tbody/tr["+i+"]/td["+j+"]";
				EmployeeDetails = driver.findElement(By.xpath(path2)).getText();
				//System.out.println(EmployeeDetails);
				EmpConfirmAttendance_List.add(EmployeeDetails);
			}
		}
		System.out.println("Confirm Attendance Details for first 3 Employees:"+ EmpConfirmAttendance_List);
		
		get_AttendanceLeaves().click();
		Thread.sleep(5000);
		get_AttendanceMonthly().click();
		
		EmpMmonthlyattendance_List = new ArrayList<String>();
		for (int k = 1; k <=3 ; k++) {
			for (int l = 1; l <=4; l++) {
				path3 = "//div[@class='attendance-month']//tbody/tr["+k+"]/td["+l+"]";
				EmployeDetailss = driver.findElement(By.xpath(path3)).getText();
				//System.out.println(EmployeDetailss);
				EmpMmonthlyattendance_List.add(EmployeDetailss);
			}
		}
		System.out.println("Default Attendance Details for first 3 Employees:"+ EmpMmonthlyattendance_List);
		
		if (EmpConfirmAttendance_List.equals(EmpMmonthlyattendance_List)) {
			System.out.println("Employee Attendance Details checked and verified Ok");
		} else {
			System.out.println("Attendance Details Not Matched");
		}
			get_Payroll().click();
			get_RunPayroll().click();
			get_Confirmattendance().click();
			wait_For_WebElement(ConfirmattendanceHead);
			get_GoodtoProceed().click();
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	// Confirm Variable Deduction Method
	
	List<String>Empname1_List;
	String Path4;
	String Empname1;
	List<String>Empname2_List;
	String Path5;
	String path6;
	String Empname2;
	String text4;
	List<WebElement> rows;
	List<WebElement> row1;
	List<String> Empname3_List;
	List<WebElement> list;
	public void variableDeduction() throws InterruptedException {
		
		//Thread.sleep(4000);
		//get_Payroll().click();
		//Thread.sleep(3000);
		get_RunPayroll().click();
		get_ConfirmVariablededuction().click();
		Empname1_List = new ArrayList<String>();
		row1 = driver.findElements(By.xpath("(//div[@class='mt-4 mb-5 ng-star-inserted'])[1]//tbody/tr/td[1]"));
		System.out.println("Confirm Variable Loan deduction Employees count:"+row1.size());
		Thread.sleep(4000);
		for (int i = 1; i <= row1.size(); i++) {
			Path4="(//div[@class='mt-4 mb-5 ng-star-inserted'])[1]//tbody/tr["+i+"]/td[1]";
			Empname1 = driver.findElement(By.xpath(Path4)).getText();
			Empname1_List.add(Empname1);
		}
		System.out.println("Names:"+ Empname1_List);
		
		Empname3_List = new ArrayList<String>();
		list = driver.findElements(By.xpath("(//div[@class='mt-4 mb-5 ng-star-inserted'])[2]//tbody/tr/td[1]"));
		System.out.println("Confirm Variable Other deduction Employee count:"+ list.size());
		Thread.sleep(4000);
		for (int j = 1; j <= list.size(); j++) {
			path6 ="(//div[@class='mt-4 mb-5 ng-star-inserted'])[2]//tbody/tr["+j+"]/td[1]";
			text4 = driver.findElement(By.xpath(path6)).getText();
			Empname3_List.add(text4);
		}
		System.out.println("Names:"+ Empname3_List);
		
		
		get_VariableDeduction().click();
		wait_For_WebElement(variabledeductionHead);
		
		Empname2_List = new ArrayList<String>();
		rows = driver.findElements(By.xpath("(//div[@class='mt-4 mb-5 ng-star-inserted'])[1]//tbody/tr/td[1]"));
		System.out.println("Added Variable Loan deduction Employees count:"+rows.size());
		for (int k = 1; k <= rows.size(); k++) {
			Path5="(//div[@class='mt-4 mb-5 ng-star-inserted'])[1]//tbody/tr["+k+"]/td[1]";
			Empname2 = driver.findElement(By.xpath(Path5)).getText();
			Empname2_List.add(Empname2);
		}
		System.out.println("Names:"+ Empname2_List);
		
		List<String> Empname4_List = new ArrayList<String>();
		List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='mt-4 mb-5 ng-star-inserted'])[2]//tbody/tr/td[1]"));
		System.out.println("Added Variable Other deduction Employee count:"+ list1.size());
		for (int l = 1; l <= list.size(); l++) {
			String path6 ="(//div[@class='mt-4 mb-5 ng-star-inserted'])[2]//tbody/tr["+l+"]/td[1]";
			String text7 = driver.findElement(By.xpath(path6)).getText();
			Empname4_List.add(text7);
		}
		System.out.println("Names:"+ Empname4_List);
		
		
		
		if (Empname1_List.equals(Empname2_List)) {
			System.out.println("Confirm variable Loan deduction Names are matched");
		} else {
			System.out.println("Confirm variable Loan deduction Names are Not matched");
		}
		if (Empname3_List.equals(Empname4_List)) {
			System.out.println("Confirm variable Other deduction Names are matched");
		} else {
			System.out.println("Confirm variable Other deduction Names are Not matched");
		}
		get_RunPayroll().click();
		get_ConfirmVariablededuction().click();
		Thread.sleep(3000);
		get_GoodtoProceed().click();
		
	}
	
	String xpath;
	String string;
	String Path0;
	String string1;
	public Boolean verifySalary() {
		try {
			//Thread.sleep(4000);
			//get_Payroll().click();
			Thread.sleep(6000);
			get_RunPayroll().click();
			get_SalaryAdjust().click();
			
			for (int i = 1; i < 3; i++) {
				for (int j = 1; j < 4; j++) {
					Path0 = "//div[@class='steps ng-star-inserted']//th["+j+"]";
					xpath = "//div[@class='steps ng-star-inserted']//tbody/tr["+i+"]/td["+j+"]";
					string = driver.findElement(By.xpath(xpath)).getText();
					string1 = driver.findElement(By.xpath(Path0)).getText();
					System.out.println(string1 +"-"+ string);
				}
			}
			
			String text = get_Ename().getText();
			String EName = text.toLowerCase();
			System.out.println("Employee name is:"+EName);
			
			String Empsalary = get_Esalary().getText();
			String Esalary = Empsalary.substring(1);
			System.out.println("Employee Confirm Salary is :"+Esalary);
			
			Thread.sleep(4000);
			get_Employee().click();
			Thread.sleep(5000);
			
			get_EmpSearchbox().sendKeys(EName,Keys.ENTER);
			get_SearchEmpname().click();
			Thread.sleep(4000);
			get_EDetails().click();
			String ESalary = get_ESalary().getText();
			System.out.println("Employee Alloted Salary is :"+ESalary);
			
			if (Esalary.equalsIgnoreCase(ESalary)) {
				System.out.println("Employee Both Salary Will Matched");
			} else {
				System.out.println("Both Salary Not Matched");
			}
			get_Payroll().click();
			Thread.sleep(4000);
			get_RunPayroll().click();
			Thread.sleep(4000);
			get_SalaryAdjust().click();
			get_GoodtoProceed().click();
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	public Boolean verifyProcessPayroll() {
		try {
			
			Thread.sleep(4000);
			get_RunPayroll().click();
			scrolldown();
			Thread.sleep(20000);
			get_ProcessPayroll().click();
			//String text = get_Popup().getText();
			//System.out.println(text);
			//get_CloseIcon().click();
			//get_GoodtoProceed().click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	List<WebElement> Spath;
	String sspath;
	String sspath1;
	String tex;
	String text;
	public void verifyReviewOutput() {
		try {
			Thread.sleep(4000);
			//get_Payroll().click();
			get_RunPayroll().click();
			Thread.sleep(3000);
			scrolldown();
			get_ReviewOutput().click();
			get_EmpSearchbox().sendKeys(get_Property_Data("Salaryreviewname"),Keys.ENTER);
			Spath = driver.findElements(By.xpath("//div[@class='steps ng-star-inserted']//tbody/tr/td"));
		
			for (int m = 1; m < Spath.size(); m++) {
				sspath = "//div[@class='steps ng-star-inserted']//th["+m+"]";
				sspath1 = "//div[@class='steps ng-star-inserted']//tbody/tr/td["+m+"]";
				tex = driver.findElement(By.xpath(sspath)).getText();
				text = driver.findElement(By.xpath(sspath1)).getText();
				System.out.println(tex+"-"+text);
			}
			//get_GoodtoProceed().click();
			//return true;
		} catch (Exception e) {
		//	return false;
		}
	}
	
	public void VeriffyClosePayroll() throws InterruptedException {
		Thread.sleep(4000);
		get_RunPayroll().click();
		scrolldown();
		get_Closepayroll().click();
		String text = get_Popup().getText();
		System.out.println(text);
		//get_CloseIcon().click();
	}
	
	
	
}
