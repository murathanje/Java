public class Student {
    
    private int midTerm;
    private int finalTerm;

    public Student(int _midTerm, int _finalTerm){
        setMid(_midTerm);
        setFinal(_finalTerm);
    }


    private void setMid(int _midTerm){
        if(_midTerm > 100 || _midTerm < 0)
            throw new IllegalArgumentException("Midterm can not be less than 0 or greater than 100");
        this.midTerm = _midTerm;
    }
    
    private void setFinal(int _finalTerm){
        if(_finalTerm > 100 || _finalTerm < 0)
            throw new IllegalArgumentException("The Final can not be less than 0 or greater than 100");
        this.finalTerm = _finalTerm;
    }


    public String getNote(){
        return "Midterm : " + midTerm + " Final : " + finalTerm;
    }




}
