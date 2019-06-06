public class fizzbuzzoneline {
	//An attempt to do the fizzbuzz algorithm in a single line
	//Obviously this is terrible programming so don't do this!
	public static void main(String[] args){
		fizzBuzzToVal(100);
	}
	
	private static void fizzBuzzToVal(int val){
		String outStr;
		for (int i = 1; i <= val; i++){
			outStr = oneLineFizzIt(i);
			System.out.println(outStr);
		}
	}
	
	private static String oneLineFizzIt(int toFizzBuzz){
		return (toFizzBuzz % 3 == 0) ? (toFizzBuzz % 5 == 0) ? "FizzBuzz" : "Fizz" : (toFizzBuzz % 5 == 0) ? "Buzz" : String.valueOf(toFizzBuzz);
	}
}