package tabtitleapplicationurlapplicationtext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Ttaut {
	WebDriver driver;
	
  @Test
  public void microSoft() {
	  
	  driver.get("https://www.office.com/");
	  
	  String exptitle = "Login | Microsoft 365 Copilot";
	  
	  String acttitle = driver.getTitle();
	  
	  Assert.assertEquals(acttitle, exptitle);
	  	  
  }
  
  @Test
  public void microSofturl() {
	  
	  driver.get("https://www.office.com/");
	  
	  String expappurl = "https://www.office.com/";
	  
	  String actappurl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(actappurl, expappurl);
	  	  
  }
  
  @Test
  public void microSofttext() {
	  
 	  driver.get("https://www.office.com/");
	  
 	  String expapptxt = "Microsoft 365";
	  
	  String actapptxt = driver.findElement(By.xpath("//*[@id=\"uhfCatLogo\"]/span")).getText();
	  
	  Assert.assertEquals(actapptxt, expapptxt); 
	  
	  
	  String expapptxt1 = "Products";
	  
	  String actapptxt1 = driver.findElement(By.xpath("//*[@id=\"c-shellmenu_0\"]")).getText();
	  
	  Assert.assertEquals(actapptxt1, expapptxt1);
	  
	  	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
