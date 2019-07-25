package course;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); String dia; if (x
		 * == 1) { dia = "Domingo"; } else if (x == 2) { dia = "Segunda-feira"; } else
		 * if (x == 3) { dia = "Terça-feira"; } else if (x == 4) { dia = "Quarta-feira";
		 * } else if (x == 5) { dia = "Quinta-feira"; } else if (x == 6) { dia =
		 * "Sexta-feira"; } else if (x == 7) { dia = "Sábado"; } else { dia =
		 * "Valor Inválido!"; } System.out.println("Dia: " + dia);
		 */

		Scanner sc = new Scanner(System.in);
		try {

			int x = sc.nextInt();
			String day;
			switch (x) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";
				break;
			default:
				day = "Invalid value";
			}
			System.out.println("Day: " + day);

		} finally {
			sc.close();
		}

	}

}
