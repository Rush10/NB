package latihantest.testing;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import latihan.testing.Calculator;

public class CalculatorTest {

  @Test(priority = 4)
  public void tambahTest() {
	System.out.println("Ini test 1");
    int a = 4;
    int b = 2;
    
    int actual = Calculator.add(a, b);
    int expect = 6;
    
    assertEquals(actual, expect); 		//membandingkan hasil pada actual dengan expect
  }

//  @Test
//  public void cobaTest() throws Exception {
//	System.out.println("coba");
//	throw new Exception("Sengaja dibuat gagal");
//  }
  
  @Test(timeOut = 401)
  public void cobaTest() throws Exception{
	System.out.println("Method ini membutuhkan waktu 400 ms");
	Thread.sleep(400);
  }

  @Test(enabled = false)
  public void subtractTest() {
	System.out.println("Ini test 3");
	int a = 4;
	int b = 2;
	    
	int actual = Calculator.subtract(a, b);
	int expect = 2;
	    
	assertEquals(actual, expect, "kalkulator tidak dapat menghitung penjumlahan dengan benar."); //membandingkan hasil pada actual dengan expect serta manampilkan informasi string jika test gagal 			
  }
  
  @BeforeGroups
  public void beforeGroups() {
	  System.out.println("Ini before groups");
  }
  
  @AfterGroups
  public void afterGroups() {
	  System.out.println("Ini after groups");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Ini before suite");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Ini after suite");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Ini before test");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Ini after test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Ini before class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Ini after class");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Ini before method");
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Ini after method");
  }
}
