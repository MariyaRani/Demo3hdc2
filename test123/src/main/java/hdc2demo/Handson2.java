package hdc2demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handson2 {
  @Test
  public void testMe() throws InterruptedException 
  {
	  WebDriver Mariya;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  Mariya=new ChromeDriver();
	  Mariya.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  Thread.sleep(1000);
	  Mariya.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span")).click();
	  Thread.sleep(1000);
	  Mariya.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
	  Thread.sleep(1000);
	  Mariya.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
	  //Mariya.switchTo().frame(Mariya.findElement(By.xpath("//*[@id='demo3']")));
	 Set<String> windows=Mariya.getWindowHandles();
	 for(String s:windows)
	 {
		 Mariya.switchTo().window(s);
		 //String id=Mariya.getWindowHandle();
	 }
	 Mariya.switchTo().frame(Mariya.findElement(By.name("main_page")));
	 WebElement txt=Mariya.findElement(By.xpath("//*[@id=\"demo3\"]/b"));
	 System.out.println(txt.getText());
	 
  }
}
