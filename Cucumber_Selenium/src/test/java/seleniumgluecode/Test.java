package seleniumgluecode;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.After;
import org.junit.Assert;

public class Test {
    public static WebDriver driver;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.ie.driver","C:\\Users\\Cyril.s\\OneDrive - HCL Technologies Ltd\\Automation\\Automation Files\\Selenium Webdriver\\ServerFiles\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
    	Thread.sleep(2000);
        driver.findElement(By.linkText("Sign in")).click();
        extentreportgenerator();
    }
    
        
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
        
    }
    
    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    	String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	
    	try
    	{
    		String actual = driver.findElement(By.cssSelector(".info-account")).getText();
    		Assert.assertEquals(exp_message, actual);
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println("Assert Failed");
    	}
        driver.quit();  
    }
    
    @When("^user2 enters \"(.*)\" and \"(.*)\"$")
    public void user2_enters_username_and_Password(String username, String password) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();   
    }
    
    @When("^user3 enters \"(.*)\" and \"(.*)\"$")
    public void user3_enters_username_and_Password(String username, String password) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();   
    }
    
   @Then("^success message is not displayed$")
   public void success_message_is_not_displayed() throws Throwable {
       	String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
        
       	try
    	{
    		String actual = driver.findElement(By.cssSelector(".info-account")).getText();
    		Assert.assertNotEquals(exp_message, actual);
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println("Assert Failed");
    	}
        driver.quit();  
        
    }   
   
   
   @SuppressWarnings("null")
public static void extentreportgenerator() throws IOException
   {
	 //Report Initialization
	   ExtentHtmlReporter htmlreport = new ExtentHtmlReporter(".\\Report\\Extent Report with Screenshot.html");
	   ExtentReports reports = new ExtentReports();
	   reports.attachReporter(htmlreport);
	   ExtentTest testlog = null;

	   //Capture and save screenshot
	   File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   BufferedImage img = ImageIO.read(screen);
	   File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
	   ImageIO.write(img, "png", new File(filetest + "Test.png"));

	   //Log Screenshot in Report
//	   testlog.info("Details of " + "Test screenshot", MediaEntityBuilder
//	                   .createScreenCaptureFromPath(System.getProperty("user.dir") + "Test.png").build());

	   //Flush Report-Mandatory, Else report will not generate.  
	   reports.flush();
   }
   

}