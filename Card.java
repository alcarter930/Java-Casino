public class Card {
    //variabls
    protected String mySuit;
    protected int myValue;

    //constructor methods

    public Card(){
       int suit = (int)(Math.random()*(4-1+1)+1);
       myValue = (int)(Math.random()*(13-1+1)+1);
       switch (suit){
           case 1: mySuit = "Clubs";
           case 2: mySuit = "Diamonds";
           case 3: mySuit = "Hearts";
           case 4: mySuit = "Spades";
       }
    }

    public Card(String suit, int value){
        mySuit = suit;
        myValue = value;
    }
    public Card(int suit, int value){
        myValue = value;
        switch (suit){
            case 1: mySuit = "Clubs";
            case 2: mySuit = "Diamonds";
            case 3: mySuit = "Hearts";
            case 4: mySuit = "Spades";
        }
    }

    //accessors
    public int getValue(){
        return myValue;
    }
    public String getSuit(){
        return mySuit;
    }

    //mutators
    public void setValue(int value){
        myValue = value;
    }

    //used in conjunction with the toString method
    private String stringValue(){
        switch (myValue) {
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            case 1: return "Ace";
            default: return "" + myValue;
        }
    }

    public String toString(){
        return stringValue() + " of " + mySuit;
    }
}
