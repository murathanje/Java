public class App {
    public static void main(String[] args){
        CompanyName companyName = CompanyName.GOOGLE;
        CompanyName companyName1 = CompanyName.MICROSOFT;

        System.err.println(companyName.getDescription());
        System.err.println(companyName1.getDescription());
    }
}
