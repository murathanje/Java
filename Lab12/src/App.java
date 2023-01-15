import javax.print.FlavorException;

public class App {
    public static void main(String[] args){
        Animal a = new Duck();
        a.swim();
        a.fly();
        a.move();
        Flyable f = (Flyable) new Fish();
        f = new Duck();
        f.fly();

    }
}
