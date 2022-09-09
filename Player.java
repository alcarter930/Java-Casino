import java.util.ArrayList;
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
}
