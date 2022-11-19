public class Person {
    private static int id;
    private String firstNAme;
    private String lastName;
    private int age;

    public Person(int _id, String _firstName, String _lastName, int _age){
        Person.id = _id;
        this.firstNAme = _firstName;
        this.lastName = _lastName;
        this.age = _age;

    }

    public Person(String _firstName, String _lastNAme){
        this(++Person.id, _firstName, _lastNAme, 0); 
        age = 22;
    }

    public Person(int _id){
        this(_id, "","",0);

    }
    
    public String toString(){
        return id + " " + firstNAme + " " + lastName + " " + age;
    }


}
