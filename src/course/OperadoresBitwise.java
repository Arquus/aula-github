package course;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		var sc = new Scanner(System.in);
		try {
			int mascara = 0b00100000;
			int n = sc.nextInt();
			if ( (n & mascara) != 0 ) {
				System.out.println("Sexto bit é true");
			} else {
				System.out.println("Sexto bit é false");				
			}
			
		} finally {
			sc.close();
		}
		
	}

}
