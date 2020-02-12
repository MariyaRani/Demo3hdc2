package hdc2demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver Rani;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
		Rani = new ChromeDriver();
		Rani.get("https://www.facebook.com//");
		
		WebElement fs=Rani.findElement(By.name("firstname"));
		WebElement ls=Rani.findElement(By.name("lastname"));
		WebElement mn=Rani.findElement(By.name("reg_email__"));
		WebElement ps=Rani.findElement(By.className("reg_passwd__"));
		WebElement month=Rani.findElement(By.id("month"));
		WebElement day=Rani.findElement(By.id("day"));
		WebElement year=Rani.findElement(By.id("year"));
		
		fs.sendKeys("Mariya");
		ls.sendKeys("rani");
		mn.sendKeys("rani@gmail.com");
		ps.sendKeys("Mar@1234");
	    month.sendKeys("Jan");
		day.sendKeys("4");
		year.sendKeys("1997");
		Rani.findElement(By.xpath("//label[text()='Female']")).click();
		Rani.findElement(By.name("websubmit")).click();

	}

}
