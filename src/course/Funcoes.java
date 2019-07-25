package course;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// double x = Math.sqrt(25.0);
		// System.out.println(x);

		var sc = new Scanner(System.in);
		try {
			System.out.println("Digite três números:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int maior = maior(a, b, c);
			exibeResultado(maior);

			/*
			 * if (a > b && a > c) { System.out.println("Maior = " + a); } else if (b > c) {
			 * System.out.println("Maior = " + b); } else { System.out.println("Maior = " +
			 * c); }
			 */
		} finally {
			sc.close();
		}
	}

	public static int maior(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void exibeResultado(int valor) {
		System.out.println("Maior = " + valor);
	}

}
