import java.util.Scanner;

/**
 * Task: A prime is a natural number greater than 1 that has no positive
 * divisors other than 1 and itself. Given a number, n, determine and print
 * whether it's Prime or Not prime.
 * 
 */

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int numTeste = sc.nextInt();
			
			// Checa se número é divisível por 2
			if (numTeste < 2 || (numTeste > 2 && (numTeste & 1) == 0))
				System.out.println("Not prime");
			else {
				boolean isPrime = true;
				for (int j = 2; j < (int) Math.sqrt(numTeste); j++) {
					if (numTeste % j == 0) {
						isPrime = false;
						break;
					}
				}
				System.out.println(isPrime ? "Prime" : "Not prime");
			}
		}
	}
}