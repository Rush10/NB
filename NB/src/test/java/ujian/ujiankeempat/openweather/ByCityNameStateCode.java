package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ujian.ujiankeempat.openweather.utils.ExcelReader;

public class ByCityNameStateCode {
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private int data = 0;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org/";
		String excelPath = "./data/NB_Ujian_Keempat.xlsx";
		String sheetName = "ByCityNameStateCode";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderCityNameStateCode")
	public Object[][] dataDriven()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int a=0;
		System.out.println("===============");
		while(r.hasNext())
		{
			System.out.println("Data " + (a+1));
			Row rows = r.next();
			for(int j=0;j<intColumnNums;j++)
			{
				dDriven[a][j] = excelReader.getCellData(a, j);
				if(j == 0) {
					System.out.println("City Name: " + dDriven[a][j]);					
				} else if(j == 1) {
					System.out.println("State Code: " + dDriven[a][j]);					
				} else {
					System.out.println("Country Code: " + dDriven[a][j]);										
				}
			}
			System.out.println("===============");
			a++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderCityNameStateCode")
	public void testGetWeatherByCityNameStateCode(String cityName, String stateCode, String countryCode) {
		
		System.out.println("============================================================");
		System.out.println("LOG DATA " + ((this.data++)+1));
		System.out.println("============================================================");
		String apiKey = "6ff56e0ff25375aa164403735be6def6";
		
		given().
			param("q", cityName + "," + stateCode + "," + countryCode).
			and().
			param("appid", apiKey).
		when().
			get("/data/2.5/weather").
		then().
			statusCode(200).log().all();
	}
}