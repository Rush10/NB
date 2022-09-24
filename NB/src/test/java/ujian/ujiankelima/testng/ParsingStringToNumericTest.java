package ujian.ujiankelima.testng;

import java.util.Random;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.ujiankelima.testng.ParsingStringToNumeric;

public class ParsingStringToNumericTest {
	ParsingStringToNumeric stm;
	Random rand;
	int n, intLowerLimit, intUpperLimit, intMethod;
	String word;
	
	@BeforeTest
	public void beforeTest() {
		stm = new ParsingStringToNumeric();
		rand = new Random();
		
		//change range here for initialisation length word (n)
		intLowerLimit = 1; //change here
		intUpperLimit = 7; //change here
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("===================== TEST STRING TO NUMERIC ====================");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intMethod++;
		System.out.println("===================== AWAL TEST METHOD "+intMethod+" ====================");
		
		n = rand.nextInt(intLowerLimit,intUpperLimit);
		word = stm.randomString(n);
		
	}
	
	@Test
	public void testDevide() {
		System.out.println("=================== Execute String to Numeric ===================");
		System.out.println("String : " + word);
		
		AssertJUnit.assertEquals(stm.convertStringToNumericActual(word), stm.convertStringToNumericExpected(word));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("==================== AKHIR TEST METHOD "+intMethod+" ====================");
	}
	
	@AfterTest
	public void afterTest() {
//		System.out.println("=== Execute After Test ===");
	}
}
