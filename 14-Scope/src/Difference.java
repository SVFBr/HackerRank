
//Task: Complete the Difference class by writing the following:
//
//A class constructor that takes an array of integers as a parameter and saves
//it to the elements instance variable.
//
//A computeDifference method that finds the maximum absolute
//difference between any 2 numbers in N and stores it in the
//maximumDifference instance variable.

public class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int[] array) {
        elements = array;
    }
	
	public void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
        }
        
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i+1; j < elements.length ; j++ ){
              
                if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
        
        return;
    }

}