package latihan.training.oop.inheritancepoli;

public class A{
	void func(){ 
		System.out.println("Coba A");
	}
	
	//method kebawah ini merupakan overload
	void func1(){ 
		System.out.println("Coba A1");
	}
	
	void func1(String a){ 
		System.out.println(a);
	}
	
//	int func1(int a){ 
//		return a; //ini akan error karena parameter sama dengan method dibawah walaupun beda tipe method
//	}
	
	void func1(int a){ 
		System.out.println(a);
	}
	
	void func1(int a, int b){ 
		System.out.println(a+b);
	}
	
	void func1(int a, int b, int c){ 
		System.out.println(a+b+c);
	}
}
