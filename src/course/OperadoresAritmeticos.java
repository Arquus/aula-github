package course;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3; // "módulo" (resto da divisão) => %.
		double n4 = (double) 10 / 8;
		
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt((Math.pow(b , 2)) - (4 * a * c))) / (2.0 * a); // (-b + sqrt (b^2 - 4ac) / 2a
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);

	}

}
