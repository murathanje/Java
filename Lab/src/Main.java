public class Main {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Murathan", "Kagan");
        System.out.println(person.toString());
        Person person1 = new Person("Emre", "Şimşek");
        System.out.println(person1.toString());
        Person person2 = new Person(4);
        System.out.println(person2.toString());


    }
}
