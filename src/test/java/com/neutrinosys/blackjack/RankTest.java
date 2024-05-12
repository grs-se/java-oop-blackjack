package com.neutrinosys.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void getValueOfKing() {
        // Rank KING = new Rank("KING"); // equivalent to Rank.KING
        // Rank QUEEN = new Rank("QUEEN");
        // Rank JACK = new Rank("JACK");
        assertEquals(10, Rank.KING.getValue());
    }
}

// Enum's were not built into Java in the beginning
// Constants actually end up being treated as strings that get stored inside of an internal property of an Enum instance that is called 'name'

