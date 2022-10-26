
public class Mukemmel {

	public static void main(String[] args) {
		// 6 ->> 1,2,3
		// 28 ->> 1,2,4,7,14

		int sayi = 28;
		int top = 0;

		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {

				top += i;
			}
		}

		if (top == sayi) {

			System.out.println("Sayi mukemmel sayidir");

		} else {
			System.out.println("Sayi mukemmel sayi degildir.");
		}

	}

}
