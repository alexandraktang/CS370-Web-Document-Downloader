import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
/*
 * This class handles any cases dealing with URLs that contain PDF files.
 * It has one method: read, which takes the URL and processes it.
 * 
 * This class may throw IOExceptions.
 */
public class ForPDF {
	
	/*
	 * This method was adapted from some of the code found here:
	 * https://www.gnostice.com/nl_article.asp?id=207&t=How_To_Read_A_PDF_File_From_A_URL_In_Java
	 * 
	 * Arguments: String of a URL
	 * This method accepts a URL ending in .pdf and creates a URL object with it. An InputStream is
	 * opened and a FileOutputStream is used to write the bytes of the PDF to a file named after
	 * the last portion of the URL prior to the .pdf ending. It then calls the GetURLInfo infoToString
	 * method and sends both this and the URL name to the DataCollector.
	 */
	public static void read(String url) throws IOException {
		int byteCounter = 0; // keeps track of the number of bytes read
		URL u = new URL(url);
		byte buff[] = new byte[1024];
		int lastSectionIndex = url.lastIndexOf("/"); // finds the index of the last slash
		int lastPeriodIndex = url.lastIndexOf("."); // finds the index of the last period
		String lastSection = url.substring(lastSectionIndex + 1, lastPeriodIndex);
			// represents the URL name: the last portion of the URL before the URL ending
		
		InputStream is = u.openStream();
		FileOutputStream fos = new FileOutputStream(lastSection + ".pdf");
			
		while ((byteCounter = is.read(buff)) != -1) {
			fos.write(buff, 0, byteCounter);
		} //while the # of bytes and bytes read by InputStream does not equal -1
		
		if (fos != null) {
			fos.flush();
			fos.close();
			is.close();
		} //if FileOutputStream is not null
		
		String all = GetURLInfo.infoToString(url);
		DataCollector.add(lastSection + "\nFile " + lastSection + " created.\n" + all);
	}
}
