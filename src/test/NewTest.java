package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void xpath() {
	  driver.get("http://techlearn.in/admin");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
