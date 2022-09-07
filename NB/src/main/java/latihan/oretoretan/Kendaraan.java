package latihan.oretoretan;

public class Kendaraan{

	public static void main(String[] args) {
		Car mobil = new Car("Pertalite");
		mobil.bahanBakar = "Solar";
		mobil.tahunPembuatan = 2010;
		
		mobil.warna();
		mobil.mesin();
		
		System.out.println("bahannya : " + mobil.getBahanBakar());
		System.out.println("tahun pembuatan :" + mobil.getTahunPembuatan());
	}

}
