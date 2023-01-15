import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        TreeSet tree = new TreeSet();       // Verileri sıralar ve null kabul etmez
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(5);

        tree.forEach(item -> System.out.println(item));


    }
}
