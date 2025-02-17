package com.neutrinosys.blackjack;

// what are the core properties of a playing card?
// soemtimes when modelling a concept Google it and learn some of the properties and attributes of the concept
public class Card {
    private Suit suit;
    private Rank rank;

    // constructor initialises newly created object
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        // translate from a string to an enum
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());

    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        // this is what the constructor is for:
        // wouldn't make sense to create a card without a suit and a rank and so it doesn't make sense to be able to create a card with a "no arg default constructor"
        // benefits of Enums = strongly typed properties that are even more strongly constrained to prevent us from using values that are not allowed or not appropriate
        // great when we have a finate set of values that we want to be constrained to and they're unlikely to change very frequently or ever
        Card card1 = new Card(Suit.CLUBS, Rank.JACK);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
        // provide option
        Card card3 = new Card("hearts", "queen");

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        // int total = card1.plus(card2);
        // Hand myHand = new Hand();
        // myHand.add(card1);
        // myHand.add(card2);
        // int total = myHand.getTotal();
    }

    @Override
    public String toString() {
        // JACK {Club symbol}
        return this.rank.toString().concat(" ").concat(this.suit.toString());
    }

    public int getValue() {
        // delegating the getValue() call to the lower getValue() call
        return this.rank.getValue();
    }
}

// NOTES:
// in OOP you want your methods or behaviour in OOP terminology to live as closely as possible to the data that they work with
// the data that
