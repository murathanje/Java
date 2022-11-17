public class Garage {
    private Car[] cars;

    public Garage(Car[] _cars){
        this.cars = _cars;
    }

    void printCarsOrderThan(int age){
        for(Car car : cars){
            if(car.getAge() > 5){
                System.out.println(car.toString());
            }
        }
    }
}
