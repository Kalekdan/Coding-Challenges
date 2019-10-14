import java.io.*;
import java.util.*;

/*
Given a set of dice rolls in the format noOfRolls:noOfSidesOnDice, output the sum of the dice rolls
https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/
*/

class DiceRoller {
	public static void main (String[] args) {
		try {
			System.out.println(diceSum(args[0]));
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	private static int diceSum(String inputStr) throws Exception{
		String split[] = inputStr.split(":");
		int noRolls = Integer.parseInt(split[0]);
		int diceSides = Integer.parseInt(split[1]);
		int result = 0;

		if (diceSides <= 1){
			throw new Exception("Cannot have a dice with " + diceSides + " sides.");
		}

		Random r = new Random();
		for (int i = 1; i <= noRolls; i++){
			result += r.nextInt(diceSides) + 1;
		}
		return result;
	}
}
