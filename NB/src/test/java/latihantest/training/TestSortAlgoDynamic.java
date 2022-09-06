package latihantest.training;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import latihan.training.SortAlgorithm;

public class TestSortAlgoDynamic {

	int[] intNext;
	String strNext;
	Random rand;
	int indexAwal;
	int indexAkhir;
	int jumlahData;
	SortAlgorithm sA;
	int loopMethod;
	
	
	@BeforeTest
	public void befTest()
	{
//		System.out.println("TEST DIMULAI ");
		sA = new SortAlgorithm();
		rand = new Random();
		loopMethod = 0;
		strNext = "";
	}
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("=========================== SORT TEST ===========================");
	}
	
	@BeforeMethod
	public void befMethod()
	{
		loopMethod++;
		System.out.println("===================== AWAL TEST METHOD "+loopMethod+" (SO) ===================");
		jumlahData = rand.nextInt(5,20);
		intNext = new int[jumlahData];
	}
	
	@Test
	public void testKedua()
	{
		System.out.println("======================= Execute Test Sort =======================");
		indexAwal = 1000;
		indexAkhir = 10000;
		for(int i=0;i<jumlahData;i++)
		{
			intNext[i] = rand.nextInt(indexAwal,indexAkhir);
			strNext += Integer.toString(intNext[i])+",";
		}
		strNext = strNext.substring(0,strNext.length()-1);
		System.out.println(strNext + " --> Before Sorting");
		assertEquals(sA.selectionSortASCInt(intNext),sA.bubbleSortASCInt(intNext)," KEDUA DATA TIDAK COCOK ");	
	} 
	
	
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("==================== AKHIR TEST METHOD "+loopMethod+" (SO) ===================");
	}
	
	@AfterClass
	public void aftClass()
	{
//		System.out.println("ini adalah AFTER CLASS");
	}
	
	@AfterTest
	public void aftTest()
	{
//		System.out.println("TEST SUDAH SELESAI DILAKUKAN !! ");
	}
}
