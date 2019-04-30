import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
/*
 * This class handles any cases dealing with URLs that deal with HTM/HTML/TXT files.
 * It has one method: read, which takes the URL and processes it.
 * 
 * This class may throw IOExceptions.
 */
public class ForHT {
	private static String webpage = null;
	
	/*
	 * This method is adapted from the WebpageReaderWithoutAgent.java code we discussed
	 * in class.
	 * 
	 * Arguments: String of a URL
	 * This method accepts a URL ending in .htm/.html/.txt and creates a URL object with it. 
	 * It creates a new file named after the URL name, the last portion of the URL before the
	 * ending. A PrintWriter writes the lines read in  by a BufferedReader to this file while
	 * a counter keeps track of the number of lines read. The method then calls the GetURLInfo
	 * infoToString method and sends the information, URL name, and number of lines read to 
	 * the DataCollector.
	 */
	public static void read(String url) throws IOException {
		webpage = url;
		int lineCounter = 0; // keeps track of the number of lines read
		int lastSectionIndex = url.lastIndexOf("/"); // finds the index of the last slash
		int lastPeriodIndex = url.lastIndexOf("."); // finds the index of the last period
		String lastSection = url.substring(lastSectionIndex + 1, lastPeriodIndex); 
			// represents the URL name: the last portion of the URL before the URL ending
		
		File output = new File(lastSection);
		PrintWriter ow = new PrintWriter(output);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new URL(webpage).openStream()));
		
		String line = br.readLine();
		ow.println(line);
		lineCounter++;
		
		line = br.readLine();
		
		while (line != null) {
			ow.println(line);
			lineCounter++;
			
			line = br.readLine();
		}
		
		ow.flush();
		ow.close();
		
		String all = GetURLInfo.infoToString(url);
		DataCollector.add(lastSection + "\nFile " + lastSection + " created: " + lineCounter + 
				" lines read.\n" + all);
	}
}
