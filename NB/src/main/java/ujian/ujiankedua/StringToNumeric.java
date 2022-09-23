package ujian.ujiankedua;

import java.util.Random;

public class StringToNumeric {
	
	public long convertStringToNumericActual(String word) {
		String strTempWord = "";
		char[] arrCharWord;
		long lNum = 0l;
		
		strTempWord = word.toLowerCase();
		arrCharWord = strTempWord.toCharArray();
		strTempWord = "";
		
		for (int i = 0; i < arrCharWord.length; i++) {
			strTempWord += (int)arrCharWord[i];
		}
		
		try {			
			lNum = Long.parseLong(strTempWord);
		} catch (Exception e) {
			lNum = 0; //0 == balikan error long
		}
		
		System.out.println("Ini hasil method convertStringToNumericActual: " + lNum);
		
		return lNum;
	}
	
	public long convertStringToNumericExpected(String word) {
		String strTempWord = "", strTempWord2= "";
		long lNum = 0l;
		
		strTempWord = word.toLowerCase();
		
		for (int i = 0; i < strTempWord.length(); i++) {
			strTempWord2 += (int)strTempWord.charAt(i);
		}
		
		try {			
			lNum = Long.parseLong(strTempWord2);
		} catch (Exception e) {
			lNum = 0; //0 == balikan error long
		}
		
		System.out.println("Ini hasil method convertStringToNumericExpected: " + lNum);
		
		return lNum;
	}
	
	public String randomString(int n) {
		int randAlphabeth = 0;
		final char charBatasBawahAlphabeth = 97;
		final char charBatasAtasAlphabeth = 123;
		Random rand = new Random();
		String strRandomString = "";
		
		for (int i = 0; i < n; i++) {
			randAlphabeth = rand.nextInt(charBatasBawahAlphabeth,charBatasAtasAlphabeth);
			strRandomString += (char)randAlphabeth;
		}
		
		return strRandomString;
	}
	
}
