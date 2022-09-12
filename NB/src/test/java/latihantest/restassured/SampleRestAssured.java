package latihantest.restassured;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SampleRestAssured {
	JSONObject req;
	
	@BeforeMethod
	public void befTest() {
		req = new JSONObject();
		baseURI = "http://localhost:3000/";
	}
	
	//Data Driven
	@DataProvider(name = "DataProviderOne")
	public Object[][] dataDriven(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = "1";
		data[0][1] = "2";
		data[0][2] = 1;
		
		data[1][0] = "3";
		data[1][1] = "4";
		data[1][2] = 2;
		
		data[2][0] = "5";
		data[2][1] = "6";
		data[2][2] = 3;
		
		return data;
	}
	
	//Testing menggunakan data driven
	@Test(priority = 0, dataProvider = "DataProviderOne")
	public void testPost(String fName, String lName, int sid) {
		System.out.println("Data");
		System.out.println("First name: " + fName);
		System.out.println("Last name : " + lName);
		System.out.println("Subject id: " + sid);
		
		req.put("first_name", fName);
		req.put("last_name", lName);
		req.put("subject_id", sid);
		
		given().
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().
			all();
		
		System.out.println("====================");
	}
	
	//Testing manual (satu per satu)
//	@Test(priority = 0)
//	public void testPost() {
//		req.put("first_name", "Nidea");
//		req.put("last_name", "Idi");
//		req.put("subject_id", 1);
//		
//		given().
//			header("Content-Type", "application/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().
//			post("/users").
//		then().
//			statusCode(201).
//			log().
//			all();
//	}
	
	@Test(priority = 1)
	public void testGetAll() {
		given().
			get("/users").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority = 2)
	public void testGetOneWithId() {
		given().
		when().
			get("/users/4").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority = 3)
	public void testGetOneWithData() {
		given().
			param("first_name","Novrianto").
//			and().
//			param("last_name", "Sani").
		when().
			get("/users").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority = 4)
	public void testPatch() {
		req.put("first_name", "Nunu");
		
		given().
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			patch("/users").
		then().
			statusCode(200).log().all();
	}
	
	@Test(priority = 5)
	public void testPut() {
		req.put("first_name", "Kenzozzz");
		req.put("last_name", "Messi");
		req.put("subject_id", "3");
		
		given().
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200).log().all();
	}
	
	@Test(priority = 6)
	public void testDelete() {
		given().
		when().
			delete("/users/9").
		then().
			statusCode(200).
			log().
			all();
	}
}
