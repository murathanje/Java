import java.sql.Struct;

public class App {
    public static void main(String[] args) throws Exception {
        Student student  = new Student(101, 50);
        System.out.println(student.getNote());
    }
}
