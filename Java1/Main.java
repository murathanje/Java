package example;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi");
		product1.setDiscount(7);
		product1.setUnitPrice(7600);
		product1.setImageUrl("image.jpg");
		product1.setUnitInStock(3);




		Product product2 = new Product();

		Product product3 = new Product();
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0552222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Murathan");
		individualCustomer.setLastName("Kagan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0552222222");
		corporateCustomer.setCustomerNumber("12345");
		corporateCustomer.setCompanyName("A Company");
		corporateCustomer.setTaxNumber("123456");
		
		Customer[] customerl = {individualCustomer,corporateCustomer};

	}

}
