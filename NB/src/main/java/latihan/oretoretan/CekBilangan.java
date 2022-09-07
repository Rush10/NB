package latihan.oretoretan;

public class CekBilangan {
	public boolean cekGenap(int a) {
		boolean isTrue = false;
		if(a%2 == 0) {
			isTrue = true;
		}
		System.out.println("Hasil Bilangan Genap :" + isTrue);
		return isTrue;
	}
	
	public boolean cekGanjil(int a) {
		boolean isTrue = false;
		if(a%2 != 0) {
			isTrue = true;
		}
		System.out.println("Hasil Bilangan Ganjil :" + isTrue);
		return isTrue;
	}
}
