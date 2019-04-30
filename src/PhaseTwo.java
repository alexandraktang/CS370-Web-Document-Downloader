import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/*
 * CS 370
 * Phase Two
 * @Author Alexandra Tang
 * 
 * This class is adapted from my code for Phase One and code adapted from
 * http://journals.ecs.soton.ac.uk/java/tutorial/java/cmdLineArgs/parsing.html
 * 
 * This class has one method: main, which reads the command line and looks for flags
 * to process.
 * 
 * This class may throw IOExceptions.
 */
public class PhaseTwo {
	static int i = 0;
	static String arg = "";
	static String inFileName = "", outFileName = "";
	
	/*
	 * This method was adapted from my code for Phase One and some of the code found here:
	 * http://journals.ecs.soton.ac.uk/java/tutorial/java/cmdLineArgs/parsing.html
	 * 
	 * Arguments: array of Strings
	 * This method reads the command line to check for the -i and -o UNIX flags. In the case
	 * of the -i flag, it reads in the input file and calls on ReadFile's openFile and URLParser
	 * methods to populate the ArrayList of Strings and determine what to do based on each
	 * individual URL's ending. In the case of -o, it reads in the output file name and creates
	 * an output file with said name. It then calls on the DataCollector's sendToOutput method
	 * to retrieve a String with every URL's information and prints it to the OutputFile.
	 */
	public static void main(String[] args) throws IOException {
		
		while (i < args.length) {
			arg = args[i++];
			
			if (arg.equalsIgnoreCase("-i")) {
				inFileName = args[i++]; // next input should be the inputfile
        			try {
        					ArrayList<String> urlList = ReadFile.openFile(inFileName);
        						// calls upon ReadFile's openFile method to process input file
        					ReadFile.URLParser(urlList);
        						// calls ReadFile's URLParser method to parse URLs based on their endings
					} catch (IOException e) {
						e.printStackTrace();
					}
			} // if arg equals -i
			
			if (arg.equalsIgnoreCase("-o")) {
				outFileName = args[i++]; // next input should be the output file
				
				File o = new File(outFileName);
				PrintWriter out = new PrintWriter(o);
				
				String outInfo = DataCollector.sendToOutput();
					// retrieves the String of URL information from DataCollector
				out.println(outInfo);
				
				out.flush();
				out.close();
			} // if arg equals -o	
		} // while i is less than args's length
	} // main
	
}// PhaseTwo class