import java.util.Scanner;

/**
 * Task: A palindrome is a word, phrase, number, or other sequence of characters
 * which reads the same backwards and forwards. Can you determine if a given
 * string,s , is a palindrome?
 * 
 * To solve this challenge, we must first take each character in s, enqueue it
 * in a queue, and also push that same character onto a stack. Once that's done,
 * we must dequeue the first character from the queue and pop the top character
 * off the stack, then compare the two characters to see if they are the same;
 * as long as the characters match, we continue dequeueing, popping, and
 * comparing each character until our containers are empty (a non-match means s
 * isn't a palindrome).
 * 
 * Write the following declarations and implementations:
 * 
 * 1. Two instance variables: one for your stack , and one for your queue. 2. A
 * void pushCharacter(char ch) method that pushes a character onto a stack. 3. A
 * void enqueueCharacter(char ch) method that enqueues a character in the queue
 * instance variable. 4. A char popCharacter() method that pops and returns the
 * character at the top of the stack instance variable. 5. A char
 * dequeueCharacter() method that dequeues and returns the first character in
 * the queue instance variable.
 * 
 */

public class Solution {

	class Node {
		char data;
		Node next;
		Node(char dataIn) {
			data = dataIn;
			next = null;
		}
	}

	Node stackHead = null;
	Node queueHead = null;
	Node queueTail = null;

	private char dequeueCharacter() {
		if (queueHead == null) {
			throw new IllegalStateException("Can't remove from an empty queue");
		}
		char returnData = queueHead.data;
		queueHead = queueHead.next;
		if (queueHead == null) {
			queueTail = null;
		}
		return returnData;
	}

	private char popCharacter() {
		if (stackHead == null) {
			throw new IllegalStateException("Can't pop off of an empty list");
		}
		char returnValue = stackHead.data;
		stackHead = stackHead.next;
		return returnValue;
	}
		
		
	private void enqueueCharacter(char c) {
		Node newC = new Node(c);
		if (queueHead == null) {
			queueHead = newC;
			queueTail = newC;
		} else {
			queueTail.next = newC;
			queueTail = newC;
		}
	}

	private void pushCharacter(char c) {
		Node newC = new Node(c);
		newC.next = stackHead;
		stackHead = newC;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		char[] s = input.toCharArray();

		Solution p = new Solution();

		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}
