import java.util.Scanner;

public class Solution {
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println(factorial(num));

	}
}
