package latihantest.training;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.training.CekBilangan;

public class CekBilanganTest {
	CekBilangan cb;
	Random rand;
	int bil;
	
	@BeforeMethod
	public void setUp() {
		cb = new CekBilangan();
		rand = new Random();
		bil = rand.nextInt(1,101);
		System.out.println("Bilangan: " + bil);
	}
	
	@Test(priority = 0)
	public void testBilGenap() {
		assertEquals(cb.cekGenap(bil), true);
	}
	
	@Test(priority = 1)
	public void testBilGanjil() {
		assertEquals(cb.cekGanjil(bil), false);
	}
}
