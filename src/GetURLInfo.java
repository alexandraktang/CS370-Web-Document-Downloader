import java.net.*;
import java.text.SimpleDateFormat;
import java.io.*;
/*
 * This class is adapted from Flanagan's GetURLInfo.java, which we discussed
 * in class.
 * 
 * This class handles all URLs and finds information about each.
 * It has one method: infoToString, which takes the URL and gets all the information
 * specified.
 * 
 * This class may throw IOExceptions.
 */
public class GetURLInfo {
	static String allInfo = "", urlString = "", contentType = "", contentLength = "", 
			lastMod = "", exp = "", conEn = "", fileSize = "";
	
	/*
	 * This method is adapted from Flanagan's GetURLInfo.java, which we discussed
	 * in class.
	 * 
	 * Arguments: String representing a URL
	 * This method accepts a URL and creates a URL object with it, then opens a
	 * connection with this URL to obtain different information about it, including
	 * content type, content length, date last modified, expiration date, content
	 * encoding, and file size. All this information is formatted into a single String,
	 * which this method then returns.
	 */
	public static String infoToString(String u) throws IOException {
		URL url = new URL(u);
		URLConnection uc = url.openConnection();
		
		SimpleDateFormat sdf = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		
		urlString = uc.getURL().toExternalForm();
		contentType = uc.getContentType();
		contentLength = Integer.toString(uc.getContentLength());
		lastMod = sdf.format(uc.getLastModified());
		exp = sdf.format(uc.getExpiration());
		conEn = uc.getContentEncoding();
		fileSize = Double.toString(uc.getContentLength() / 1024.0); 
			// divided by 1024 to represent kB rather than Bytes
		
		// A formatted String containing all the information above
		allInfo = "URL: " + urlString + "\n" + 
				"Content Type: " + contentType + "\n" +
				"Content Length: " + contentLength + "\n" +
				"Date Last Modified: " + lastMod + "\n" + 
				"Expiration: " + exp + "\n" +
				"Content Encoding: " + conEn + "\n" +
				"File Size: " + fileSize + " kB"; 
		
		return allInfo;
	}
	
}
