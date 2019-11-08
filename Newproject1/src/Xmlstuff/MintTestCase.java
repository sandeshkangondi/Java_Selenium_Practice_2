package Xmlstuff;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MintTestCase {
	    protected static Logger logger = Logger.getLogger (MintTestCase.class);
	    public static void main(String args[]) throws FileNotFoundException{
	    	FileOutputStream  out = new FileOutputStream("Results.txt", true);
	    	PrintStream p = new PrintStream(out);
	    	logger.setLevel(Level.ERROR);
	    	logger.info("work is easy 2");
	    	logger.debug("work is easy 1"); // debug, info, warn, error, fatal
	    	logger.warn("work is easy 3");
	    logger.error("work is easy 4");
	    	//  This logger properties file should be in the parent folder
	    	// output it to a file , appender
	   
	    	p.println("Hello");
	    }
}
