public class Patient {
    private int id;
    static int counter;
    private String name;
    private float temperature = 36.5;
    public static final String doctor = "Jone";

    public patient(String name, double temp,String doctor){ 
        this(name,temp,++counter,doctor); 
    }

    private Patient(String name, float temp, int pId, String doctor) {
        this.name = name;
        this.temperature = temp;
        this.id = pId;
        Patient.doctor = doctor;
    }

    public String getName() {
        return this.name;
    }

    public getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + ": name:" + this.name + "; temperature" + this.temperature;
    }
}

/*
 * 8 patient küçük yazılmış
 * 23 getId den önce veri tipi belirlenmemiş
 * 16 this.doctor static olduğu için Patient.doctor olmalı
 * 5 veri tipi double olmalı
 * 30 toString Override değil
 * 12 Double olmalı
 * 3 staticten önce private olmalı
 * 
 * public class Patient {
 * private int id;
 * private static int counter;
 * private String name;
 * private double temperature = 36.5;
 * public static final String doctor = "Jone";
 * 
 * public Patient(String name, double temp,String doctor){
 * this(name,temp,++counter,doctor);
 * }
 * 
 * private Patient(String name, double temp,int pId, String doctor){
 * this.name=name;
 * this.temperature= temp;
 * this.id = pId;
 * }
 * 
 * public String getName(){
 * return this.name;
 * }
 * 
 * public int getId(){
 * return this.id;
 * }
 * 
 * public String toString(){
 * return Patient.counter + " " + this.id
 * +": name:"+this.name+"; temperature "+this.temperature;
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 */