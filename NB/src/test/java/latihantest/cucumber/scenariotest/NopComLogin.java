package latihantest.cucumber.scenariotest;

public enum NopComLogin {
	T1("User invalid logins"),
	T2("User valid logins");
	
	private String testName;
	
	private NopComLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
