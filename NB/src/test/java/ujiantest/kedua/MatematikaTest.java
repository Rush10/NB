package ujiantest.kedua;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.kedua.Matematika;

//Urutan Jenjang
//(1) ===+
//(2) ===
//(3) ==
//(4) =

public class MatematikaTest {
	Matematika math;
	Random rand;
	int intA, intB, intLowerLimit, intUpperLimit;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("===+ TEST MATH +===");
		System.out.println("=== Execute Before Test ===");
		
		math = new Matematika();
		rand = new Random();
		
		//change range here for initialisation input intA & input intB
		intLowerLimit = 10; //change here
		intUpperLimit = 50; //change here
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("== Execute Before Method ==");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		intB = rand.nextInt(intLowerLimit,intUpperLimit);
		
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
	}
	
	@Test
	public void testDevide() {
		System.out.println("= Execute Test Devide =");
		
		assertEquals(math.devideActual(intA, intB), math.devideExpect(intA, intB));
	}
	
	@Test
	public void testMod() {
		System.out.println("= Execute Test Mod =");
		
		assertEquals(math.modActual(intA, intB), math.modExpect(intA, intB));
	}
	
	@Test
	public void testSubtract() {
		System.out.println("= Execute Test Subtract =");
		
		assertEquals(math.subtractActual(intA, intB), math.subtractExpect(intA, intB));
	}
	
	@Test
	public void testSum() {
		System.out.println("= Execute Test Sum =");
		
		assertEquals(math.sumActual(intA, intB), math.sumExpect(intA, intB));
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
