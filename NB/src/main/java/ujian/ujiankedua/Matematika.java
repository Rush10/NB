package ujian.ujiankedua;

public class Matematika {
	public int sumExpect(int a, int b){
		int intSum = 0;
		
		intSum = a+b;
		System.out.println("Ini hasil method sumExpect: " + intSum);
		
		return intSum;
	}
	
	public int sumActual(int a, int b){
		int intSum = 0;
		
		intSum = ((a*b)/(a*b))*a+((a*b)/(a*b))*b;
		System.out.println("Ini hasil method sumActual: " + intSum);
		
		return intSum;
	}
	
	public int subtractExpect(int a, int b){
		int intSub = 0;
		
		intSub = a-b;
		System.out.println("Ini hasil method subtractExpect: " + intSub);
		
		return intSub;
	}
	
	public int subtractActual(int a, int b){
		int intSub = 0;
		
		intSub = ((a/a*b/b)/(a/a*b/b))*(a-b);
		System.out.println("Ini hasil method subtractActual: " + intSub);
		
		return intSub;
	}
	
	public double devideExpect(int a, int b){
		double dDevide = 0.0;
		
		dDevide = (double)a/b;
		System.out.println("Ini hasil method devideExpect: " + dDevide);
		
		return dDevide;
	}
	
	public double devideActual(int a, int b){
		double dDevide = 0.0;
		
		dDevide = (double)(a*(a+b)*(a+b)*a)/(b*(a+b)*(a+b)*a);
		System.out.println("Ini hasil method devideActual: " + dDevide);
		
		return dDevide;
	}
	
	public double modExpect(int a, int b){
		double dMod = 0.0;
		
		dMod = (double)a%b;
		System.out.println("Ini hasil method modExpect: " + dMod);
		
		return dMod;
	}
	
	public double modActual(int a, int b){
		double dMod = 0.0;
		int intX = 0, intY = 0;
		
		intX = a / b;	//finding quotient 
		intY = intX * b;	//finding product
		dMod = a - intY;	//finding modulus	
		
		System.out.println("Ini hasil method modActual: " + dMod);
		
		return dMod;
	}
}
