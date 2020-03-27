package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {

		String[] charMult = new String[input.length()];
		String charFinal = "";

		while (charFinal.length() < input.length()) {
			for (int i = 0; i < input.length(); i++) {
				charMult[i] = input.substring(i, i + 1);
				charMult[i] = charMult[i] + input.substring(i, i + 1);
				charMult[i] = charMult[i] + input.substring(i, i + 1);

				charFinal = charFinal + charMult[i];

			}

		}

		return charFinal;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {

		String bertLower = input.toLowerCase();

		int firstBert = bertLower.indexOf("bert", 0);
		int lastBert = bertLower.indexOf("bert", 4);

		String[] betweenBert = new String[bertLower.length()];
		String finalBert = "";

		for (int i = lastBert - 1; i > firstBert + 3; i--) {
			betweenBert[i] = bertLower.substring(i, i + 1);

			finalBert = finalBert + betweenBert[i];

		}

		return finalBert;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {

		if (a == b + 2 || a == b - 2 && a == c + 2 || a == c - 2 && b == c + 2 || b == c - 2) {

			return true;

		}

		return false;

	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {

		int middleOfString = input.length() / 2;

		int firstOffset = a / 2 - 1;
		int secondOffset = a / 2;
		if (a % 2 != 0) {
			firstOffset = a / 2;
			secondOffset = a / 2 + 1;
		}

		String answerStringFirstHalf = input.substring(0, middleOfString - firstOffset);
		String answerStringSecondHalf = input.substring(middleOfString + secondOffset, input.length());

		return answerStringFirstHalf + answerStringSecondHalf;

	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {

		String[] charArray = new String[input.length()];

		for (int i = 0; i < input.length(); i++) {
			charArray[i] = input.substring(i, i + 1);

		}

		int checkFordev = input.indexOf("dev", input.length() - 3);
		int checkForDev = input.indexOf("Dev", input.length() - 3);

		if (checkForDev != -1 || checkFordev != -1) {
			return true;
		}

		/*
		 * 
		 * if (charArray[input.length() - 1] == "v" && charArray[input.length() - 2] ==
		 * "e" && charArray[input.length() - 3] == "d") {
		 * 
		 * return true; }
		 * 
		 */

		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {

		String[] blockFinder = new String[input.length()];
		int blockContentQuantity = 0;

		for (int i = 0; i < input.length(); i++) {
			blockFinder[i] = input.substring(i, i + 1);

			if (i != 0) {
				if (blockFinder[i] == input.substring(i - 1, i)) {

					blockContentQuantity++;
					System.out.println(blockContentQuantity);
				}
			}

		}

		return blockContentQuantity;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {

		/// int[] amFinder = new int[arg1.length()];

		int amFinder1 = arg1.indexOf(" Am ", 0);

		int amCount = 0;

		if (amFinder1 != -1) {
			amCount++;

			int amFinder2 = arg1.indexOf(" Am ", amFinder1 + 1);

			if (amFinder2 != -1) {
				amCount++;
			}

		}

		return amCount;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 3 == 0) {
			if (arg1 % 5 == 0) {
				return "fizzbuzz";
			}
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		}

		return null;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {

		int space1 = arg1.indexOf(" ", 0);
		int space2 = arg1.indexOf(" ", space1 + 1);
		int space3 = arg1.indexOf(" ", space2 + 1);
		int space4 = arg1.indexOf(" ", space3 + 1);
		int space5 = arg1.indexOf(" ", space4 + 1);

		int numCount. = 0;

		String number1 = "";
		String number2 = "";
		String number3 = "";
		String number4 = "";
		String number5 = "";

		
		
		if (space2 == -1) {
			numCount = 2;
		} else if (space3 == -1) {
			numCount = 3;
			number1 = arg1.substring(0, space1);
			number2 = arg1.substring(space1 + 1, space2);
			number3 = arg1.substring(space2 + 1, arg1.length());

		} else if (space4 == -1) {
			numCount = 4;
		} else if (space5 == -1) {
			numCount = 5;
		}

		System.out.println(number1 + " " + number2 + " " + number3 + number4 + number5);

		return 0;

	}

}
