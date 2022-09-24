package ujian.ujiankelima.cucumber.scenariotest;

public enum ShopDemoqaArticleOutline{

	T1("user invalid comment outline"); //dua data
	
	private String testName;
	
	private ShopDemoqaArticleOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}