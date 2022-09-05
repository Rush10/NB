package latihan.collection;

public class Data {
	private String nama;
	private int umur;
	private String alamat;
	
	Data(){
		
	}
	
	Data(String nama, int umur, String alamat){
		this.nama = nama;
		this.umur = umur;
		this.alamat = alamat;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
}
