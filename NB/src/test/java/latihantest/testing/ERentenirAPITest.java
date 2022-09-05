package latihantest.testing;

import org.testng.annotations.Test;

public class ERentenirAPITest {
	@Test(groups = {"login", "flow rentenir", "flow peminjam"})
	public void LoginAPITest() {
		System.out.println("Memeriksa API Login...");
	}
	
	@Test(groups = "flow rentenir")
	public void RentenirHomePageAPITest() {
		System.out.println("Memeriksa API beranda Rentenir...");
	}
	
	@Test(groups = "flow peminjam")
	public void PeminjamHomePageAPITest() {
		System.out.println("Memeriksa API beranda Peminjam...");
	}
}
