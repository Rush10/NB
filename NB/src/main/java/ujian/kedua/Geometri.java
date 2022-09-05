package ujian.kedua;

public class Geometri {
	public int luasPersegiExpect(int s){
		int intLuas = 0;
		
		intLuas = s*s;
		System.out.println("Ini hasil method luasPersegiExpect: " + intLuas);
		
		return intLuas;
	}
	
	public int luasPersegiActual(int s){
		int intLuas = 0;
		
		intLuas = (int)Math.pow(s, 2);
		System.out.println("Ini hasil method luasPersegiActual: " + intLuas);
		
		return intLuas;
	}
	
	public double luasSegitigaExpect(int alas, int tinggi){
		double intLuas = 0;
		
		intLuas = 0.5 * alas * tinggi;
		System.out.println("Ini hasil method luasSegitigaExpect: " + intLuas);
		
		return intLuas;
	}
	
	public double luasSegitigaActual(int alas, int tinggi){
		double intLuas = 0;
		
		intLuas = (alas*tinggi)*((double)1/2);
		System.out.println("Ini hasil method luasSegitigaActual: " + intLuas);
		
		return intLuas;
	}
	
	public double luasTrapesiumExpect(int a, int b, int tinggi){
		double intLuas = 0;
		
		intLuas = 0.5 * tinggi * (a + b);
		System.out.println("Ini hasil method luasTrapesiumExpect: " + intLuas);
		
		return intLuas;
	}
	
	public double luasTrapesiumActual(int a, int b, int tinggi){
		double intLuas = 0;
		
		intLuas = (a + b)*((double)1/2)*tinggi;
		System.out.println("Ini hasil method luasTrapesiumActual: " + intLuas);
		
		return intLuas;
	}
	
	
	
	
}
