package course;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		try { // tratamento de exeções por minha conta (hehe).

			var sentenca = sc.nextLine();

			String x, y, z;
			x = sc.next(); // com <enter> a próxima entrada é efetuada na linha seguinte
			y = sc.next();
			z = sc.next();

			System.out.println(sentenca);
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
			x = sc.next(); // com <espaço> a próxima entrada é efetuada na mesma linha
			y = sc.next();
			z = sc.next();
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
		} finally {
			sc.close(); // Ao iniciar um objeto Scanner o compilador alerta para executar o método de fechamento (close).
		}
		

	}

}
