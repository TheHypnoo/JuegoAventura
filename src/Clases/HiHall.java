package Clases;

import java.util.ArrayList;

public class HiHall {
    protected ArrayList<String> FrasesHiHall = new ArrayList<>();

    //Establece las frases del Clases.HiHall
    public void setFrasesHiHall(ArrayList<String> FrasesHiHall){
        this.FrasesHiHall = FrasesHiHall;
    }
    //Consigue las frases del Hihall
    public ArrayList<String> GetFrasesHiHall(){
        return FrasesHiHall;
    }

}
