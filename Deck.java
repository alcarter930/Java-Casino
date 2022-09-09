import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    protected ArrayList<Card> myDeck;

    public Deck(){
        myDeck = new ArrayList<Card>();
        for(int i = 0; i<4;i++){
            for(int j = 0; j < 13; j++){
                myDeck.add(new Card(i+1,j+1));
            }
        }
        shuffle();
    }

    public ArrayList<Card> getDeck(){
        return myDeck;
    }
    public void shuffle(){
        Collections.shuffle(myDeck);
    }
    public void combine(@NotNull Deck d){
        for(Card c: d.getDeck()){
            myDeck.add(c);
        }
    }

    public String toString(){
        String s = "";
        for(Card c: myDeck){
            s+= c + ", ";
        }
        return s;
    }
}
