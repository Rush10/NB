package ujiantest.kedua;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.kedua.Geometri;

//Urutan Jenjang
//(1) ===+
//(2) ===
//(3) ==

public class GeometriTest {
	Geometri geo;
	Random rand;
	int intA, intB, intC, intLowerLimit, intUpperLimit;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("===+ TEST GEOMETRI +===");
		System.out.println("=== Execute Before Test ===");
		
		geo = new Geometri();
		rand = new Random();
		
		//change range here for initialisation input intA, input intB, & input intC
		intLowerLimit = 10; //change here
		intUpperLimit = 20; //change here
	}
	
	@Test
	public void testLuasPersegi() {
		System.out.println("== Execute Test Luas Persegi ==");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		System.out.println("Nilai A : " + intA);
		
		assertEquals(geo.luasPersegiActual(intA), geo.luasPersegiExpect(intA));
	}
	
	@Test
	public void testLuasSegitiga() {
		System.out.println("== Execute Test Luas Segitiga ==");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		intB = rand.nextInt(intLowerLimit,intUpperLimit);
		
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		
		assertEquals(geo.luasSegitigaActual(intA, intB), geo.luasSegitigaExpect(intA, intB));
	}
	
	@Test
	public void testLuasTrapesium() {
		System.out.println("== Execute Test Luas Trapesium ==");
		
		intA = rand.nextInt(intLowerLimit,intUpperLimit);
		intB = rand.nextInt(intLowerLimit,intUpperLimit);
		intC = rand.nextInt(intLowerLimit,intUpperLimit);
		
		System.out.println("Nilai A : " + intA);
		System.out.println("Nilai B : " + intB);
		System.out.println("Nilai C : " + intC);
		
		assertEquals(geo.luasTrapesiumActual(intA, intB, intC), geo.luasTrapesiumExpect(intA, intB, intC));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("=== Execute After Test ===");
	}
}
