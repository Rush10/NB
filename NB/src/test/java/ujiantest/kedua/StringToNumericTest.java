package ujiantest.kedua;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.kedua.StringToNumeric;

//Urutan Jenjang
//(1) ===+
//(2) ===
//(3) ==
//(4) =

public class StringToNumericTest {
	StringToNumeric stm;
	Random rand;
	int n, intLowerLimit, intUpperLimit;
	String word;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("===+ TEST STRING TO NUMERIC +===");
		System.out.println("=== Execute Before Test ===");
		
		stm = new StringToNumeric();
		rand = new Random();
		
		//change range here for initialisation length word (n)
		intLowerLimit = 1; //change here
		intUpperLimit = 11; //change here
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("== Execute Before Method ==");
		
		n = rand.nextInt(intLowerLimit,intUpperLimit);
		word = stm.randomString(n);
		
		System.out.println("Word : " + word);
	}
	
	@Test
	public void testDevide() {
		System.out.println("= Execute Test Devide =");
		
		assertEquals(stm.convertStringToNumericActual(word), stm.convertStringToNumericExpected(word));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("== Execute After Method ==");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("=== Execute After Test ===");
	}
}
