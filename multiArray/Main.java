package multiArray;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "Izmir";
		sehirler[1][0] = "Bursa";
		sehirler[1][1] = "Kocaeli";
		sehirler[1][2] = "Diyarbakir";
		sehirler[2][0] = "Erzurum";
		sehirler[2][1] = "Antalya";
		sehirler[2][2] = "Trabzon";
		
		
		for(int i=0; i<3; i++){
			
			for(int j=0; j<3; j++){
				
				System.out.println(sehirler[i][j]);
				
			}
			System.out.println("-----------------------");
			
			
			
		}
		
	}

}
