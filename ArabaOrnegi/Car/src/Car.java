public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;

    public Car(int _id, int _productionYear){
        this.id = _id;
        this.productionYear = _productionYear;
    }

    void setPower(int _power){
        this.power = _power;
    }

    int productionYear(){
        return productionYear;
    }

    int getAge(){
        return (2022 - productionYear);
    }

    void startAndMove(){
        System.out.println("startAndMove çalıştı");
    }

    void stop(){
        System.out.println("stop çalıştı");
    }

    public String toString(){
        return (counter + "" + id + " " + productionYear + " " + power + " ");
    }

}

