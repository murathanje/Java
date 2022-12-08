public class App {
    public static void main(String[] args){

        Square square = new Square(13.1);
        System.out.println(square.getArea());


        Circle circle = new Circle(13.1);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(13.2, 13.1);
        System.out.println(rectangle.getArea());

        Cylinder cylinder = new Cylinder(10, 12);
        System.out.println(cylinder.getVolume());

    }
}
