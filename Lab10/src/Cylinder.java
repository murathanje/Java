public class Cylinder extends Shape3D{

    public Cylinder(double _height, double _radius) {
        super(_height, _radius);
    }
    
    public double getVolume(){
        return super.getVolume();
    }

    public double getArea(){
        return super.getArea()*2/radius*(height+radius);
    }
}
