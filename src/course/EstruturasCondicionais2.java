package course;

import java.util.Scanner;

public class EstruturasCondicionais2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		try {
			System.out.println("Que horas são?");
			int hora = sc.nextInt();

			if (hora < 12) {
				System.out.println("Bom dia!");
			} else if (hora < 18) {
				System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}

		} finally {
			sc.close();
		}
	}

}
