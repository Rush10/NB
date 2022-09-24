package ujian.ujiankelima.jf;

import java.util.Random;
import java.util.Scanner;

////JAWABAN SOAL NOMOR 3
public class MethodMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String strLoop = "", strFirstIndex = "", strLastIndex = "";
		int intFirstIndex = 0, intLastIndex = 0;
		double dValueX = 0.0, dValueY = 0.0;
		
		do {
			try {				
				System.out.println("Input index AWAL: ");
				strFirstIndex = sc.nextLine();	
				intFirstIndex = Integer.parseInt(strFirstIndex);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Index Awal Tidak Dapat Diubah Menjadi Integer !!");
			}
		} while (true);
		
		do {
			try {				
				System.out.println("Input Index AKHIR: ");
				strLastIndex = sc.nextLine();	
				intLastIndex = Integer.parseInt(strLastIndex);
				if(intLastIndex > intFirstIndex) {
					break;
				} else {
					System.out.println("Index Akhir Harus Lebih Besar Dari Index Awal !!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Index Akhir Tidak Dapat Diubah Menjadi Integer !!");
			}
		} while (true);
		
		
		do {
			dValueX = rand.nextDouble(intFirstIndex, intLastIndex);
			System.out.println("Nilai X: " + dValueX);
			dValueY = rand.nextDouble(intFirstIndex, intLastIndex);
			System.out.println("Nilai Y: " + dValueY);
			
			System.out.println("=======================================================");
			System.out.println("Hasil Math SQRT dari nilai X = " + Math.sqrt(dValueX));
			System.out.println("Hasil Math POW dari nilai X & Y = " + Math.pow(dValueX,dValueY));	
			System.out.println("Hasil Math ABS dari nilai X = " + Math.abs(dValueX));						
			System.out.println("Hasil Math MAX dari nilai X & Y = " + Math.max(dValueX,dValueY));						
			System.out.println("Hasil Math MIN dari nilai X & Y = " + Math.min(dValueX,dValueY));	
			System.out.println("Hasil Math EXP dari nilai X = " + Math.exp(dValueX));	
			System.out.println("Hasil Math LOG dari nilai X = " + Math.log(dValueX));	
			System.out.println("Hasil Math LOG10 dari nilai X = " + Math.log10(dValueX));	
			System.out.println("Hasil Math FLOOR dari nilai X = " + Math.floor(dValueX));	
			System.out.println("Hasil Math CEIL dari nilai X = " + Math.ceil(dValueX));	
			System.out.println("=======================================================");
			
			
			System.out.println("Do you want to stop the looping (Y)?");
			strLoop = sc.next();
			if(strLoop.equalsIgnoreCase("Y")) {
				break;
			}
		} while (true);
	}

}
