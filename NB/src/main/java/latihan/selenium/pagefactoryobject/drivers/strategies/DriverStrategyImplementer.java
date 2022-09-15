package latihan.selenium.pagefactoryobject.drivers.strategies;

import latihan.selenium.pagefactoryobject.utils.Constants;

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		
		case Constants.FIREFOX:
			return (DriverStrategy) new Firefox();

		default:
			return null;
		}
	}
}