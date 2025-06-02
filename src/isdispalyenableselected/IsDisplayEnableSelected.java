package isdispalyenableselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayEnableSelected {
	WebDriver driver;
	
  @Test
  public void IsDisplayed() throws InterruptedException {
	  driver.get("https://www.techlearn.in/wp-login.php?redirect_to=https%3A%2F%2Fwww.techlearn.in%2Fwp-admin%2F&reauth=1");
	  Thread.sleep(2000);
	  
	  boolean logdisplay = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
	  
	  if (logdisplay == true)
			  {
		  		System.out.println("Display the content");
		  		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
			  }
	  else
	  {
	  		System.out.println("Not Display the content");

	  }
  }
  
  @Test
  public void IsEnable() throws InterruptedException {
	  driver.get("https://www.techlearn.in/wp-login.php?redirect_to=https%3A%2F%2Fwww.techlearn.in%2Fwp-admin%2F&reauth=1");
	  Thread.sleep(2000);
	  
	  boolean logenable = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
	  
	  if (logenable == true)
			  {
		  		System.out.println("Enable the content");
		  		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Chanu");
			  }
	  else
	  {
	  		System.out.println("Not Enable the content");

	  }
  }
  
  @Test
  public void IsSelect() throws InterruptedException {
	  driver.get("https://www.techlearn.in/wp-login.php?redirect_to=https%3A%2F%2Fwww.techlearn.in%2Fwp-admin%2F&reauth=1");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  
	  boolean logselect = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	  
	  if (logselect == true)
			  {
		  		System.out.println("Select the content");
			  }
	  else
	  {
	  		System.out.println("Not Enable the content");

	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
