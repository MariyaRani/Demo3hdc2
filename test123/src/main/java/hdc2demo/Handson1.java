package hdc2demo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson1 {
  @Test
  public void webShop() throws InterruptedException
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("http://demowebshop.tricentis.com/");
	  WebElement s=Mariya.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	  s.sendKeys("computer");
	  Actions ac=new Actions(Mariya);
	  ac.keyDown(s, Keys.SHIFT).keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(3000);
	  ac.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  ac.sendKeys(Keys.ENTER).build().perform();
	  
  }
}
