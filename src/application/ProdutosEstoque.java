package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProdutosEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		try {
			Produto produto = new Produto();
			System.out.println("Entre os dados do produto: ");
			System.out.print("Nome: ");
			produto.nome = sc.nextLine();
			System.out.print("Preço: ");
			produto.preco = sc.nextDouble();
			System.out.print("Quantidade em Estoque: ");
			produto.qtde = sc.nextInt();

			// System.out.println(produto.nome + ", " + produto.preco + ", " +
			// produto.qtde);
			System.out.println();
			System.out.println("Dados do produto: " + produto); // Implicitamente:
																// System.out.println(produto.toString());

			System.out.println();
			System.out.print("Entre o número de produtos a serem adicionados ao Estoque: ");
			int qtde = sc.nextInt();
			produto.adicionaProdutos(qtde);

			System.out.println();
			System.out.println("Dados atualizados: " + produto); // Implicitamente:
																	// System.out.println(produto.toString());
			System.out.println();
			System.out.print("Entre o número de produtos a serem removidos do Estoque: ");
			qtde = sc.nextInt();
			produto.removeProdutos(qtde);

			System.out.println();
			System.out.println("Dados atualizados: " + produto); // Implicitamente:
																	// System.out.println(produto.toString());

		} finally {
			sc.close();
		}

	}

}
