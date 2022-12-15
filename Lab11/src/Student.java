public abstract class Student {

    protected int id;
    private float mid;
    private float fin;

    public Student (int _id, float _mid, float _fin){
        id = _id;
        mid = _mid;
        fin = _fin;
    }

    float computeTotalScore(){
        return computeBaseScore();
    }

    float computeBaseScore(){
        return mid * 0.4f + fin * 0.6f;
    }

}
