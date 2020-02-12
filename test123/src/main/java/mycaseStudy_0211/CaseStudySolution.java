package mycaseStudy_0211;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import casestudy.AfterMethod;
import casestudy.AfterTest;
import casestudy.ExtentReports;
import casestudy.File;
import casestudy.IOException;
import casestudy.ITestResult;
import casestudy.TakesScreenshot;
import casestudy.Utility;

public class CaseStudySolution {
	 WebDriver driver;
	 ExtentHtmlReporter htmlReporter;
	    ExtentReports extent;
	    ExtentTest test;
	    
	    @BeforeTest
	    	public void startReport() {
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport_Team.html");
	        
	        extent = new ExtentReports();
	       
	        extent.attachReporter(htmlReporter);
	        htmlReporter.config().setDocumentTitle("Extent Report Demo by Team");
	        htmlReporter.config().setReportName("Test Report for Demo");
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	    }
	@Test(priority=1,enabled=false)
  public void testRegistration () throws InterruptedException {
		test = extent.createTest("TC_01", "Registration");
			 
	 
		driver=Utility.getDriver("CRM");
			 
	 driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
			
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
			
	  WebElement s=driver.findElement(By.xpath("//*[@id=\"userName\"]"));  //uname
			
	  s.sendKeys("MariyaRani");
		      
	driver.findElement(By.xpath("//input[@id='firstName']")).click(); //fname
		   
	   Thread.sleep(2000); 
		    
	  String a = driver.findElement(By.xpath("//span[@class='label label-default']")).getText();
		     
	 String b = "Available";
		   
	   if(a.equals(b))
		      
	{
		    	  
	WebElement f_name=driver.findElement(By.xpath("//input[@id='firstName']"));
		    	
	  f_name.sendKeys("case");
		    	 
	 WebElement l_name=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		    	
	  l_name.sendKeys("study");
		    	  
	WebElement pswd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		    	
	  pswd.sendKeys("casestudy123");
		    	
	  WebElement pswd2=driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]"));
		    	
	  pswd2.sendKeys("casestudy123");
		    	  
	driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		    	
	  WebElement mail=  driver.findElement(By.xpath("//*[@id=\"emailAddress\"]"));
		    	 
	 mail.sendKeys("casestudy@gmail.com");
	 Thread.sleep(2000);
		    	  
	WebElement phone=  driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
		    	
	  phone.sendKeys("9999999999");
	  Thread.sleep(2000);
	WebElement d=  driver.findElement(By.xpath("//input[@name='dob']"));
	d.sendKeys("10/23/1998");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Waverock building");
		     
	   WebElement q=  driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
		     
	   q.click();
		      
	  Select s3=new Select(q);
		     
	   s3.selectByIndex(2);
	   Thread.sleep(2000);
		      
	  driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("mariya");
		       
	 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	 Thread.sleep(2000);
	   
	   }
      else		   
	   {
		    	  
	System.out.println("already exists");
		   
	   }
	   driver.close();
		     
	 }
	
	
	@Test(priority="2")
	
	  public void testLogin() throws InterruptedException 
	  {
		test = extent.createTest("TC_02", "Login");
		 
			driver = Utility.getDriver("CRM");
			driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("SignIn")).click();
			WebElement un=driver.findElement(By.name("userName"));
			WebElement ps=driver.findElement(By.id("password"));
			
			un.sendKeys("MariyaRani");
			ps.sendKeys("casestudy123");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(3000);
			String E_title="Home";
			String A_title=driver.getTitle();
			Assert.assertEquals(A_title, E_title);
	
	  }
	
	
	@Test(priority=3)
  public void testCart() throws InterruptedException 
  {
		test = extent.createTest("TC_03", "Add To cart");
	
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		Thread.sleep(1000); 
	    String count=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();		
	
		
		
		String E_title="0";
		Assert.assertNotSame(count, E_title);
//		System.out.println("Successfully added to cart");
		
  }
	@Test(priority=4)
	public void testPayment() throws InterruptedException
	{
		test = extent.createTest("TC_04", "Payment");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click(); 
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click(); 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='HDFC Bank']")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123457");
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@457");
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    String E_title="Order Details";
	    String A_title=driver.getTitle();
	    Assert.assertEquals(E_title,A_title);
		/*
		 * System.out.println("successful"); driver.close();
		 */
	    
		
		
				
		
	}
	@AfterMethod
    public void getResult(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.PINK));
            
            TakesScreenshot snapshot =   (TakesScreenshot)driver;
            File src = snapshot.getScreenshotAs(OutputType.FILE);
            String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
            FileUtils.copyFile(src, new File(Path));
            test.addScreenCaptureFromPath(Path, result.getName());
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.INDIGO));
        }
        else {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
     
    @AfterTest
    public void tearDown() {
    	//to write or update test information to reporter
        extent.flush();
    }

}
