package latihan.oop.enkapsulasi;

public class B {
	public static void main(String[] args) {
		A var = new A(1,2);
		int a = 0;
		int b = 0;
		
		a = var.getA();
		b = var.getB();
		
		System.out.println("a + b = " + (a+b));
		
		var.setA(3);
		var.setB(4);
		
		a = var.getA();
		b = var.getB();
		
		System.out.println("a + b = " + (a+b));
	}
}
