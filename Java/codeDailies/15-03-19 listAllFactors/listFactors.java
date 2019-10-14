import java.io.*;
import java.util.ArrayList;

class listFactors {
	public static void main (String[] args) {
		System.out.println(getFactors(16));
	}
	
	/*
	The most efficient way I could think  of to list the factors of a number
	For each number up to sqrt of the value, checks if it is divisible
	- if so, adds it and its pair to list of factors
	*/
	public static ArrayList<Integer> getFactors(float val){
	    int max = (int) Math.sqrt(val);
	    //An array of the factors of val
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    for (int i = 2; i <= max; i++){
	        //If val is divisible by i
	        if (val % i == 0){
	            arr.add(i);
	            arr.add((int) val / i);
	        }
	    }
	    
	    return arr;
	}
}