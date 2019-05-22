package t1;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.UtilityMethods;

public class Test1 {
static String executionMode = "linear";
	
private WebDriver driver;


	@Parameters("browserType")
	@BeforeClass
	public void launchURL(String browserType, ITestContext context){
		
		if(browserType.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
			 driver=new ChromeDriver();
			 Reporter.log("Chrome launched", true);
				context.setAttribute("driver", driver);
				UtilityMethods.modeOfExecution = executionMode;
				driver.manage().window().maximize();
		}
		
		
	}
	
	@Test
	public void name() {
		System.out.println("34");
		
		
	}
	
	@Test
	public void name1() {
		System.out.println("1234");
		System.out.println(2+5);
		
		
	}
	
	
//	@Test
	public void name2() {
		System.out.println("test");
		Assert.fail();
		System.out.println("test1");
		
		
	}
	

	

}
