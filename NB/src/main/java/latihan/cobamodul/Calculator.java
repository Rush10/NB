package latihan.cobamodul;

public class Calculator {
	public static void main(String[] args) {
		coba();
		System.out.println("Tambah: " + add(4, 2));
		System.out.println("Kurang: " + subtract(4, 2));
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
	public static void coba() {
		System.out.println("coba");
	}
}
