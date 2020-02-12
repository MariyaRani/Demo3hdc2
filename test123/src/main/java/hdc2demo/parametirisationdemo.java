package hdc2demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class parametirisationdemo {
  @Test(dataProvider = "credentials")
  public void login(String name, String password) 
  {
	  WebDriver Mariya;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mariya = new ChromeDriver();
		Mariya.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		Mariya.findElement(By.linkText("SignIn")).click();
		System.out.println("username is "+name);
		System.out.println("password is "+password);
		Mariya.findElement(By.xpath("//input[@id='userName']")).sendKeys(name);
		Mariya.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Mariya.findElement(By.name("Login")).click();
		
		String E_title="Home";
		String A_title=Mariya.getTitle();
		Assert.assertEquals(A_title, E_title);
  }

  @DataProvider
  public Object[][] credentials() 
  {
    return new Object[][] {
      new Object[] { "lalitha", "Password123" },
      new Object[] { "Srini", "Password456" },
      new Object[] { "Swagatika", "Pass78946" },
    };
  }
}
