package entities;

public class Product {
	
	/*
	 * não se usa o static void
	 * inicia-se a criação da classe Product
	 * primeiramente declarando os atributos 
	 */
	
	public String name;
	public double price;
	public int quantity;

	//operações ou funções ou métodos
	
	public double totalValueInStock( ) { 
		//operação que retorna preço * quantidade
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		//operação que adiciona valor ao quantidade
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
