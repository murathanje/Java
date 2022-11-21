public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(0, 2010);
        Car car2 = new Car(1, 2011);
        Car car3 = new Car(2, 2012);
        Car car4 = new Car(3, 2013);

        car1.setPower(1000);
        car2.setPower(2000);
        car3.setPower(3000);
        car4.setPower(4000);

        Car[] cars = {car1,car2,car3,car4};

        Garage garage = new Garage(cars);
        
        garage.printCarsOlderThan(5);
    }
}
