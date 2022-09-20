package latihantest.cucumber.scenariotest;

public enum NopComLogin {
	T2("User valid logins"),
	T1("User invalid logins");
	
	private String testName;
	
	private NopComLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
