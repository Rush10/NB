package latihan.exceptionhandling;

import java.io.IOException;

public class TryCatch {
	public static void main(String[] args) {
//		checked(); //ini checked error (dideteksi oleh JVM sebelum runtime)
//		unchecked(); //ini unchecked error (dideteksi oleh JVM pada saat runtime)
		try {
			unchecked();			
		} catch (ArithmeticException e) {//penggunaan catch seperti ini lebih disarankan
			System.out.println("1");
		}
//		catch(Exception e) {} //ini sudah mengandung semua exception (dipakai ketika tdk tahu nama errornya)
		System.out.println("2");
	}
	
	static void unchecked() throws ArithmeticException{
		System.out.println("masuk 1"); //ini tereksekusi
		int a = 1/0; //contoh arithmetic error
		System.out.println("masuk 2"); //ini tidak akan dieksekusi
		
		throw new ArithmeticException(); //throw utk testing (mencoba melempar error)
	}
	
	static void checked() throws IOException{
		System.out.println("IO Exception");
	}
}
