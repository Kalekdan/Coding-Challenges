import java.io.*;
import java.util.Random;
import java.util.ArrayList;

/*
Given a string (a word), scramble it. Randomize letter positions. For example, the input of "Hello" may return "leloH".
#codedailies
https://twitter.com/CodeDailies/status/1105755538560872449
*/

class randomizeString {
    
    /* Randomize order of letters in input string */
	public static void main (String[] args) {
        System.out.println(randomizeString("Input string goes here. This will be randomly mixed up!"));
	}
	
	/*Do this by removing a random char from string and adding it to a new string*/
	public static String randomizeString(String input){
	    Random r = new Random();
	    int rInt;
	    String out = "";
	    while (input.length() > 0){
	        rInt = r.nextInt(input.length());
	        out += input.charAt(rInt);
	        //Remove char at random location
	        input = input.substring(0, rInt) + input.substring(rInt + 1);
	    }
	    return out;
	}

}