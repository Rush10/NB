package latihan.percabangan;

import java.util.Scanner;

public class PercabanganTiga {
	//bugs
	//	(1). m > 20 tidak memberikan informasi lebih detail. Sehingga membuat pembaca dapat berasumsi 
	//	     jika mereka memasukkan angka lebih dari 20 atau kurang dari sama dengan 20 maka akan masuk ke pernyataan
	//	     true atau false tetapi bukan seperti itu.
	//	(2). dalam alur setelah pengecekan kondisi m > 20 terdapat alur true tetapi tidak ada alur false sehingga itu juga 
	//	     dapat membuat pembaca berasumsi jika itu tidak masuk ke dalam pernyataan false (tidak memakai else) 
	//       padahal jika dilihat dari alur ke end seharusnya masuk dalam pernyataan false atau harus dimasukkan ke else
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char m;
		
		System.out.print("Masukkan data char:");
		m = sc.next().charAt(0);
		
		if (m > 67) { //bugs disini (1)
			if(m == 'c') {
				System.out.println("1");
			} else {
				System.out.println("2");				
			}
		} else { //bugs disini (2)	
			if(m == 'k') {
				System.out.println("3");
			} else {
				System.out.println("4");			
			}
		}
		
	}
}
