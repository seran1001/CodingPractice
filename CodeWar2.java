package codeWar;

public class CodeWar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetSum(0, -1));

	}

	/**
	 * Your task is to sort a given string. Each word in the string will contain a
	 * single number. This number is the position the word should have in the
	 * result.
	 * 
	 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
	 * 
	 * If the input string is empty, return an empty string. The words in the input
	 * String will only contain valid consecutive numbers.
	 * 
	 * For example, "is2 Thi1s T4est 3a" --> "Thi1s is2 3a T4est" "4of Fo1r pe6ople
	 * g3ood th5e the2" --> "Fo1r the2 g3ood 4of th5e pe6ople" "" --> ""
	 */
	public static String order(String words) {

		return words;
		// ...
	}

	/**
	 * Given two integers a and b, which can be positive or negative, find the sum
	 * of all the numbers between including them too and return it. If the two
	 * numbers are equal return a or b.
	 */

	public static int GetSum(int a, int b) {
		int i = 0;
		int num = 0;
		if (a < b) {
			for (i = a; i <= b; i++) {
				num = num + i;
			}
		} else {
			b = a;
			a = b;
		}

		// Good luck!
		return num;
	}

}
