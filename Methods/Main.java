
public class Main {

	public static void main(String[] args) {

		String mesaj = "   mermer bu    ";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(5));
		System.out.println("5. eleman: " + mesaj.concat(" iyi misin?"));
		System.out.println("5. eleman: " + mesaj.startsWith("M"));
		System.out.println("5. eleman: " + mesaj.endsWith("n"));
		
		char[] karakterler = new char[10];
		
		mesaj.getChars(0, 8, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("aba")); 
		System.out.println(mesaj.lastIndexOf("mer"));
		
		System.out.println(mesaj.replace("m","-"));
		
		System.out.println(mesaj.substring(5));
		System.out.println(mesaj.substring(5,7));
		
		for(String kelime : mesaj.split(" ")) {
			
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());


		
		





	}

}
