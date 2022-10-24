
public class Main {

	public static void main(String[] args) {
		double[] myList = {1.3, 3.5, 3.6, 7.7};
		double total = 0;
		double max = 0;
		
		
		for(double number:myList) {
			
			System.out.println(number);
			
		}
		
		for(double number:myList) {
			
			total += number;
			
		}
		System.out.println("Toplam :" + total);
		
		
		
		for(double number:myList) {
			
			if(number > max) {
				max = number;
			}
		}
		
		System.out.println("En buyuk sayi: " + max);
	}

}
