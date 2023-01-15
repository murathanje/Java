public class Fish extends Animal implements Swimable{
    
    @Override
    public void swim(){
        System.out.println("fish swims");
    }

    @Override
    public void move(){
        System.out.println("Fish can not move");
    }
}
