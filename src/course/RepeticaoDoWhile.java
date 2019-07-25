package course;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		char r;
		var sc = new Scanner(System.in);

		try {
			do {
				System.out.print("Entre um número: ");
				double n = sc.nextDouble();
				double rq = Math.sqrt(n);
				System.out.printf("Raiz Quadrada = %.3f%n", rq);

				System.out.print("Repetir [s/n]? ");
				r = sc.next().charAt(0);

			} while (Character.toLowerCase(r) != 'n');
			System.out.println("Ok, programa será encerrado!");

		} finally {
			sc.close();
		}

	}

}
