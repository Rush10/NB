package ujian.ujiankelima.jf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//JAWABAN SOAL NOMOR 2
public class ExceptionHandlingReadFile {
	private static File file;
	private static FileWriter fileWriter;
	
	public static void main(String[] args) {
		String path = "C:\\Users\\Nexsoft\\Documents\\Nexsoft Bootcamp\\Ujian"; //please make sure to change the right path
		String fileName = "ujiankelima";
		String txt = "Ujian Kelima Asyikkkk!!!";
		
		System.out.println("Execute before try catch");
		
		try {
		  System.out.println("Execute in first try block");
		  
//		  throwIOException();
		  
//		  createFileTxt(path, fileName);
//		  writeFileTxt(path, fileName, txt);
//		  deleteFileTxt(path, fileName);
		  
		  readFileTxt(path, fileName);
	      
	      System.out.println("Execute in last try block");
	    } catch (IOException e) {
	      System.out.println("FILE TIDAK DITEMUKAN !!");
	    }
		
		System.out.println("Execute after try catch");
	}
	
	public static void createFileTxt(String path, String fileName) throws IOException{
		file = new File(path + "\\" + fileName + ".txt");
		
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File Already Exists !!");
		}
	}
	
	public static void writeFileTxt(String path, String fileName, String text) throws IOException{
		fileWriter = new FileWriter(path + "\\" + fileName + ".txt");
		fileWriter.write(text);
		fileWriter.close();
	    System.out.println("Successfully Wrote To The File !!");
	}
	
	public static void readFileTxt(String path, String fileName) throws IOException{
		file = new File(path + "\\" + fileName + ".txt");
		Scanner myReader = new Scanner(file);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
	        System.out.println(data);
	    }
	    myReader.close();
	}
	
	public static void deleteFileTxt(String path, String fileName) throws IOException{
		file = new File(path + "\\" + fileName + ".txt");
	    if (file.delete()) { 
	      System.out.println("Deleted the file: " + file.getName());
	    } else {
	      System.out.println("Failed To Delete The File !!");
	    } 
	}
	
	public static void throwIOException() throws IOException{
		System.out.println("Throw IO Exception");
		throw new IOException();
	}
	
}
