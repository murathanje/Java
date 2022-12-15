public class App {
    public static void main(String[] args){
        Student bachelourStudent = new PhDStudent(0,50,0,50,1);
        System.out.println(bachelourStudent.computeTotalScore());
    }
}
