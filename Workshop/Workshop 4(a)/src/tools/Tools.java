package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tools {
	 /**
     * Asks the user for input using prompt and returns it
     * @param prompt - message to tell student
     * @return output String
     */
    public static String readString(String prompt){
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String outputString = null;
    	try {
    		outputString = in.readLine();
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    	return outputString;
    }
    

    /**
    * Asks the user for input using prompt and returns it
    * @param prompt - message to tell student
    * @return output Integer
    */
    public static int readInt(String prompt){
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	int outputString = 0;
    	try {
    		outputString = Integer.parseInt(in.readLine());
    		
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    	return outputString;
    }
}
