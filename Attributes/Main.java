
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "Murathan";
		product.id = 1;
		product.description = "Asus Gaming Laptop";
		product.price = 9876.99;
		product.stockAmount = 500;		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);


	}

}
