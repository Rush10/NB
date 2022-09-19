package latihan.logika;

import java.util.Random;
import java.util.Scanner;

public class UtilRandom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randomValue = new Random();
		
		System.out.println("masukkan jumlah nilai random: ");
		int n = sc.nextInt();
		System.out.println("masukkan jumlah batas bawah nilai random: ");
		int low = sc.nextInt();
		System.out.println("masukkan jumlah batas atas nilai random: ");
		int high = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nilai random ke-" +i+ " yaitu " + randomValue.nextInt(low,high+1));
		}
	}
}
