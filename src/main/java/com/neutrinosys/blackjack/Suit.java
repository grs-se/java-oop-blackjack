package com.neutrinosys.blackjack;

public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
}

// NOTES ON ENUMS:
// a class with property of enum
// Enums can protect us from making mistakes
// typesafe - prevent from setting incorrect values
// constants - actual values of the enum
// typically capitalized because closely associated with constants
// Suit ordinal does not make sense to use