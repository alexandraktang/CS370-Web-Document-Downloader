import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

/*
 * This class is adapted from the GetURLImage.java we discussed in class.
 * 
 * This class handles any cases dealing with URLs that contain image files.
 * It has two methods: 
 *    1. getImage, which takes the URL and fetches the image from the Internet.
 *    2. writeImage, which accepts a String representing a URL and processes it.
 * 
 * This class may throw MalformedURLExceptions and IOExceptions.
 */
public class ForIMG {
	URL url = null;
	File outputImageFile = null;
	public static BufferedImage image = null;
	
	/*
	 * This method is adapted from fetchImageFromURL method from GetURLImage.java
	 * 
	 * Arguments: URL object
	 * This method uses the ImageIO method read to fetch an image from the given URL.
	 */
	private static void getImage(URL url) {
		try {
			image = ImageIO.read(url);
		} catch(IOException e) {
			
		}
	}
	
	/*
	 * This method is adapted from main method from GetURLImage.java
	 * 
	 * Arguments: String of a URL
	 * This method accepts a URL ending in .jpg/.jpeg/.gif and creates a URL object with it.
	 * It calls on the getImage method to fetch the image from the URL, then creates a new file
	 * named after the URL name, the last portion of the URL before the ending, and gives it the
	 * same file ending as the URL originally had. The image is saved via the ImageIO write method.
	 * The method then calls the GetURLInfo infoToString method and sends the information and URL
	 * name to the DataCollector.
	 */
	public static void writeImage(String u) throws MalformedURLException, IOException {
		int lastSectionIndex = u.lastIndexOf("/"); // finds the index of the last slash
		int lastPeriodIndex = u.lastIndexOf("."); // finds the index of the last period
		String lastSection = u.substring(lastSectionIndex + 1, lastPeriodIndex);
			// represents the URL name: the last portion of the URL before the URL ending
		
		URL url = new URL(u);
		getImage(url);
		
		// If the image was a .jpg file, the saved image is saved as a .jpg file.
		if (u.endsWith(".jpg")) {
			File outImage = new File(lastSection + ".jpg");
			ImageIO.write(image, "jpg", outImage);
		}	
		
		//  If the image was a .jpeg file, the saved image is saved as a .jpeg file.
		else if (u.endsWith(".jpeg")) {
			File outImage = new File(lastSection + ".jpeg");
			ImageIO.write(image, "jpeg", outImage);
		}
		
		// If the image was a .gif file, the saved image is saved as a .gif file.
		else if (u.endsWith(".gif")) {
			File outImage = new File(lastSection + ".gif");
			ImageIO.write(image, "gif", outImage);	
		}
			
		String all = GetURLInfo.infoToString(u);
		DataCollector.add(lastSection + "\nFile " + lastSection + " created.\n" + all);
	}
}
