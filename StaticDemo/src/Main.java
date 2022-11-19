public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();
        Student.b++;
        s1.showData();
    }
}
