package tabfunction;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TabFunction1 {
	WebDriver driver;
	
  @Test
  public void tabfunc() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  driver.switchTo().frame("//*[@id=\"iframeResult\"]");
	//*[@id="iframeResult"]
	  driver.findElement(By.xpath("/*[@onclick=\"myFunction()\"]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  

}
