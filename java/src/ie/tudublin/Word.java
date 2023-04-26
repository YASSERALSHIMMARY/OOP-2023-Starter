package ie.tudublin;

import java.util.ArrayList;

public class Word  {

    ArrayList<Follow> follows = new ArrayList<Follow>();
    private String word;
    
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public Word(ArrayList<Follow> follows, String word) {
        this.follows = follows;
        this.word = word;
    }
    @Override
    public String toString() {
        return "Word [follows=" + follows + ", word=" + word + "]";
    }

    
    
    


    
}
