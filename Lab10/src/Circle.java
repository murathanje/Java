public class Circle extends Shape2D {

    public Circle(double _radius) {
        super(_radius);
    }

    public double getArea(){
        return PI * radius * radius;
    }

}
