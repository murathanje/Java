public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    protected int numberofConf;


    public MasterStudent(int _id, float _mid, float _fin, int _numberOfConf){
        super(_id,_mid,_fin);
        numberofConf = _numberOfConf;
    }

    float computeTotalScore(){
        return conferenceScore() + computeBaseScore();
    }

    @Override
    public float conferenceScore(){
        return numberofConf * 5;
    }
}
