public class JavaEnumTest {
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee(0, "Murathan", 0, CompanyName.GOOGLE);
        Employee employee1 = new Employee(1, "Ahmet", 1, CompanyName.MICROSOFT);

        Employee[] employees = {employee, employee1};

        Company company = new Company(employees);

        company.printEmployees();
    }
}
