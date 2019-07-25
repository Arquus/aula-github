package course;

public class Conversao {

	public static void main(String[] args) {
		double da;
		float db;
		
		da = 5.0;
		db = (float)da; // casting
		
		System.out.println(db);
		
		double d;
		int i;

		d = 5.7;
		i = (int)d; // casting - trunca (perda de valor) valor de "d".
		
		System.out.println(i);		

		int ia, ib;
		double dr;

		ia = 5; ib = 2;
		dr = (double) ia / ib; // casting. Do contrário (sem o casting) o resultado seria truncado (ex: 5/2=2.0)
		
		System.out.println(dr);		
		
		String s = "123";
		int si;
		
		// si = (int)s; // casting não se aplica a tipos incompatíveis!
		
		si = Integer.parseInt(s); // Forma correta de conversão explícita com "Integer.parseInt"!
		dr = Double.parseDouble(s);
		
		System.out.println(si);
		System.out.println(dr);
		
	}

}
