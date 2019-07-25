package course;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		double preco = 400.00; // Para ser utilizada antes a variável necessariamente tem de ser inicializada!
		double desconto; // inicializado no "if".

		if (preco < 200.00) {
			// double desconto = preco * 0.1; // Nessa definição "desconto" só é acessível dentro do bloco do "if".
			desconto = preco * 0.1;
		} else {
			desconto = 0.0;
		}

		System.out.println(preco);
		System.out.println(desconto);
	}
}
