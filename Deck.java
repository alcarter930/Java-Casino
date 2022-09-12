
import java.util.ArrayList;
import java.util.Collections;

/**
    Deck Class
    This implements the Card class contained elsewhere in the repository.
    To be used as a Deck of Cards for the purpose of Poker (and likely other card games)
    within the Java Casino
    
    @author Aaron Carter
    @version September 9, 2022

*/
public class Deck {
    protected ArrayList<Card> myDeck;

     //constructor. systematically creates the deck
    public Deck(){
        myDeck = new ArrayList<Card>();
        for(int i = 0; i<4;i++){
            for(int j = 0; j < 13; j++){
                myDeck.add(new Card(i+1,j+1));
            }
        }
        shuffle();
    }
    
    //accessor
    public ArrayList<Card> getDeck(){
        return myDeck;
    }
    
    //shuffles the deck using the built in shuffle command
    public void shuffle(){
        Collections.shuffle(myDeck);
    }
    
    /**gives the ability to combine new decks.
        made with the thought of blackjack having like 4 decks in mind
        
        @param d the deck to combine with
    
    */
    public void combine(Deck d){
        for(Card c: d.getDeck()){
            myDeck.add(c);
        }
        shuffle();
    }
    
    //insert to add a card randomly to the deck
    //idk when this is needed but you never know...
    public void insert(Card c){
        myDeck.add(c);
        shuffle();
    }
    //maybe I might want to insert in a certain position?
    //I'm thinking exploding kittends type beat
    public boolean insert(Card c, int position){
        try{
            myDeck.insert(c, position);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;   
        }
    }    
    
    //draws a card and removes it from the deck. returns said card
    public Card draw(){
        Card drawCard = myDeck.get(0);
        myDeck.remove(0);
        return drawCard;
    }

    public String toString(){
        String s = "";
        for(Card c: myDeck){
            s+= c + ", ";
        }
        return s;
    }
}
