package hdc2demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Mariya;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		Mariya = new ChromeDriver();
		Mariya.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
		Mariya.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Dimension d=new Dimension(300,600);
		Mariya.manage().window().setSize(d);
		
		Thread.sleep(4000);
		
		Point p=new Point(300,500);
		Mariya.manage().window().setPosition(p);
		
		Thread.sleep(4000);
		
		String E_title="Home";
		String A_title=Mariya.getTitle();
		if(A_title.equals(E_title))
		{
			System.out.println("page opened");
		}
		else
		{
			System.out.println("page not opened");
		}
		Mariya.close();

	}

}
