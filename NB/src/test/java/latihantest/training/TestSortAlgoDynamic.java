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

	int [] intNext ;
	Random rand ;
	int indexAwal;
	int indexAkhir;
	int jumlahData;
	SortAlgorithm sA;
	int loopAfter=1;
	int loopBefore=1;
	
	
	@BeforeTest
	public void befTest()
	{
		System.out.println("TEST DIMULAI ");
		sA = new SortAlgorithm();
		rand = new Random();		
	}
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("ini adalah BEFORE CLASS");
	}
	
	@BeforeMethod
	public void befMethod()
	{
		System.out.println("ini adalah before method yang ke - "+loopBefore);
		jumlahData = rand.nextInt(5,20);
		intNext = new int[jumlahData];
		loopBefore++;
	}
	
	@Test
	public void testPertama()
	{
//		String randjgD = Integer.toString(rand.nextInt(charBatasBawahLowerAlphabeth,charBatasAtasLowerAlphabeth));
//		int randjgI = (int)rand.nextInt(charBatasBawahLowerAlphabeth,charBatasAtasLowerAlphabeth);
		System.out.println("ini adalah TEST CASE yang ke - 1");
		indexAwal = 0;
		indexAkhir = 100;
		
		for(int i=0;i<jumlahData;i++)
		{
			intNext[i] = rand.nextInt(indexAwal,indexAkhir);
		}
			;		
	} 
	
	@Test
	public void testKedua()
	{
		System.out.println("ini adalah TEST CASE yang ke - 2");
		indexAwal = 1000;
		indexAkhir = 10000;
		for(int i=0;i<jumlahData;i++)
		{
			intNext[i] = rand.nextInt(indexAwal,indexAkhir);
		}
		assertEquals(sA.selectionSortASCInt(intNext),sA.bubbleSortASCInt(intNext)," KEDUA DATA TIDAK COCOK ");	
	} 
	
	
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("ini adalah after method yang ke - "+loopAfter);
		loopAfter++;
	}
	
	@AfterClass
	public void aftClass()
	{
		System.out.println("ini adalah AFTER CLASS");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("TEST SUDAH SELESAI DILAKUKAN !! ");
	}
}
