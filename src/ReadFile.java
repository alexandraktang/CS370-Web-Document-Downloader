import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
 * This class handles input files by opening said files and reading the contents.
 * It splits the text into different URLs and populates an ArrayList of Strings
 * with these URLs, then determines what class to call based on the endings of
 * each URL.
 * 
 * It has two methods:
 *    1. openFile, which takes in String of a filename and reads the file
 *    2. URLParser, which accepts an ArrayList of Strings and directs URLs to other
 *    		classes based on their endings
 * 
 * This class may throw IOExceptions.
 */
public class ReadFile {
	static ArrayList<String> urls = new ArrayList<String>();
	static int i = 0;
	
	/*
	 * Arguments: String representing a filename
	 * This method uses a Buffered FileReader to read in the lines of the input file.
	 * Each line constitutes a URL, which is added to the class's ArrayList of Strings.
	 * The method then returns this ArrayList.
	 */
	public static ArrayList<String> openFile(String f) throws IOException {
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			while (line != null) {
				urls.add(line);
				
				line = br.readLine();
				i++;
			}// while line != null
			
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} // catch block
		
		return urls;
	} // openFile method
	
	/*
	 * Arguments: ArrayList of URL Strings
	 * This method traverses through the ArrayList of URL Strings and determines
	 * which Class to call based on the endings of each URL in the ArrayList.
	 */
	public static void URLParser(ArrayList<String> u) throws IOException {
		for (int j = 0; j < u.size(); j++) {
			String current = u.get(j);
			
			if (current.endsWith(".htm") || current.endsWith(".html") || current.endsWith(".txt")) {
				ForHT.read(current);
			} // if htm, html, txt
			
			else if (current.endsWith(".pdf")) {
				ForPDF.read(current);
			} // if pdf
			
			else if ( (current.endsWith(".jpg")) || (current.endsWith(".jpeg")) || 
					(current.endsWith(".gif"))) {
				ForIMG.writeImage(current);
			} // if image	
		} // for loop
	} // URLParser method
	
} // ReadFile class
