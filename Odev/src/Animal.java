public class Animal {
    private String name;
    private AnimalTypes type;

    public Animal(String _name, AnimalTypes _type) {
        this.name = _name;
        this.type = _type;
    }

    public String toString() {
        return name + " " + type;
    }

}
