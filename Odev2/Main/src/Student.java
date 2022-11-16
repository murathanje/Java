public class Student {
    private int midTerm;
    private int finalExam;

    public Student(int _midTerm, int _finalExam) throws Exception {
        setFinalExam(_finalExam);
        setMidTerm(_midTerm);
    }

    public void setMidTerm(int _midTerm) {
        if (_midTerm < 0 || _midTerm > 100)
            throw new IllegalArgumentException("Midterm can't be less than 0 or greater than 100");
        this.midTerm = _midTerm;
    }

    public void setFinalExam(int _finalExam) {
        if (_finalExam < 0 || _finalExam > 100)
            throw new IllegalArgumentException("Final Exam can't be less than 0 or greater than 100");
        this.finalExam = _finalExam;
    }

    public int getMidTerm() {
        return midTerm;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public double getAvarage() {
        return midTerm * 0.4 + finalExam * 0.6;
    }

}