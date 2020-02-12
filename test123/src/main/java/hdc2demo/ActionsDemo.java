package hdc2demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
 /*@Test
  public void f() throws InterruptedException
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("https://www.google.com/");
	  WebElement s=Mariya.findElement(By.name("q"));
	  s.sendKeys("accenture");
	  Actions act=new Actions(Mariya);
	  act.keyDown(s, Keys.SHIFT).keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  
  }*/
  @Test(enabled=false)
  public void moveElement() throws InterruptedException
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("https://www.spicejet.com/");
	  Thread.sleep(100);
	  WebElement E=Mariya.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions act2=new Actions(Mariya);
	  act2.moveToElement(E).build().perform();
	  Thread.sleep(3000);
	  Mariya.findElement(By.linkText("//a[text()='Carry More Onboard']")).click();
  }
  @Test
  public void DragDrop() throws InterruptedException
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  Mariya.manage().window().maximize();
	  Thread.sleep(100);
	  Mariya.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement src=Mariya.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement dst=Mariya.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	  Actions act=new Actions(Mariya);
	  act.dragAndDrop(src,dst).build().perform();
	  Thread.sleep(2000);
	  WebElement s1=Mariya.findElement(By.xpath(""));
	  String A_val=s1.getText();
	  
  }
 
}
