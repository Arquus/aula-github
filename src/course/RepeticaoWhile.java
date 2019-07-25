package course;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);

		try {
			double rq;
			double n = 0.0;

			while (n >= 0.0) {
				System.out.print("Entre um n�mero: ");
				n = sc.nextDouble();
				if (n >= 0.0) {
					rq = Math.sqrt(n);
					System.out.printf("%.3f%n", rq);
				}
			}

			System.out.println("N�mero negativo! Programa encerrado!");

		} finally {
			sc.close();
		}
	}

}
