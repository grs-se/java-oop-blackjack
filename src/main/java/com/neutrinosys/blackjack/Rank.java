package com.neutrinosys.blackjack;

public enum Rank {
    ACE, // = 1 or 11
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN, // = 10
    JACK, // = 10
    QUEEN, // = 10
    KING // = 10
}

// NOTES:
// enum = special form of a class
// have special methods and properties inherent to them
// ordinal works nicely if the order of the constants is meaningful numerical order
// ordinal - returns an associated value
// Rank.ordinal