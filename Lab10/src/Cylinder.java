public class Cylinder extends Shape3D{

    public Cylinder(double _height, double _radius) {
        super(_height, _radius);
    }
    
    public double getVolume(){
        return PI * radius * radius * height;
    }

    public double getArea(){
        return PI * radius * radius*2/radius*(height+radius);
    }
}
