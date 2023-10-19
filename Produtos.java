package Aula7;

public class Produtos {
	private String nome;
	private String categoria;
	private double preco;
	private int quantidadeEstoque;
	
	public Produtos (String nome, String categoria, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		
	}
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
    	this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setpreco(double preco) {
    	this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEstoque;
    }
    
    public void setQuantidadeEmEstoque(int quantidadeEstoque){
    	this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void Vender(int quantidade) {
    	if(quantidade <= quantidadeEstoque) {
    		quantidadeEstoque -= quantidade;
    	}else {
    		System.out.println("Sem Estoque.");
    		
    		
    	}
    }
}

