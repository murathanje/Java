
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Murathan");
		product.setId(1);
		product.setDescription("Asus Gaming Laptop");
		product.setPrice(9876.99);
		product.setStockAmount(500);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		System.out.println(product.getDescription());
		


	}

}
