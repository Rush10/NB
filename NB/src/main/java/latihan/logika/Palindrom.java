package latihan.logika;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukkan kata: ");
		String input = sc.next();
		
//		hitung(input);
	}
	
	public static void hitung(String input) {
		StringBuilder strBuilder = new StringBuilder();
		String temp = "";
		
		for (int i = input.length(); i > 0; i--) {
			temp = strBuilder.append(input.substring(i-1,i)).toString();
		}
		
		if(temp.equalsIgnoreCase(input)){
			System.out.println(input + " adalah palindrom");
		} else {
			System.out.println(input + " bukan palindrom");			
		}
	}
}
