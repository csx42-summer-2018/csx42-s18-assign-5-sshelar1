package wordCount.driver;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.util.Results;

public class Driver{

	public static void main(String[] args) {
		
		FileProcessor fileProcessor = null;
		Results results = null;
		int debugLevel=-1;
		
		/**
		 * Checking for valid arguments i.e 3
		 */
		if (args.length != 3) {
			System.out.println("Invaid number of arguments");
			System.exit(1);
		}
		
		/**
		 * Checking for valid debug level
		 */
		try {
			debugLevel = Integer.parseInt(args[2]);
			MyLogger.setDebugValue(debugLevel);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid debug level");
			System.exit(1);
		}
		
		/**
		 * Checks if the debug level is in range or not
		 */
		if (debugLevel < 0 || debugLevel > 3) {
			System.out.println("Debug value out of range");
			System.exit(1);
		}
		
		results = new Results(args[1]);
		
	}
	
}