package hdc2demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NumberOfLinksDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver Rani;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
		Rani = new ChromeDriver();
		Rani.get("http://demowebshop.tricentis.com/");
		Rani.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait1=new WebDriverWait(Rani,60);
	
		
		Rani.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> t_links=Rani.findElements(By.tagName("a"));
		int n_links=t_links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
			String l_linkname=t_links.get(i).getText();
			System.out.println("The "+i+"th link is:"+l_linkname);
		}

	}

}
