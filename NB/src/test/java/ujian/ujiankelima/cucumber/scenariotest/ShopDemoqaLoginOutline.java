package ujian.ujiankelima.cucumber.scenariotest;

public enum ShopDemoqaLoginOutline{

	T1("user invalid login outline"); //dua data
	
	private String testName;
	
	private ShopDemoqaLoginOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}