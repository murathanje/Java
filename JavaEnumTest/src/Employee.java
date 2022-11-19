public class Employee {
    
    public int id;
    private String name;
    public int ssn;
    private CompanyName cName;

    public Employee(int _id, String _name, int _ssn, CompanyName _cName){
        this.name = _name;
        this.cName = _cName;
        this.id = _id;
        this.ssn = _ssn;
    }

    public String toString(){
        return id + " " + name + " " + ssn + " " + cName;
    }
}
