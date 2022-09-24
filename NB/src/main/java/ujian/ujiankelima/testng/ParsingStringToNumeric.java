package ujian.ujiankelima.testng;

import java.util.Random;

public class ParsingStringToNumeric {

	public double convertStringToNumericExpected(String word) {
		double dValue = 0d;
		
		try {			
			dValue = Double.parseDouble(word);
		} catch (Exception e) {
			dValue = 0d; //0 == balikan error double
		}
		
		System.out.println("Ini hasil method convertStringToNumericExpected (Double): " + dValue);
		
		return dValue;
	}
	
	public double convertStringToNumericActual(String word) {
		float fValue = 0f;
		double dValue = 0d;
		
		try {			
			fValue = Float.parseFloat(word);
		} catch (Exception e) {
			fValue = 0f; //0 == balikan error float
		}
		
		System.out.println("Ini hasil method convertStringToNumericActual (Float): " + fValue);
			
		dValue = (double)fValue;
		
		return dValue;
	}
	
	public static String randomString(int n) {
		int randChar = 0;
		final char charBatasBawahChar = 48;
		final char charBatasAtasChar = 58;
		Random rand = new Random();
		String strRandomString = "", strTemp = "";
		
		for (int i = 0; i < n; i++) {
			randChar = rand.nextInt(charBatasBawahChar,charBatasAtasChar);
			strRandomString += (char)randChar;
		}
		
		strTemp = strRandomString.replace('0', '.');
		
		return strTemp;
	}

}
