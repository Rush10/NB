package latihantest.training;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import latihan.oretoretan.Calculator;

public class TestCalculator {
	
//	boolean isAgain = false;
//	
//	System.out.println("Masukkan nilai random (nilai lower limit < nilai upper limit)");
//	System.out.print("Masukkan nilai lower limit: ");
//	intLowerLimit = sc.nextInt();
//	
//	do {	
//		do {		
//			isAgain = false;
//			try {
//				System.out.print("Masukkan nilai upper limit: ");
//				intUpperLimit = sc.nextInt();				
//			} catch (Exception e) {
//				isAgain = true;
//			}
//		} while (isAgain);
//		if(intLowerLimit > intUpperLimit) {
//			System.out.println("Nilai upper limit harus lebih besar!!");
//		}
//	} while (intLowerLimit > intUpperLimit);
//	
//	intUpperLimit += 1;
	@Test
	public void add() {
		Calculator c = new Calculator();
		assertEquals(c.add(5, 10), 15);
	}
	
	@Test
	public void miltiplication() {
		Calculator c = new Calculator();
		assertEquals(c.multiplication(6, 7), 42);
	}
	
	@Test
	public void devide() {
		Calculator c = new Calculator();
		assertEquals(c.devide(10, 3), 3.333);
	}
	
	@Test
	public void subtract() {
		Calculator c = new Calculator();
		assertEquals(c.subtract(5, 10), -5);
	}
}
