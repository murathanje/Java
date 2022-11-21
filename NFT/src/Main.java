public class Main {
    public static void main(String[] args) throws IllegalArgumentException{

        try{

            EncapsulatedNFT murathan = new EncapsulatedNFT(500, "Murathan");
            EncapsulatedNFT ahmet = new EncapsulatedNFT(1001, "Ahmet");
            System.out.println(murathan.toString());
            System.out.println(ahmet.toString());

        }catch(IllegalArgumentException e){

            System.out.println(e.getMessage());
            
        }
        
    }
}
