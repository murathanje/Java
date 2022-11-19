public class Student {
    private static int mid;
    private int finalExam;
    private int id;


    public Student(int _finalExam, int _id){
        this(_finalExam, ++mid, _id);
    }
    private Student(int _finalExam, int _mid, int _id){
        this.finalExam = _finalExam;
        Student.mid = _mid;
        this.id = _id;
    }

    public Student(int _mid){
        Student.mid++;
    }


    public String toString(){
        return id + " " + mid + " " + finalExam;
    }
}
