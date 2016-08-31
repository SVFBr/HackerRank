
public class Student extends Person {

	/**
	 * Task: You are given two classes, Person and Student, where Person is the
	 * base class and Student is the derived class. Completed code for Person
	 * and a declaration for Student are provided for you in the editor. Observe
	 * that Student inherits all the properties of Person.
	 * 
	 * Complete the Student class by writing the following:
	 * 
	 * A Student class constructor, which has 4 parameters: A string firstName,
	 * A string lastName, An integer id, An integer array (or vector) of test
	 * scores scores, A char calculate() method that calculates a Student
	 * object's average and returns the grade character representative of their
	 * calculated average:
	 * 
	 */
	private int[] testScores;
	private int id;
	private int sum = 0;
	private int result = 0;
	String ans;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
		this.id = id;
	}

	public String calculate() {
		
		
		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}

		result = sum / testScores.length;
		if (result >= 90 && result <= 100) {
			 ans = "0";
		} else if (result >= 80 && result < 90) {
			ans = "E";
		} else if (result >= 70 && result < 80) {
			ans = "A";
		} else if (result >= 55 && result < 70) {
			ans = "P";
		} else if (result >= 40 && result < 55) {
			ans = "D";
		} else if (result < 40) {
			ans = "T";
		}
		return ans;
	}

}