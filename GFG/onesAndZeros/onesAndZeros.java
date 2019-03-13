import java.io.*;
import java.util.ArrayList;

class onesAndZeros {
    
/*
Count numbers having N 0s and and M 1s with no leading zeros
Given two integer N and M, the task is to find the number of distinct numbers having 
N 0s and M 1s with no leading zeros and N + M total digits.
https://www.geeksforgeeks.org/count-numbers-having-n-0s-and-and-m-1s-with-no-leading-zeros/
*/
    
	public static void main (String[] args) {
		ArrayList<Integer> array = numberOfZeroesAndOnes(2,3);
		System.out.println("Count of matching numbers: " + array.size());
		System.out.println("\n" + array);
	}
	
	private static ArrayList<Integer> numberOfZeroesAndOnes(int N, int M){
	    int current = (int) Math.pow(10, N+M-1); //Start counting from the smallest no with correct no of digits
	    int max = (int) Math.pow(10, N+M) - 1; //Stop counting when we have more digits
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    for (int i = current; i <= max; i ++){
	        if(noMatchingDigits(i, 0) == N && noMatchingDigits(i, 1) == M){
	            arr.add(i);
	        }
	    }
	    return arr;
	}
	
	private static int noMatchingDigits(int val, int toCount){
	    int match = 0;
        long numberToTest = val;
        while (numberToTest != 0)
        {
            if (numberToTest % 10 == toCount)
            {
               match++;
            }
            numberToTest /= 10;
        }
        return match;
	}
}