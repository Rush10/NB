package latihantest.training;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import latihan.oretoretan.cobaoop.ShoopingActivity;

public class TestShopping {

	ShoopingActivity sa = new ShoopingActivity();
	
	@Test
	public void addProdSatu()
	{
		assertEquals(sa.addProdSatu(), 10000);
	}
	
	@Test
	public void hitungBelanja()
	{
		assertEquals(sa.hitungTotalBelanja(),9500);
	}
	
	
}