package latihantest.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import latihantest.restassured.utils.ExcelReader;

public class PostDataFromExcel {

	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "http://localhost:3000/";
		req = new JSONObject();
//		String excelPath = "C:/Users/Nexsoft/Documents/Nexsoft Bootcamp/SQA Training/data_karyawan.xlsx";
//		String excelPath = "C:\\Users\\Nexsoft\\Documents\\Nexsoft Bootcamp\\SQA Training\\data_karyawan.xlsx";
		String excelPath = "C:\\Users\\Nexsoft\\Documents\\Nexsoft Bootcamp\\SQA Training\\Data Karyawan.xlsx";
		String sheetName = "Sheet1";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenPost()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int a=0;
		while(r.hasNext())
		{
			Row rows = r.next();
			for(int j=0;j<intColumnNums;j++)
			{
				dDriven[a][j] = excelReader.getCellData(a, j);
//				System.out.println(dDriven[a][j]);
			}
			a++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testPost(String jobTitle, String email, String name, String salary)
	{	
		
		req.put("job",jobTitle);
		req.put("email",email);
		req.put("name",name);
		req.put("salary",salary);
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(req.toJSONString()).
		when().
			post("/karyawan").
		then().
			statusCode(201).log().all();
	}
}