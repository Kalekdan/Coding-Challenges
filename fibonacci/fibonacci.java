public class fibonacci {
	public static void main(String args[]){
		fibonacciIt(20);
	}
	
	private static void fibonacciIt(int noTerms){
		int previous = 0;
		int temp;
		int out = 1;
		System.out.println(0);
		for (int i = 1; i < noTerms; i++) {
			System.out.println(out);
			temp = out;
			out += previous;
			previous = temp;
		}
	}
}