package hdc2demo;

import org.testng.annotations.Test;

public class TestngGroup {
  @Test(groups= {"sanity","regression"})
  public void login()
  {
	  System.out.println("code for login");
  }
  @Test(groups= {"sanity"})
  public void logout()
  {
	  System.out.println("code for logout");
  }
  @Test(groups= {"regression"})
  public void registration()
  {
	  System.out.println("code for registration");
  }
}
