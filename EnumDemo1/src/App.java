public class App {
    public static void main(String[] args){

        Employee employee =new Employee(0, "Murathan");
        Employee employee1 =new Employee(1, "Ahmet");
        Employee employee2 =new Employee(2, "Emre");
        Employee[] employees = {employee,employee1,employee2};

        CompanyName[] companyNames = {CompanyName.AKINSOFT,CompanyName.MICROSOFT,CompanyName.APPLE};

        Company company = new Company(employees, companyNames);
        company.getCompany();
        company.getEmployee();
        
        

    }
}
