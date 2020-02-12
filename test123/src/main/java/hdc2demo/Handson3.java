package hdc2demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Handson3 
{
  @Test(dataProvider = "register")
  public void regWebShop(String fname,String lname,String mail,String pwd,String cpwd) throws InterruptedException
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("http://demowebshop.tricentis.com/");
	  Thread.sleep(3000);
	  Mariya.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	  Mariya.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
	  Mariya.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(fname);
	  Mariya.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lname);
	  Mariya.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(mail);
	  Mariya.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pwd);
	  Mariya.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(cpwd);
	  Mariya.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	  String A_title=Mariya.getTitle();
	  String E_title=("Demo Web Shop. Register");
	  Assert.assertEquals(A_title, E_title);
	  System.out.println("Registration successful");
	  
  }

  @DataProvider
  public Object[][] register() {
    return new Object[][] {
      new Object[] { "mariya", "rani" ,"rani@gmail.com","rani@123","rani@123" },
      new Object[] { "sam", "samyuktha" ,"sam@gmail.com","sam@123","sam@123" },
      new Object[] { "Vysh", "pavani" ,"vysh@gmail.com","vysh@123","vysh@123" },
    };
  }
}
