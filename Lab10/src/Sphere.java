public class Sphere extends Shape3D {

    public Sphere(int _depth, double _radius) {
        super(_depth, _radius);
    }

    public double getVolume() {
        return PI * radius * radius * 4/3 * radius;
    }

    public double getArea() {
        return PI * radius * radius * 4/3;
    }
    
}
