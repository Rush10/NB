package latihan.oretoretan.car;

public class Car{
	String bahanBakar; //harus diberikan private agar tidak bisa diakses utk menciptakan enkapsulasi
	int tahunPembuatan = 2000; //harus diberikan private agar tidak bisa diakses utk menciptakan enkapsulasi
	
	Car(String bahanBakar){
		this.bahanBakar= bahanBakar; 
	}
	
	void warna(){
		System.out.println("berwarna merah");
	}
	
	void mesin(){
		System.out.println("bermesin 1800 cc");;
	}
	
	int getTahunPembuatan(){
		return tahunPembuatan; 
	}
	
	String getBahanBakar(){
		return bahanBakar; 
	} 
}