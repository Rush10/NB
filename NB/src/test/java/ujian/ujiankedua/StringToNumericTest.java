package ujian.ujiankedua;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.kedua.StringToNumeric;

public class StringToNumericTest {
	StringToNumeric stm;
	Random rand;
	int n, intLowerLimit, intUpperLimit, intMethod;
	String word;
	
	@BeforeTest
	public void beforeTest() {
		stm = new StringToNumeric();
		rand = new Random();
		
		//change range here for initialisation length word (n)
		intLowerLimit = 1; //change here
		intUpperLimit = 11; //change here
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("===================== TEST STRING TO NUMERIC ====================");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intMethod++;
		System.out.println("===================== AWAL TEST METHOD "+intMethod+" (S) ====================");
		
		n = rand.nextInt(intLowerLimit,intUpperLimit);
		word = stm.randomString(n);
		
	}
	
	@Test
	public void testDevide() {
		System.out.println("=================== Execute String to Numeric ===================");
		System.out.println("Word : " + word);
		
		AssertJUnit.assertEquals(stm.convertStringToNumericActual(word), stm.convertStringToNumericExpected(word));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("==================== AKHIR TEST METHOD "+intMethod+" (S) ====================");
	}
	
	@AfterTest
	public void afterTest() {
//		System.out.println("=== Execute After Test ===");
	}
}
