import java.util.*;

public class App {
    public static void main(String[] args){

        HashSet h = new HashSet();      // Bir değerden birden fazla olamaz 12 bir tane olabilir    
        h.add("12 str");
        h.add(12);
        h.add(12.56);
        h.add(true);
        h.add(null);

        // h.remove(12);   // Belirlenen değeri listeden siler
        // h.clear();      //listeyi siler
        // h.contains(12); //true false döndürü listede var mı diye bakar
        // h.size();           //Liste eleman sayısını döndürür
        Iterator itr = h.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        h.forEach(item -> System.out.println(item + " "));

    }
}
