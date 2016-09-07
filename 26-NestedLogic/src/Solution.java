import java.util.Scanner;

/**
 * Task: Your local library needs your help! Given the expected and actual
 * return dates for a library book, create a program that calculates the fine
 * (if any). The fee structure is as follows:
 * 
 * If the book is returned on or before the expected return date, no fine will
 * be charged (i.e.: fine =0).
 * 
 * If the book is returned after the expected return day but still within the
 * same calendar month and year as the expected return date, fine = 15 Hackos x
 * (the number of days late).
 * 
 * If the book is returned after the expected return month but still within the
 * same calendar year as the expected return date, the fine = 500 Hackos x (the
 * number of months late).
 * 
 * If the book is returned after thecalendar year in which it was expected,
 * there is a fixed fine of 10000 Hackps.
 * 
 */

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int actualDay = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();
		int expectedDay = sc.nextInt();
		int expectedMonth = sc.nextInt();
		int expectedYear = sc.nextInt();

		int fine;
		if (actualYear > expectedYear) {
			fine = 10000;
		} else if (actualMonth > expectedMonth && (actualYear >= expectedYear)) {
			fine = 500 * (actualMonth - expectedMonth);
		} else if (actualDay > expectedDay && (actualMonth >= expectedMonth) && (actualYear >= expectedYear)) {
			fine = 15 * (actualDay - expectedDay);
		} else {
			fine = 0;
		}
		System.out.println(fine);

		sc.close();
	}
}