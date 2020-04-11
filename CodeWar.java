package codeWar;

import java.util.ArrayList;

public class CodeWar {

	public static void main(String[] args) {

		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] { 10, 0 });
		list.add(new int[] { 10, 3 });
		list.add(new int[] { 10, 2 });
		System.out.println(list);

		ArrayList<String> s = new ArrayList<String>();
		s.add("e:");
		s.add("3:");
		s.add("5:");
		s.add("e6:");
		System.out.println(s);

		/**
		 * --multiply each digit until the product is one digit
		 * 
		 * 
		 */
		int a = 37;

		int res = 0;
		while (a % 10 == 0) {
			int digit = a % 10;
			a = a / 10;
			res = digit * a;
		}
		System.out.println(res);

		/** --square each digit and add them in the string */
		int n = 9119;

		String result = "";

		while (n != 0) {
			int digit = n % 10;
			result = digit * digit + result;
			n = n / 10;
		}

		System.out.println(Integer.parseInt(result));

	}

  /**Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char. */
  public static boolean getXO (String str) {
    int xcount =0;
    int ocount = 0;
    // Good Luck!!
for (int i = 0; i<str.length(); i++) {
if (str.charAt(i) =='x') {
xcount = xcount+1;
  } 
  if (str.charAt(i) =='o') {
ocount = ocount+1;
  } 
}
return xcount == ocount;
}


/**total passengers in the bus: 3 Ways to code */
	public static int countPassengers1(ArrayList<int[]> stops) {
		// Code here!
		int result = 0;
		for (int i = 0; i < stops.size(); i++) {
			result += stops.get(i)[0];
			result -= stops.get(i)[1];
		}
		return result;
	}

	public static int countPassengers2(ArrayList<int[]> stops) {
		int res = 0;
		for (int[] onOff : stops)
			res += onOff[0] - onOff[1];
		return res;
	}

	public static int countPassengers3(ArrayList<int[]> stops) {
		return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
	}

	public int multiplyDigitsUntilZero(int n) {
	//int n = 9119;

	String result = "";

	while (n != 0) {
		int digit = n % 10;
		result = digit * digit + result;
		n = n / 10;
	}
	return Integer.parseInt(result);
	
	}
	
	//System.out.println(Integer.parseInt(result));
	public int squareDigits(int n) {
		String result = "";

		while (n != 0) {
			int digit = n % 10;
			result = digit * digit + result;
		}

		return Integer.parseInt(result);
	}
	/*
	 * public int squareDigits(int n) { String result = "";
	 * 
	 * while (n != 0) { int digit = n % 10 ; result = digit*digit + result ; n /= 10
	 * ; }
	 * 
	 * return Integer.parseInt(result) ;
	 */
}
