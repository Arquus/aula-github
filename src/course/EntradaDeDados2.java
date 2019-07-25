package course;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Garantir entrada com pontua��o americana (n.nnn). Deve ser modificado antes de instanciar objeto Scanner.
		var sc = new Scanner(System.in);
		try {
			int n1 = sc.nextInt(); // 54
			sc.nextLine(); // como houve um "nextInt" com <enter> (LF) � preciso ler esse <enter> sen�o o programa encerra no pr�ximo "nextLine"
			String nome = sc.nextLine(); // Jo�o Grand�o
			char genero = sc.next().charAt(0); // M
			
			String s = sc.next(); // b5
			char letra = s.charAt(0);
			int digito = Integer.parseInt(s.substring(1));
			
			double n2 = sc.nextDouble(); // 4.32
			
			String nome2 = sc.next(); // Pra receber: Maria F 23 1.68
			char ch = sc.next().charAt(0);
			int idade = sc.nextInt();
			double altura = sc.nextDouble();			
			
			System.out.println(n1);
			System.out.println(nome);
			System.out.println(genero);
			System.out.println(letra);
			System.out.println(digito);
			System.out.println(n2);
			System.out.println(nome2);
			System.out.println(ch);
			System.out.println(idade);
			System.out.println(altura);
			
		} finally {
			sc.close();
			System.out.println("sc Closed!");
		}

	}

}
