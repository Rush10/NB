package ujian.ujiankelima.jf;

import java.util.Random;

//JAWABAN SOAL NOMOR 1
public class GenerateDynamicData {
	private static Random rand;
	
	public static void main(String[] args) {
		rand = new Random();
		int intFirstIndex = 1;
		int intLastIndex = 20;
		int intJumData = 0, intIndexAwal = 0, intIndexAkhir = 0; 
		
		intJumData = rand.nextInt(intFirstIndex,intLastIndex);
		intIndexAwal = rand.nextInt(intFirstIndex,intLastIndex);
		intIndexAkhir = rand.nextInt(intFirstIndex,intLastIndex);
		
		try {
			System.out.println("Generate Integer in String: " + generateIntegerDataInString(intJumData,intIndexAwal,intIndexAkhir));
			System.out.println("Generate Double in String: " + generateDoubleDataInString(intJumData,intIndexAwal,intIndexAkhir));
			generateIntegerData(intJumData,intIndexAwal,intIndexAkhir);
			generateDoubleData(intJumData,intIndexAwal,intIndexAkhir);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String generateIntegerDataInString(int intJumlahData,int intIndexAwal, int intIndexAkhir) {
		rand = new Random();
		StringBuffer strTemp = new StringBuffer();
		String strIntData = "";
		
		for (int i = 0; i < intJumlahData; i++) {
			strTemp.append(rand.nextInt(intIndexAwal, intIndexAkhir) + ",");
		}
		
		strIntData = strTemp.toString().substring(0,strTemp.length()-1);
		
		return strIntData;
	}
	
	public static void generateIntegerData(int intJumlahData,int intIndexAwal, int intIndexAkhir) {
		System.out.println("===== Generate Integer Data =====");
		rand = new Random();
		for (int i = 0; i < intJumlahData; i++) {
			System.out.println("Data - " + (i+1) + ": " + rand.nextInt(intIndexAwal, intIndexAkhir));
		}
	}
	
	public static String generateDoubleDataInString(int intJumlahData,int intIndexAwal, int intIndexAkhir) {
		rand = new Random();
		StringBuffer strTemp = new StringBuffer();
		String strDoubleData = "";
		
		for (int i = 0; i < intJumlahData; i++) {
			strTemp.append(rand.nextDouble(intIndexAwal, intIndexAkhir) + ",");
		}
		
		strDoubleData = strTemp.toString().substring(0,strTemp.length()-1);
		
		return strDoubleData;
	}
	
	public static void generateDoubleData(int intJumlahData,int intIndexAwal, int intIndexAkhir) {
		System.out.println("===== Generate Double Data =====");
		rand = new Random();
		for (int i = 0; i < intJumlahData; i++) {
			System.out.println("Data - " + (i+1) + ": " + rand.nextDouble(intIndexAwal, intIndexAkhir));
		}
	}
}
