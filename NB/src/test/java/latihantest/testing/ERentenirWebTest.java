package latihantest.testing;

import org.testng.annotations.Test;

public class ERentenirWebTest {
	@Test(groups = {"login", "flow rentenir", "flow peminjam"})
	public void LoginTest() {
		System.out.println("Memeriksa halaman web Login...");
	}
	
	@Test(groups = "flow rentenir")
	public void RentenirHomePageTest() {
		System.out.println("Memeriksa halaman beranda web Rentenir...");
	}
	
	@Test(groups = "flow peminjam")
	public void PeminjamHomePageTest() {
		System.out.println("Memeriksa halaman beranda web Peminjam...");
	}

}
