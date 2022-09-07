	package latihan.oretoretan;

//import java.util.Iterator;

public class StringConcatTesting {
	public static void main(String[] args) {
//		String a = "selalu";
		StringBuffer b = new StringBuffer("selalu");
		for (int i = 0; i < 1000; i++) {
//			a += "selalu ";
//			a = a.concat("selalu ");
			b = b.append("selalu ");
		}
//		System.out.println(a);
		System.out.println(b);
	}
}
