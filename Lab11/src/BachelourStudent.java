public class BachelourStudent extends Student implements ProjectScoreBahaviour{
    
    public BachelourStudent(int _id, float _mid, float _fin){
        super(_id,_mid,_fin);
    }
    
    
    float computeTotalScore(){
        return computeBaseScore() + projectScore();
    }

    @Override
    public float projectScore() {
        return 20f;
    }
}
