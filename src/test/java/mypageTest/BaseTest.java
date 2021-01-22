package mypageTest;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.MyListeners;
import mypages.BasePage;
import mypages.LoginPage;
import mypages.Page;	



public class BaseTest extends MyListeners {

	public Page page;

	@BeforeClass
	@Parameters(value = { "browser" })
	public void setup(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\pd_saas_superhr\\SuperHR\\src\\test\\java\\property\\chromedriver.exe");	
			driver = new ChromeDriver(options);
		} 
		
		else if (browser.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions ffOptions = new FirefoxOptions();
			driver = new FirefoxDriver();
		} 
		
		else {
			System.out.println("No browser define in the xml");
		}
		
		driver.manage().window().maximize();
		driver.get(get_Property_Data("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		page = new BasePage(driver);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	public String get_current_date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	
	public String get_current_date_minus_one() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now.minusDays(1));
	}
	
	public String get_Property_Data(String obj) {
		FileInputStream propfile;
		Properties prop;
		String value = "";
		try {
			prop = new Properties();
			propfile = new FileInputStream("./src/test/java/property/data.properties");
			prop.load(propfile);
			value = prop.getProperty(obj);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
