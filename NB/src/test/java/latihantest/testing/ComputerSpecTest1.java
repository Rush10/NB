package latihantest.testing;

import static org.testng.Assert.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import latihan.testing.Computer;

public class ComputerSpecTest1 {
	@Test @Parameters("pemilik")
	public void RAMTest(String pemilik) {
		System.out.println("Memeriksa RAM komputer milik "+pemilik+"...");
		boolean RAM_OK = Computer.RAM_MB >= 256;
		assertTrue(RAM_OK, "RAM komputer anda kurang dari 256 MB");
	}
	
	@Test @Parameters("pemilik")
	public void StorageTest(String pemilik) {
		System.out.println("Memeriksa storage komputer milik "+pemilik+"...");
		boolean Storage_OK = Computer.storage_GB >= 64;
		assertTrue(Storage_OK, "RAM komputer anda kurang dari 64 GB");
	}
}	

