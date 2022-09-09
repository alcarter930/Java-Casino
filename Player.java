import java.util.ArrayList;
/**
This class is to provide a framework for players of any poker game
Whether it be Human or Computer

@author Aaron Carter
@version Setpember 9, 2022

*/
public abstract class Player {
    protected ArrayList<Card> myHand;
    protected String myName;
    protected int myBank;
    public Player(String name){
        myHand = new ArrayList<Card>();
        myBank = 0;
        myName = name;
    }
    public Player(String name, int startingMoney){
        myBank = startingMoney;
        myName = name;
    }

    public String getName(){
        return myName;
    }

    //in case I need to get the value of a player for a bet or smthn
    public int getValue(){
        return myBank;
    }
    
    //in case I need to analyze a hand per player (mostly for computers)
    //using an array (hopefully of length 5) as a way to check for better hands
    /**
    ex:
    Texas Hold 'Em game has a river of:
    5 of Clubs, 6 of Clubs, 7 of Clubs, Jack of Clubs, 10 of Hearts
    if a player has a pocket of the Queen of Clubs and 5 of Hearts,
    A flush would be more valuable than a pair of 5s, so I want it to prioritize the flush
    */
    public double analyzeHand(Card[] hand){
        /* To be implemented */
    }
}
