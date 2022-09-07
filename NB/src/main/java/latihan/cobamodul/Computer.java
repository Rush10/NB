package latihan.cobamodul;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	public static String OS = "Windows XP";
	public static List<String> appList = new ArrayList<String>() {
		{
			add("Microsoft Word");
			add("Opera");
			add("Mozilla Firefox");
			add("Google Chrome");
			add("Pinball");
			add("Spider Solitaire");
			add("Smadav");
			add("Internet Explorer");
			add("Notepad");
		}
	};
	
	public static double RAM_MB = 1024;
	public static double storage_GB = 128;
}
