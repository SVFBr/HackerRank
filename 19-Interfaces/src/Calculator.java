
public class Calculator implements AdvancedArithmetic {

	public int divisorSum(int numero) {
		int soma;
		int divMax = (int) Math.sqrt(numero);
		if (numero != 1) {
			soma = 1 + numero;
		} else {
			soma = 1;
		}
		for (int divisor = 2; divisor <= divMax; divisor++) {

			if (numero % divisor == 0) {
				soma += divisor;
				int parDivisor = numero / divisor;
				if (parDivisor != divisor) {
					soma += parDivisor;
				}
			}
		}
		return soma;
	}
}
