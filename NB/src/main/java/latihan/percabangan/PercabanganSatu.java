package latihan.percabangan;

import java.util.Scanner;

public class PercabanganSatu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isLapar = true;
		boolean isHujan = true;
		
//		System.out.println("Apakah Saya Lapar (true/false)?");
//		isLapar = sc.nextBoolean();
		
		if (isLapar) {
//			System.out.println("Apakah Hujan (true/false)?");
//			isHujan = sc.nextBoolean();	
			
			if (isHujan) {
				System.out.println("Saya masak sendiri");
			} else {
				System.out.println("Saya makan diluar");					
			}
		} else {				
			System.out.print("Saya rebahan");
		}
	}
}
