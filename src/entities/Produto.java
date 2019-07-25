package entities;

public class Produto {
	public String nome;
	public double preco;
	public int qtde;
	
	public double valorTotalEmEstoque() {
		return preco * qtde;		
	}

	public void adicionaProdutos(int qtde) {
		this.qtde += qtde;
	}
	
	public void removeProdutos(int qtde) {
		this.qtde -= qtde;
	}
	
	public String toString() {
		return nome 
			+ ", $ "
			+ String.format("%.2f", preco)  
			+ ", " 
			+ qtde 
			+ " unidade(s), Total $ " 
			+ String.format("%.2f", valorTotalEmEstoque());			   
	}
}
