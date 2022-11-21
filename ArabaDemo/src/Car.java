public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;


    public Car(int _id, int _productionYear){
        this.id = _id;
        this.productionYear = _productionYear;
    }

    public void setPower(int _power){
        this.power = _power;
    }

    public int getProductionYear(){
        return productionYear;
    }
    
    public int getAge(){
        return 2022 - productionYear;
    }

    public void startAndMove(){
        System.out.println("Motor started");
    }

    public void stop(){
        System.out.println("Motor stopped");
    }

    public String toString(){
        return id + " " + productionYear + " " + power + " " + counter;
    }


}
