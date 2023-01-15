public abstract class Shape2D {

    protected final double PI = 3.14;
    double height;
    double radius;
    double width;

    public Shape2D(double _height, double _width){
        height = _height;
        width = _width;
    }

    public Shape2D(double _radius){
        radius = _radius;
    }


    public abstract double getArea();

    public String toString(){
        return ("Area is: " + getArea());
    }
}
