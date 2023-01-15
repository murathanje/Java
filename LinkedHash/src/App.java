import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    
            LinkedHashSet gunler = new LinkedHashSet();     //Aynı eleman birden fazla eklenemez
            gunler.add("Pazartesi");
            gunler.add("Salı");
            gunler.add("Çarşamba");
            gunler.add("Perşembe");
            gunler.add("Cuma");
            gunler.add(null);
            gunler.add("Cumartesi");
            gunler.add("Pazar");
            gunler.remove("Pazartesi");
            gunler.add("Pazartesi");

            gunler.forEach(item -> System.out.println(item));

    }
}
