public class Company {
    private Employee[] employees;
    private CompanyName[] companyNames;

    public Company(Employee[] e, CompanyName[] c){
        this.employees = e;
        this.companyNames = c;
    }


    public void getEmployee(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void getCompany(){
        for(CompanyName companyName : companyNames){
            System.out.println(companyName);
        }
    }
}
