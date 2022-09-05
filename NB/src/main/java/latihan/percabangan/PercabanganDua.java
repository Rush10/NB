package latihan.percabangan;

import java.util.Scanner;

public class PercabanganDua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.println("Masukkan bilangan bulat:");
		x = sc.nextInt();
		
		if (x > 10) {
			if (x%2 == 0) { //bugs disini, seharusnya x%2 == 0, bukan x%2 = 0
				System.out.println("Bilangan Genap > 10");
			}else {
				System.out.println("Bilangan Ganjil > 10");				
			}			
		} else {
			if (x%2 == 0) { //bugs disini, seharusnya x%2 == 0, bukan x%2 = 0
				System.out.println("Bilangan Genap <= 10"); //bugs disini, seharusnya <= 10, bukan < 10, bugs informasi 
			}else {
				System.out.println("Bilangan Ganjil < 10"); 			
			}			
		}
	}
}
