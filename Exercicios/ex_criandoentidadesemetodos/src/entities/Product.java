package entities;

public class Product {
	
	/*
	 * n�o se usa o static void
	 * inicia-se a cria��o da classe Product
	 * primeiramente declarando os atributos 
	 */
	
	public String name;
	public double price;
	public int quantity;

	//opera��es ou fun��es ou m�todos
	
	public double totalValueInStock( ) { 
		//opera��o que retorna pre�o * quantidade
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		//opera��o que adiciona valor ao quantidade
		this.quantity += quantity;
		//"this" referencia o atributo quantity 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
