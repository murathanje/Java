public class PhDStudent extends Student implements ArticleScoreBehaviour{
    int numberOfArticles;

    public PhDStudent(int _id, float _mid, int _conf, float _fin, int _numberOfArticles){
        super(_id,_mid,_fin);
        numberOfArticles = _numberOfArticles;
f
    }

    public float computeTotalScore(){
        return computeBaseScore() + articleScore();
    }

    @Override
    public float articleScore(){
        return numberOfArticles * 8;
    }
    
}
