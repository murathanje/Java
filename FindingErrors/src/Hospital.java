public class Hospital {
    static void main(String[] args) {
        Patient patient1= new Patient("Ahmed", 37.2f, "Jak");
        System.out.println(patient1);
        Patient patient2= new Patient("Omer", 37.2f, "Jone");
        System.out.println(patient2.getName());
        patient2.namez=patient1.name; 
        Patient patient2= new Patient("Ali", 37.2f, "Jan");
        System.out.println(patient2);
        System.out.println("number of patients:"Patient.counter);
    }
}

/*
    7   name private olduğu için çağrılamaz 2 hata
    8   patient2 birden fazla kullanılmış
    10  Patient.couunter yanlış kullanım
    2   public yok
    
public class Hospital {
    public static void main(String[] args) {
        Patient patient1= new Patient("Ahmed", 37.26, "Jak");
        System.out.println(patient1.toString());
        Patient patient2= new Patient("Omer", 37.25, "Jone");
        System.out.println(patient2.toString());
        Patient patient3= new Patient("Ali", 37.24, "Jan");
        System.out.println(patient3.toString());
    }
}
*/
