package Exam;

public class Main {
    public static void main(String[] args) throws Exception {

            Customer customer = new Customer();
            customer.musteriEkle(10, "Murathan", 500);
            customer.kontrol();
            customer.paraYatir(100);
            customer.goster();
            int o =5;
            System.out.println("Merhaba"+ o);


    }

}
