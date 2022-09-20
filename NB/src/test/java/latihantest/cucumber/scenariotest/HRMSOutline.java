package latihantest.cucumber.scenariotest;

public enum HRMSOutline{
	

	T1("User invalid login Out of line");
//	T2("User invalid empty username and password Outline");
//	T3("User valid login"),
//	T4("Dashboard user function");
	
	private String testName;
	
	private HRMSOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}