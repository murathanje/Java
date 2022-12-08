public class Pyramid extends Shape3D{

    public Pyramid(int _depth, double _height, double _width) {
        super(_depth, _height, _width);
    }
    
    public double getVolume() {
        return height * width * width / 3;
    }

    public double getArea() {
        return height * width * 4 / 2;
    }
    
}
