package leetCode.java.easy;

/*

	Name: ReverseInteger
	Author: Stanislav L.
	Date: 29/07/2021

	***

	Given a signed 32-bit integer x, return x with its digits reversed. 
	If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
	Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

	Example 1:

	Input: x = 123
	Output: 321

	Example 2:

	Input: x = -123
	Output: -321

	Example 3:

	Input: x = 120
	Output: 21

	Example 4:

	Input: x = 0
	Output: 0
*/

public class ReverseInteger {
	public static int reverse(int x) {
		String a = "";
		long tmp = x;
		int ng = 1;
		StringBuilder out = new StringBuilder();
		
		if (x == 0)
			return 0;
		
		if (tmp < 0){
			ng = -1;
			tmp = tmp * -1;
		}

		a = Long.toString(tmp);
		out.append(a);
		out.reverse();

		tmp = Long.parseLong(out.toString());

		tmp = tmp * ng;
		if (tmp < Math.pow(-2, 31) || tmp > (Math.pow(2, 31) - 1))
			return 0;
		
		return (int)tmp;
    }

	public static void main(String[] args) {
		System.out.println(reverse(-1123));
	}
}

