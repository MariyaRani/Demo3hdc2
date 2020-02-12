package hdc2demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo
{
  @Test
  public void login()
  {
	  System.out.println("5 lines of code for login");
  }
  @Test
  public void logout()
  {
	  System.out.println("10 lines of code for logout");
  }
  @BeforeMethod
  public void launch()
  {
	  System.out.println("3 lines of code for launch");
  }
  @AfterMethod
  public void closing()
  {
	  System.out.println("15 lines of code for closing");
  }
  @BeforeClass
  public void clearBrowserCache()
  {
	  System.out.println("20 lines of code for cache");
  }
  @AfterClass
  public void delete()
  {
	  System.out.println("9 lines of code for delete");
  }
  
}
