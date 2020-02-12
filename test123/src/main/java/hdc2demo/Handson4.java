package hdc2demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handson4 {
  @Test
  public void naukri() throws InterruptedException 
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("https://www.naukri.com/");
	  Thread.sleep(3000);
	  WebElement p=Mariya.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/h3"));
	  String s=p.getText();
	  
	  System.out.println(s);
	  
  }
}
