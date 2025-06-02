package tabtitleapplicationurlapplicationtext;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTitleApplicationURLApplicationText {
	WebDriver driver;
  @Test
  public void w3Schoolspage() {
	  driver.get("https://www.w3schools.com/");
	  
	  String exptabtxt = "W3Schools Online Web Tutorials";
	//  System.out.println("Expected tab title is : "+ exptabtxt);
	  
	  String acttabtxt = driver.getTitle();
	//  System.out.println("Acurate tab title is : "+acttabtxt);
	  
	  Assert.assertEquals(acttabtxt, exptabtxt);
  }
  
  @Test
  public void w3Schoolsurl() {
	  driver.get("https://www.w3schools.com/");
	  
	  String expappurl = "https://www.w3schools.com/";
	//  System.out.println("Expected tab title is : "+ exptabtxt);
	  
	  String actappurl = driver.getCurrentUrl();
	//  System.out.println("Acurate tab title is : "+acttabtxt);
	  
	  Assert.assertEquals(actappurl, expappurl);
  }
  
  @Test
  public void w3Schoolstext() {
	  driver.get("https://www.w3schools.com/");
	  
	  String expapptxt = "";
	//  System.out.println("Expected tab title is : "+ exptabtxt);
	  
	  String actapptxt = driver.findElement(By.xpath("/html/body/iframe[3]")).getText();
	//  System.out.println("Acurate tab title is : "+acttabtxt);
	  
	  Assert.assertEquals(actapptxt, expapptxt);
  }
  
  @Test
  public void w3Schoolstext1() {
	  driver.get("https://www.w3schools.com/");
	  
	  String expapptxt = "Tutorials";
	  
	  String actapptxt = driver.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]")).getText();
	  
	  Assert.assertEquals(actapptxt, expapptxt);
	  
	  
	  String expapptxt2 = "Exercises";
	  
	  String actapptxt2 = driver.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]")).getText();
	  
	  Assert.assertEquals(actapptxt2, expapptxt2);
	  
	  String expapptxt3 = "Spaces";
	  
	  String actapptxt3 = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[4]")).getText();
	  
	  Assert.assertEquals(actapptxt3, expapptxt3);
	  
	  String expapptxt4 = "For Teachers";
	  
	  String actapptxt4 = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[3]")).getText();
	  
	  Assert.assertEquals(actapptxt4, expapptxt4);
	  
	  String expapptxt5 = "Get Certified";
	  
	  String actapptxt5 = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[2]")).getText();
	  
	  Assert.assertEquals(actapptxt5, expapptxt5);
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
