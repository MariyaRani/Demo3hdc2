package hdc2demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Smartours {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver Sample;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Sample=new ChromeDriver();
		Sample.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		Sample.findElement(By.linkText("SignUp")).click();
		WebElement src=Sample.findElement(By.xpath("//select[@id=\"securityQuestion\"]"));
		Select s=new Select(src);
		s.selectByIndex(3);
		Thread.sleep(4000);
		
		
		

	}

}
