package course;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		try {
			System.out.print("Quantos números inteiros pretende entrar? ");
			int n = sc.nextInt();
			int soma = 0;
			
			for (int i = 1; i <= n; i++) {
				System.out.print("Valor #" + i + ": ");
				int x = sc.nextInt();
				soma += x;				
			}
			System.out.println("Soma = " + soma);			
			
		} finally {
			sc.close();
		}
	}

}
