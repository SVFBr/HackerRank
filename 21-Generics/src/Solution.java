
public class Solution {

	/**
	 * Task: Write a single generic function named printArray; this function
	 * must take an array of generic elements as a parameter. The locked
	 * Solution class in your editor tests your function.
	 * 
	 * Note: You must use generics to solve this challenge. Do not write
	 * overloaded functions.
	 */


	public static <E> void printArray(E[] vetorPassado) {
		for (E elemento : vetorPassado)
			System.out.println(elemento);
	}

	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Solution.class.getDeclaredMethods().length > 2) {
			System.out.println("You should only have 1 method named printArray.");
		}
	}

}
