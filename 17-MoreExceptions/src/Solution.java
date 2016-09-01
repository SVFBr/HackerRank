import java.util.Scanner;

/**
 * Task: Write a Calculator class with a single method: int power(int,int). The
 * power method takes two integers, n and p, as parameters and returns the
 * integer result of nP. If either n or p is negative, then the method must
 * throw an exception with the message: n and p should be non-negative.
 * 
 * Note: Do not use an access modifier (e.g.: public) in the declaration for
 * your Calculator class.
 * 
 */

public class Solution {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
