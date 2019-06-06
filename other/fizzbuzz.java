public class fizzbuzz {
	public static void main(String[] args) {
		fizzbuzzToVal(100);	
	}
	
	private static void fizzbuzzToVal(int val){
		String outStr;
		for (int i = 0; i <= val; i++){
			outStr = "";
			if (i % 3 == 0){
				outStr += "Fizz";
			}
			if (i % 5 == 0){
				outStr += "Buzz";
			}
			if (outStr.isEmpty()){
				outStr = String.valueOf(i);
			}
			System.out.println(outStr);
		}
	}
}