package ujiantest.kedua;

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

import ujian.kedua.Matematika;

public class MatematikaTest {
	Matematika math;
	Random rand;
	int intA, intB, intLowerLimit, intUpperLimit, intMethod;
	
	@BeforeTest
	public void beforeTest() {
		math = new Matematika();
		rand = new Random();
		
		//change range here for initialisation input intA & input intB
		intLowerLimit = 10; //change here
		intUpperLimit = 50; //change here
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("=========================== MATH TEST ===========================");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intMethod++;
		System.out.println("===================== AWAL TEST METHOD "+intMethod+" (M) ====================");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		intB = rand.nextInt(intLowerLimit,intUpperLimit);
	}
	
	@Test(priority = 3)
	public void testDevide() {
		System.out.println("====================== Execute Test Devide ======================");
		
		AssertJUnit.assertEquals(math.devideActual(intA, intB), math.devideExpect(intA, intB));
	}
	
	@Test(priority = 4)
	public void testMod() {
		System.out.println("======================= Execute Test Mod ========================");
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		AssertJUnit.assertEquals(math.modActual(intA, intB), math.modExpect(intA, intB));
	}
	
	@Test(priority = 2)
	public void testSubtract() {
		System.out.println("===================== Execute Test Subtract =====================");
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		AssertJUnit.assertEquals(math.subtractActual(intA, intB), math.subtractExpect(intA, intB));
	}
	
	@Test(priority = 1)
	public void testSum() {
		System.out.println("======================= Execute Test Sum ========================");
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		AssertJUnit.assertEquals(math.sumActual(intA, intB), math.sumExpect(intA, intB));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("==================== AKHIR TEST METHOD "+intMethod+" (M) ====================");
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
}
