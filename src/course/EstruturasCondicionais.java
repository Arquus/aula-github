package course;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		try {
			System.out.println("Entre com um n�mero inteiro:");
			int n = sc.nextInt();

			if (n % 2 == 0) {
				System.out.println("N�mero � PAR!");
			} else {
				System.out.println("N�mero � IMPAR!");
			}

		} finally {
			sc.close();
		}
	}
}
