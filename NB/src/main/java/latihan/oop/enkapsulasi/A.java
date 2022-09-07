package latihan.oop.enkapsulasi;

public class A {
	private int a;
	private int b;
	
	//alt + shift + s => pilih constructor using field
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//alt + shift + s => pilih generate setter/getter
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
