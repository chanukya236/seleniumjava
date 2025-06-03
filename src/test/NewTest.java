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
	  driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("raju");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("raju@123");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
