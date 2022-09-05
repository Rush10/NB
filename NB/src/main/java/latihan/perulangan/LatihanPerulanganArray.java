package latihan.perulangan;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import latihan.logika.Palindrom;

public class LatihanPerulanganArray extends Palindrom{
	public static final double phi = 3.14;
	public static void main(String[] args) {
		
		boolean isTrue = false;
		
		do {			
			try {
				isTrue = false;
				Scanner sc = new Scanner(System.in);
				System.out.print("masukkan angka: ");
				int a = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("masukkan numerik!!");
				isTrue = true; 
			}
		} while (isTrue);
		System.out.println("Berhasil");
		
//		Random rand = new Random();
//		String m = "malam";
//		Palindrom p = new Palindrom();
//		p.hitung(m);
		
//		Palindrom a = new Palindrom();
		
//		System.out.println(a.hitung(m));
//		long a = 0;
//		long b = 1000000000000l;
//		double c = 1.000000000000001000000000000000000000000000001d;
//		float d = 1.000000100000000000000000000000000000000000001f;
//		
//		a = b * 2;
		
//		System.out.println(a);
//		System.out.println(b);

//		c = Math.log10(a);
		
//		System.out.println(d);
//		 //Tidak disarankan memakai perulangan seperti ini (1) karena jika di break akan memberhentikan loop parent
//		 int next = 0; //(1)
//		 for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				next++; //(1)
//				if(next == 2) { //(1)
//					System.out.println(i + " ini terlompati " + j);
//					break;
//				}
//			}
//		 }
		 
//		//Penggunaan break
//		 for (int i = 0; i < 2; i++) {
//			 for (int j = 0; j < 4; j++) {
//				 if(j == 2) {
//					 System.out.println(i + " ini terlompati " + j);
//					 break;
//				 }
//				 System.out.println(i + " ini tdk terlompati " + j);
//			 }
//		 }
		 
//		 //Penggunaan continue
//		 for (int i = 0; i < 2; i++) {
//			 for (int j = 0; j < 4; j++) {
//				 if(next == 2) {
//					 System.out.println(i + " ini terlompati " + j);
//					 continue;
//				 }
//				 System.out.println(i + " ini tdk terlompati " + j);
//			 }
//		 }
		
//		 int[][] arrIntA = new int[1][3]; //cth deklarasi array (manual) & inisialisasi (otomatis oleh java) isi dari array
//		 arrA = {{1,2,3}}; //inisialisasi array seperti ini tidak bisa
//		 arrA[1][1] = 4; //coding tidak error, tapi ketika dijalankan akan error
//		 arrIntA[0][1] = 4; //utk menginisialisasi arrA maka dilakukan input satu per satu ke dalam index
//		 System.out.println(arrIntA[0][1]); //menampilkan isi dari array berdasarkan index
//		 
//		 int[][] arrIntB = {{1,2,3}}; //cth deklarasi (manual) dan inisialisasi array (manual)
//		 System.out.println(arrIntB[0][1]); x
		 
//		 int[] arrIntSort = {4,6,7,8,2};
//		 int intTemp1 = 0;
//		 int intTemp2 = 0;
//		 int intIndex = 0;
//		 
//		 intTemp1 = arrIntSort[0];
//		 
//		 for (int i = 0; i < arrIntSort.length; i++) {
//			
//		}
//		 for (int i = 0; i < arrIntSort.length; i++) {
//			if(intTemp1 == arrIntSort[i]) {
//				intIndex = i;
//				continue;
//			}
//			
//			if(arrIntSort[i] < intTemp1 ) {
//				intTemp2 = intTemp1;
//				intTemp1 = arrIntSort[i];
//				arrIntSort[i] = intTemp2;
//				arrIntSort[intIndex] = intTemp1;
//			}
//		 } 
//		 
//		 for (int i = 0; i < arrIntSort.length; i++) {
//			System.out.println(arrIntSort[i]);
//		}		
		
//		int[] b = {1,2,3,4,5};
//		
//		int sum = (0+5)/4;
//		
//		System.out.println(sum);
//		System.out.println(b[sum]);
		
//		String b = null;
//		System.out.println(b);
//		
//		int c = 5, e = 3;
//		Integer d = 3;
//
//		System.out.println(c);
//		System.out.println(c==d);
		
//		String a = "TOA"; 
//		String b = "TOE"; 
//		System.out.println(b.compareTo(a));
		
//		String a = "Dono";
//		String b = "Do";
//		
//		System.out.println(a.compareTo(b));
//		System.out.println(b.compareTo(a));
		
	}
}
