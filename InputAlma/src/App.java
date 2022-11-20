import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir yazi giriniz");

        String x = scanner.nextLine();

        System.out.println(x.toUpperCase().split(" ")[0]);
    }
}
