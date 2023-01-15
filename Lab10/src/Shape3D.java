public abstract class Shape3D extends Shape2D{

    double depth;

    public Shape3D (double _depth,double _height, double _width) {
        super(_height, _width);
        depth = _depth;
    }

    public Shape3D(double _height, double _radius){
        super(_height,_radius);
    }


    public abstract double getVolume();

    public String toString(){
        return ("Volume is: " + getVolume());
    }

}
