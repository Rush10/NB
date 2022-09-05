package latihan.lambda;

public class LambdaClass {
	public static void main(String[] args) {
		Lambda lb = (a,b)->{return a+b;};
		
		int summary = lb.sum(4,5);
		
		System.out.println(summary);
	}
}
