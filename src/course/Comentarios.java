package course;

import java.util.Locale;
import java.util.Scanner;

public class Comentarios {

	public static void main(String[] args) {
		/*
		 * (COMENT�RIO DE BLOCO) Este programa calcula as ra�zes de uma equa��o do
		 * segundo grau Os valores dos coeficientes devem ser digitados um por linha
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c; // c�lculo do valor de delta (COMENT�RIO DE LINHA)
	}

}
