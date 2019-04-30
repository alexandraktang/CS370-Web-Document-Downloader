import java.util.ArrayList;
/*
 * This method receives Strings containing a URL's info, name, and read line
 * count and puts them into an ArrayList of Strings for storage until all URLs
 * are processed.
 * This class has three methods:
 *    1. Add: essentially the ArrayList's add method
 *    2. dcToString: a method used to format each URL's information
 *    3. sendToOutput: returns the formatted String of each URL's information
 */
public class DataCollector {
	static ArrayList<String> nameCount = new ArrayList<String>();
		// ArrayList of all the URLs' info, names, and read line counts
	static String all = "";
	
	/*
	 * Arguments: String of a particular URL's information, name, and read line
	 * count if an HTML/TXT file.
	 * This method uses the ArrayList add method to add the String to the class's
	 * ArrayList, nameCount.
	 */
	public static void add(String s) {
		nameCount.add(s);
	}
	
	/*
	 * Arguments: ArrayList of Strings
	 * This method traverses through the ArrayList and concatenates all the Strings
	 * into one formatted String and returns this String.
	 */
	private static String dcToString(ArrayList<String> nc) {
		for (String s: nc)
			all += s + "\n\n";
		return all;
	}
	
	/*
	 * Arguments: N/A
	 * This method calls on the class's dcToString method to build a String with all
	 * the information for each URL and returns this String.
	 */
	public static String sendToOutput() {
		DataCollector.dcToString(nameCount);
		return all;
	}
}
