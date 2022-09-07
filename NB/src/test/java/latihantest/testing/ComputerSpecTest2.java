package latihantest.testing;

import static org.testng.Assert.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import latihan.cobamodul.Computer;

public class ComputerSpecTest2 {
	@Test @Parameters("pemilik")
	public void OSTest(String pemilik) {
		System.out.println("Memeriksa OS komputer milik "+pemilik+"...");
		String computerOS = Computer.OS;
		String required = "Windows XP";
		assertEquals(computerOS, required, "OS pada komputer anda bukan Windows XP.");
	}
	@Test @Parameters("pemilik")
	public void browserTest(String pemilik) {
		System.out.println("Memeriksa apakah komputer milik "+pemilik+" memiliki browser..");
		boolean browserExist = Computer.appList.contains("Opera")||
		Computer.appList.contains("Mozilla Firefox")||
		Computer.appList.contains("Internet Explorer")||
		Computer.appList.contains("Google Chrome");
		assertTrue(browserExist,"Komputer anda tidak memiliki browser.");
	}
}
