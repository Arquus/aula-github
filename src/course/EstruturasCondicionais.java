package course;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		try {
			System.out.println("Entre com um número inteiro:");
			int n = sc.nextInt();

			if (n % 2 == 0) {
				System.out.println("Número é PAR!");
			} else {
				System.out.println("Número é IMPAR!");
			}

		} finally {
			sc.close();
		}
	}
}
