package latihan.oretoretan;

public class LatSoalCharArray {
	public static void main(String[] args) {
		//SOAL
		//INPUT : "Paul Christian"
		//OUTPUT : 16+1+21+12+3+8+18+9+19+20+9+1+14 = 151
		
		String strName = "Paul Christian";
		strName = strName.toUpperCase();
		char batasMax = 91;
		char batasMin = 64;
		int sum = 0;
		
		char[] charName = strName.toCharArray();
		for (int i = 0; i < charName.length; i++) {
			if(charName[i] > batasMin && charName[i] < batasMax) {
				sum += charName[i] - batasMin;
			}
		}
		
//		for (int i = 0; i < strName.length(); i++) {
//			if(strName.charAt(i) > batasMin && strName.charAt(i) < batasMax) {
//				sum += strName.charAt(i) - batasMin;
//			}
//		}
		
		System.out.println(sum);
	}
}
