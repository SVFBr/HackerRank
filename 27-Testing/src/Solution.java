/**
 * 
 * This challenge is very different from the traditional ones because it
 * requires you to generate valid test cases for a problem instead of solving
 * the problem. There are no sample testcases, you simply have to generate test
 * values for the problem that satisfy both the problem's Input Format and the
 * criterion laid out in the Task section.
 * 
 * Consider the following problem: Problem Statement A Discrete Mathematics
 * professor has a class of N students. Frustrated with their lack of
 * discipline, the professor decides to cancel class if fewer than K students
 * are present when class starts. Given the arrival time of each student,
 * determine if the class is canceled.
 * 
 * Input Format The first line of input contains T, the number of test cases.
 * Each test case spans two lines. The first has two space-separated integers, N
 * (students in the class) and K (the cancelation threshold). The second
 * contains N space-separated integers (a1,…,aN) describing the students arrival
 * times.
 * 
 * Note: Non-positive arrival times (ai<=0) indicate the student arrived early
 * or on time; positive arrival times (ai>0) indicate the student arrived ai
 * minutes late. If a student arrives exactly on time (ai=0), the student is
 * considered to have entered before the class started.
 * 
 * Output Format For each test case, print the word YES if the class is canceled
 * or NO if it is not, on a new line.
 * 
 * Example
 * 
 * When properly solved, this input: 2 4 3 -1 -3 4 2 4 2 0 -1 2 1
 * 
 * Should produce this output: YES NO
 * 
 */

public class Solution {

	public static void main(String[] args) {
		System.out.println(5);
		System.out.println("200 200");
		for (int i = -99; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("3 2");
		System.out.println("-1000 0 1000");
		System.out.println("4 3");
		System.out.println("-1 0 1 1000");
		System.out.println("5 2");
		System.out.println("-1000 0 -1 2 1000");
		System.out.println("6 3");
		System.out.println("1 2 3 4 -1 0");
	}
}
