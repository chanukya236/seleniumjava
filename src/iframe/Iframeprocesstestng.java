package iframe;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframeprocesstestng {
	WebDriver driver;
	
  @Test
  public void iframes() throws InterruptedException {
	  
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  
	/*  WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(obj); */
	  
	//  driver.switchTo().frame(2);
	  
	  driver.switchTo().frame("iframeResult");
	  driver. findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
	  Thread.sleep(4000);
	  
	  driver.switchTo().alert().accept();

	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	    
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
