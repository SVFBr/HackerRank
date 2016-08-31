import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] argh) {
		// Coleção
		Map<String, Integer> map = new HashMap<String, Integer>();

		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		// Coletando N entradas
		for (int i = 0; i < n; i++) {
			String nome = entrada.next();
			int telefone = entrada.nextInt();
			map.put(nome, telefone);
		}
		while (entrada.hasNext()) {
			String s = entrada.next();

			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		entrada.close();
	}
}