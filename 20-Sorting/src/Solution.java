
/**
 * Task: Given an array, a, of size n containing distinct elements a[0],
 * a[1],..., a[n-1], sort array a in ascending order using the Bubble Sort
 * algorithm above. Once sorted, print the following 3 lines:
 * 
 * 1. Array is sorted in numSwaps swaps -> Where numSwaps is the number of
 * swaps that took place.
 * 
 * 2. Firs Element: firstElement -> Where firstElement is the first element
 * in the sorted array.
 * 
 * 3. Last Element: LastElement -> Where lastElement is the last element in
 * the sorted array.
 * 
 */
import java.util.Scanner;

public class Solution {

	// Variavel da classe
	public static int numDeTrocas;

	// Metodo da classe
	public static int[] ordenaBubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					numDeTrocas++;
				}
			}
			if (numDeTrocas == 0) {
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] vetorOrdenado = Solution.ordenaBubbleSort(a);

		System.out.println("Array is sorted in " + numDeTrocas + " swaps.");
		System.out.println("First Element: " + vetorOrdenado[0]);
		System.out.println("Last Element: " + vetorOrdenado[n - 1]);
	}

}