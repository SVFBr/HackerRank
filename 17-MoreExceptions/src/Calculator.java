
class Calculator {

	static int power(int number, int power) throws Exception {

		if ((number < 0) || (power < 0)) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(number, power);
		}
	}

}
