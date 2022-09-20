package latihantest.cucumber.scenariotest;

public enum NCOutline {
	T1("User invalid login");
//	T2("User valid login");
	
	private String testName;
	
	private NCOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
