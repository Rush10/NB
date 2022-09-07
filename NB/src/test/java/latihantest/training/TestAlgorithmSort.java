package latihantest.training;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import latihan.oretoretan.SortAlgorithm;

public class TestAlgorithmSort {
	SortAlgorithm sA;
//	int[] intArr = {8,5,9,2,1,4,6,3,7,10};//statis
	Random rand;
	int n;
	int[] intArrDynamic;
	int low;
	int high;
	int loop;
	
	
	
	@BeforeTest
	public void beforeTest() {
		sA = new SortAlgorithm();
		rand = new Random();
		System.out.println("Execute Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod1() {
		low = 1;
		high = 50;
		
		high += 1;
		
		n = rand.nextInt(low,high);
		
		intArrDynamic = new int[n];
		System.out.println("Execute Before Method");
	}
	
//	@BeforeMethod
//	public void beforeMethod2() {
//		low = 1;
//		high = 20;
//		
//		high += 1;
//		
//		n = rand.nextInt(low,high);
//		
//		intArrDynamic = new int[n];
//		
//		System.out.println("Execute Before Method 2");
//	}
	
	@Test
	public void sortTest1() {
		low = 500;
		high = 1000;
		
		high += 1;
		
		System.out.println("Jumlah Data: " + n);
		
		for(int i = 0; i < intArrDynamic.length; i++) {
			intArrDynamic[i] = rand.nextInt(low,high);
		}
		
		assertEquals(sA.selectionSortASCInt(intArrDynamic),sA.bubbleSortASCInt(intArrDynamic));
		System.out.println("Ini test 1");
	}

	@Test
	public void sortTest2() {
		low = 1;
		high = 50;
		
		high += 1;
		System.out.println("Jumlah Data: " + n);
		
		for(int i = 0; i < intArrDynamic.length; i++) {
			intArrDynamic[i] = rand.nextInt(low,high);
		}
		
		assertEquals(sA.selectionSortASCInt(intArrDynamic),sA.bubbleSortASCInt(intArrDynamic));
		System.out.println("Ini test 2");
	}
	
//	@AfterMethod
//	public void afterMethod1() {
//		System.out.println("Execute After Method 1");
//	}
	
//	@BeforeMethod
//	public void beforeMethod2() {
//		low = 1;
//		high = 20;
//		
//		high += 1;
//		
//		n = rand.nextInt(low,high);
//		
//		intArrDynamic = new int[n];
//		
//		System.out.println("Execute Before Method 2");
//	}

	
//	@Test
//	public void sortTest2() {
//		low = 1;
//		high = 50;
//		
//		high += 1;
//		System.out.println("Jumlah Data: " + n);
//		
//		for(int i = 0; i < intArrDynamic.length; i++) {
//			intArrDynamic[i] = rand.nextInt(low,high);
//		}
//		
//		assertEquals(sA.selectionSortASCInt(intArrDynamic),sA.bubbleSortASCInt(intArrDynamic));
//		System.out.println("Ini test 2");
//	}
	
//	@AfterMethod
//	public void afterMethod2() {
//		System.out.println("Execute After Method 2");
//	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Execute After Method");
	}

	
	@AfterTest
	public void afterTest() {
		System.out.println("Execute After Test");
	}
}
