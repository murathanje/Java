
public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 0, 1, 2, 3, 4, 5 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {

			if(aranacakSayi == sayilar[i]) {
				
				varMi = true;
				break;
			}
		}
		
		if(varMi == false) {
			System.out.println("Sayi listede yok");
		}else {
			System.out.println("Sayi listede var");
			
		}
	}

}
