public class Main {

    public static void main(String[] args) {

        try {
            Student student = new Student(100, 101);
            System.out.println(student.getAvarage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
