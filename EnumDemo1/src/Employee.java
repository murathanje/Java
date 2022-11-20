public class Employee {
    
    private int id;
    private String name;

    public Employee(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public String toString(){
        return id + " " + name;
    }
}
