package course;

public class TiposPrimitivos {

	public static void main(String[] args) {

		boolean completed = false;

		char gender = 'F';
		char letter = '\u0041'; // \u0041 é o mesmo que 'A'.

		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L; // Padrão para números inteiros é "int". Para números "long" colocar "L" ou "l". 
		
		float n5 = 4.5f; // Padrão de ponto flutuando são números "double". Para números float colocar "F" ou "f".
		double n6 = 4.5;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);		
		
		String name = "Maria Green";
		Object obj = "Alex Brown"; // Todo objeto, como String, descende de Object.
		Object obj2 = 4.5f;
		
		System.out.println(name);
		System.out.println(obj);
		System.out.println(obj2);

	}

}
