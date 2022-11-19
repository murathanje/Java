public class Company {
    Employee[] employees;

    public Company(Employee[] _employees){
        employees = _employees;
    }

    public void printEmployees(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
