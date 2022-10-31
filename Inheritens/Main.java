
public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

		customer.age = 11;
		customer.firstName = "Murathan";
		customer.lastName = "Kağan";
		customer.id = 12;

		employee.age = 18;
		employee.firstName = "Batuhan";
		employee.lastName = "Muhammed";
		employee.id = 16;

		System.out.println(customer.age);
		System.out.println(customer.firstName);
		System.out.println(customer.lastName);
		System.out.println(customer.id);

		System.out.println(employee.age);
		System.out.println(employee.firstName);
		System.out.println(employee.lastName);
		System.out.println(employee.id);

	}

}
