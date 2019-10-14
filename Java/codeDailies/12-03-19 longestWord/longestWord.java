import java.io.*;

/*
Given a string of multiple words, return the longest word.
#codedailies
https://twitter.com/CodeDailies/status/1105392995040481281
*/

class longestWord {
	public static void main (String[] args) {
		System.out.println(longestWord("This is a string with some particularly long words."));
	}
	
	private static String longestWord(String str){
	    String[] strArray = str.split("\\s+");
	    String longest = "";
	    for (String item : strArray){
	        if (item.length() > longest.length()){
	            longest = item;
	        }
	    }
	    return longest;
	}
}