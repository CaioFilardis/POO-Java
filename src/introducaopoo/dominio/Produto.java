package dominio;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public void imprime(String name, double price, int qtd) {
		System.out.printf("Product data");
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
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
				+" units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	

}
	
