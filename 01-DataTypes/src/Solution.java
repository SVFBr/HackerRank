import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "Hacker Rank ";

		Scanner scan = new Scanner(System.in);

		int i2;
		Double d2;
		String s2;

		// Primeira forma
		// i2 = scan.nextInt();
		// d2 = scan.nextDouble();
		// scan.nextLine();
		// s2 = scan.nextLine();

		// Segunda forma
		i2 = Integer.parseInt(scan.nextLine());
		d2 = Double.parseDouble(scan.nextLine());
		s2 = scan.nextLine();

		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s.concat(s2));

		scan.close();

	}

}
