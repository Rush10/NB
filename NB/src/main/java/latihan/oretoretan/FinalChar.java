package latihan.oretoretan;

//QUESTION:
//INPUT STRING DATA (SCANNER)
//INPUT: 07a45te312qw6M-8so9
//OUTPUT: 65
//GUIDE >> 2+9+6+7+5+3+4+8+10+11=65

//ANALYSIS:
//0 1 2 3 4 5 6 7 8  9
//== (PLUS 2)
//2 3 4 5 6 7 8 9 10 11

//(1) INPUT STRING
//(2) GET ASCII CODE OF NUMERIC IN INPUT STRING.
//(3) RESULT = (ASCII CODE OF NUMERIC) MINUS (LOWER LIMIT ASCII CODE OF NUMERIC).
//(4) RESULT + 2
//(5) SUM ALL RESULT
//(6) PRINT SUM 

import java.util.Scanner;

public class FinalChar {

	public static void main(String[] args) {
		//declaration & initialization
		Scanner sc = new Scanner(System.in);
		String strInput = "";
		char[] charTemp;
		byte byteNumUpperLimit = 57, byteNumLowerLimit = 48;
		int intTotal = 0;
		
		//input
		System.out.print("Input: ");
		strInput = sc.nextLine();
		
		//process
		charTemp = strInput.toCharArray(); //convert input to char array
		
		for (int i = 0; i < charTemp.length; i++) { //looping char array
			if(charTemp[i] >= byteNumLowerLimit && charTemp[i] <= byteNumUpperLimit ) { //check and get numeric in char array
				intTotal += (charTemp[i]-byteNumLowerLimit) + 2; //sum all numeric in char
			}
		}
		
		//output
		System.out.println("Output: "+ intTotal);
	
	}

}

//public static void main(String[] args) {
//	//declaration & initialization
//	Scanner sc = new Scanner(System.in);
//	String strInput = "";
//	int intTotal = 0;
//	
//	//input
//	System.out.print("Input: ");
//	strInput = sc.nextLine();
//	
//	//process
//	intTotal = process(strInput); //call process function
//	
//	//output
//	System.out.println("Output: "+ intTotal);
//
//}
//
//static int process(String strInputFunc) {
//  //declaration & initialization
//	char[] charTemp;
//	byte byteNumUpperLimit = 58, byteNumLowerLimit = 47;
//	int intTotalFunc = 0;
//	
//	charTemp = strInputFunc.toCharArray(); //convert input to char array
//	
//	for (int i = 0; i < charTemp.length; i++) { //looping char array
//		if(charTemp[i] > byteNumLowerLimit && charTemp[i] < byteNumUpperLimit ) { //check and get numeric in char array
//			intTotalFunc += (charTemp[i]-byteNumLowerLimit-1) + 2; //sum all numeric in char
//		}
//	}
//	
//	return intTotalFunc; //return value sum(total)
//}
