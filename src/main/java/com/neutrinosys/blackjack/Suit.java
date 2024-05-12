package com.neutrinosys.blackjack;

public enum Suit {
    CLUBS('\u2663'),
//    CLUBS('♣'),
    DIAMONDS('\u2666'),
//    DIAMONDS('♦'),
    HEARTS('\u2665'),
//    HEARTS('♥'),
    SPADES('\u2660');
//    SPADES('♠');

    private char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }
}

// NOTES ON ENUMS:
// a class with property of enum
// Enums can protect us from making mistakes
// typesafe - prevent from setting incorrect values
// constants - actual values of the enum
// typically capitalized because closely associated with constants
// Suit ordinal does not make sense to use