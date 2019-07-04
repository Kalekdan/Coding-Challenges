public class Cipher {
	
	/**
	Encodes a message using a basic cipher
	**/
	
	public static void main(String[] args){
		String inStr;
		int cipherKey;
		
		if (args.length != 2){
			showUsage();
			return;
		}
		
		inStr = args[0];
		
		try {
			cipherKey = Integer.valueOf(args[1]);
		} catch (Exception e) {
			showUsage();
			return;
		}
		
		System.out.println(encodeMsg(inStr, cipherKey));
	}
	
	private static void showUsage(){
		System.out.println("Usage:\n  java Cipher \"message to be ciphered\" cipherKey");
	}
	
	private static String encodeMsg(String msg, int key) {
		String toReturn = "";
		for (int i = 0; i < msg.length(); i++) {
			toReturn += (char) (msg.charAt(i) + key);
		}
		return toReturn;
	}
}