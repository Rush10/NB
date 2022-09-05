package latihantest.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NetworkTest {
	@Test
	@Parameters({"pemilik","alamat"})
	public void browserTest(String pemilik, String alamat) {
		System.out.println("Komputer "+pemilik+" membuka "+alamat+"...");
	}
}
