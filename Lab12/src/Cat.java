public class Cat extends Animal implements Swimable{

    @Override
    public void swim(){
        System.out.println("Cat can swim.");
    }

    @Override
    public void move(){
        System.out.println("Cat can move");
    }
    
}
