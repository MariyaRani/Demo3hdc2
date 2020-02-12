package hdc2demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Mariya;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mariya = new ChromeDriver();
		Mariya.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
		Mariya.findElement(By.linkText("SignIn")).click();
		WebElement un=Mariya.findElement(By.name("userName"));
		WebElement ps=Mariya.findElement(By.id("password"));
		
		un.sendKeys("Lalitha");
		ps.sendKeys("password123");
		WebElement sn=Mariya.findElement(By.name("Login"));
		sn.click();
		Thread.sleep(4000);
		
		Mariya.close();

	}

}
