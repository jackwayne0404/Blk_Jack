package com.company;

public class Card {
    private Suit suit;          // every card is going to have a suit e
    private Value value;        // and a value


    // constructor for the card object
    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }


    // returns  value in the suit in string fromat
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }

    public Value getValue(){ //  to check value in the deck class
        return this.value;
    }
}
