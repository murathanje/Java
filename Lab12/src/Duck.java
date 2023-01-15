public class Duck extends Animal implements Flyable,Swimable{

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override 
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void move() {
        System.out.println("Duck can move");
    }
    
}
