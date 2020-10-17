import java.util.ArrayList;

public class HiHall {
    protected ArrayList<String> FrasesHiHall = new ArrayList<String>();

    public HiHall(ArrayList<String> FrasesHiHall) {
        this.FrasesHiHall = FrasesHiHall;

    }

    //Establece las frases del HiHall
    public void setFrasesHiHall(ArrayList<String> FrasesHiHall){
        this.FrasesHiHall = FrasesHiHall;
    }
    //Consigue las frases del Hihall
    public ArrayList<String> GetFrasesHiHall(){
        return FrasesHiHall;
    }

}
