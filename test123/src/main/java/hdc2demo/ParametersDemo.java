package hdc2demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class ParametersDemo {
	
  @Parameters({"tester","location"})
  @Test
  public void Membership(String tester,String location) 
  {
	  System.out.println("code for membership");
	  System.out.println("executed by "+tester);
	  System.out.println("executed from "+location);
  }
  @Test
  public void renewal() 
  {
	  System.out.println("code for renewal");
  }
  @Parameters({"tester","location"})
  @Test
  public void termination(String tester,String location) 
  {
	  System.out.println("code for termination");
	  System.out.println("executed by "+tester);
	  System.out.println("executed from "+location);
  }
}
