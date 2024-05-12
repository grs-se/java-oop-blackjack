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
    KING; // = 10

    // Rank KING = new Rank("KING"); // equivalent to Rank.KING (Rank = class, KING = instance of that class)
    // Rank QUEEN = new Rank("QUEEN");
    // Rank JACK = new Rank("JACK");
    // assertEquals(10, Rank.KING.getValue());
    public int getValue() {
        return switch (this) {
            // Java infers type from this.rank
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
//            default -> this.rank.ordinal() + 1;
        };
    }
}

// NOTES:
// enum = special form of a class
// because they are special classes they do share some of the same capabilities as a class, chief among them is that we can put methods on them
// we want to keep our methods as close to the data it is part of
// bad idea to violate certain principles of Object Orientation such as Encapsulation, where you want to hide your data within the classes where that data pertains the most, and not let that data leak out until it's actually needed, and even then you only want to allow outside access to just the narrowest amount of data necessary
// which is why you see so much Java code where the classes and properties are defaulted to being private, so that way we say if you need access to this then use the getters and setters so we have the opportunity to police who's accessing the data and what that data comes out looking like.
// have special methods and properties inherent to them
// each instance of the enum inherits the ordinal method
// ordinal works nicely if the order of the constants is meaningful numerical order
// ordinal - returns an associated value
// ordinal sets by "magic"
// Rank.ordinal#
// each of the constants is an actual instance of a rank
// 'this' = refers to the current instance of the object that the word 'this' is inside of, so with KING.getValue() the 'this' refers to that KING instance
