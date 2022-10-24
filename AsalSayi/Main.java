
public class Main {

	public static void main(String[] args){
		
		int number = 101;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		for(int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				
				isPrime = false;
				
			}
		}
		
		if(isPrime) {
			
			if(number == 1 || number < 2) {
				
				System.out.println("Sayi asal degildir");
				
			}else {
				
				System.out.println("Sayi asaldir.");

			}
			
		}else {
			
			System.out.println("Sayi asal degildir");
			
		}

	}

}
