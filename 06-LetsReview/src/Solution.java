import java.util.Scanner;

public class Solution {
	public static void printParesEspacoImpares(char[] entradaArray) {
		int N = entradaArray.length;

		for (int i = 0; i < N; i += 2) {
			System.out.print(entradaArray[i]);
		}
		System.out.print(" ");

		for (int i = 1; i < N; i += 2) {
			System.out.print(entradaArray[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		for (int i = 1; i <= t; i++) {
			String entrada = s.nextLine();
			printParesEspacoImpares(entrada.toCharArray());
		}
	}

}
