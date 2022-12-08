public class Cone extends Shape3D{

    public Cone(double _height, double _radius) {
        super(_height, _radius);
    }

    public double getVolume() {
        return super.getArea() / 3 * height;
    }

    public double getArea() {
        return super.getArea() * PI * 2 * radius * (Math.pow((Math.pow(height, 2)) + Math.pow(radius, 2),1/2));
    }
    
}
