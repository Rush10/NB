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

import ujian.kedua.Geometri;

public class GeometriTest {
	Geometri geo;
	Random rand;
	int intA, intB, intC, intLowerLimit, intUpperLimit, intMethod;
	
	@BeforeTest
	public void beforeTest() {
//		System.out.println("=========================== AWAL TEST ===========================");
		
		geo = new Geometri();
		rand = new Random();
		intMethod = 0;
		
		//change range here for initialisation input intA, input intB, & input intC
		intLowerLimit = 10; //change here
		intUpperLimit = 20; //change here
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("========================= GEOMETRI TEST =========================");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intMethod++;
		System.out.println("===================== AWAL TEST METHOD "+intMethod+" (G) ====================");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		intB = rand.nextInt(intLowerLimit,intUpperLimit);
		intC = rand.nextInt(intLowerLimit,intUpperLimit);
	}
	
	@Test(priority = 1)
	public void testLuasPersegi() {
		System.out.println("================== Execute Test Luas Persegi ====================");
		
		System.out.println("Nilai A : " + intA);
		
		AssertJUnit.assertEquals(geo.luasPersegiActual(intA), geo.luasPersegiExpect(intA));
	}
	
	@Test(priority = 2)
	public void testLuasSegitiga() {
		System.out.println("================== Execute Test Luas Segitiga ===================");
		
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		
		AssertJUnit.assertEquals(geo.luasSegitigaActual(intA, intB), geo.luasSegitigaExpect(intA, intB));
	}
	
	@Test(priority = 3)
	public void testLuasTrapesium() {
		System.out.println("================== Execute Test Luas Trapesium ==================");
		
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		System.out.println("Nilai C : " + intC);
		
		AssertJUnit.assertEquals(geo.luasTrapesiumActual(intA, intB, intC), geo.luasTrapesiumExpect(intA, intB, intC));
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("==================== AKHIR TEST METHOD "+intMethod+" (G) ====================");
	}
	
	@AfterTest
	public void afterTest() {
//		System.out.println("=========================== AKHIR TEST ==========================");
	}
}