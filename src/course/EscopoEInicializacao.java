package course;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		double preco = 400.00; // Para ser utilizada antes a vari�vel necessariamente tem de ser inicializada!
		double desconto; // inicializado no "if".

		if (preco < 200.00) {
			// double desconto = preco * 0.1; // Nessa defini��o "desconto" s� � acess�vel dentro do bloco do "if".
			desconto = preco * 0.1;
		} else {
			desconto = 0.0;
		}

		System.out.println(preco);
		System.out.println(desconto);
	}
}
