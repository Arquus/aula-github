package course;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		char genero = 'F';
		int idade = 32;
		double saldo = 10.35784;
		String name = "Maria";
		
		System.out.print("Bom dia! ");
		System.out.println("Boa tarde!");
		System.out.println("Boa noite!");
		System.out.println("-----------------");
		System.out.printf("%.2f%n", saldo); // %n ou \n = Line Feed.
		System.out.printf("%.4f%n", saldo); // %n ou \n = Line Feed.
		Locale.setDefault(Locale.US); // Pontua��o dos USA, pois o padr�o � a pontua��o configurada no computador.
		System.out.printf("%.4f%n", saldo); // %n ou \n = Line Feed.
		System.out.println("-----------------");
		System.out.printf("%s tem %d anos de idade, g�nero %c, e com saldo banc�rio de %.2f reais %n", name, idade, genero, saldo);	

	}

}
