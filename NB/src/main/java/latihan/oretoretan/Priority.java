package latihan.oretoretan;

public class Priority {
	public static void main(String[] args) {
//		Integer a = 10;
//		long a = 10;
		
		coba(10);
//		coba(a);
	}
	
	//overload
	public static void coba(Integer a) {
		System.out.println("Integer");
	}
	
	//overload
	public static void coba(int a) {
		System.out.println("int");
	}
	
	//overload
	public static void coba(long a) {
		System.out.println("long");
	}
}
