public class Main {
    public static void main(String[] args) throws Exception {

        Car[] cars = {
            new Car(1, 2016), 
            new Car(2, 2014), 
            new Car(3, 2011), 
            new Car(4, 2010)
        };

        Garage garage = new Garage(cars);
        garage.printCarsOrderThan(5);
    }
}
