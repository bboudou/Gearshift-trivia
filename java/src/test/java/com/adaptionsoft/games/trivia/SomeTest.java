package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class SomeTest {
    printTest printTest;
    GameRunner game = new GameRunner(12);

    @Test
    public void checkTerminalSame() throws Exception {
        game.main(12);
        String resultWanted = "Chet was added\n" +
                "They are player number 1\n" +
                "Pat was added\n" +
                "They are player number 2\n" +
                "Sue was added\n" +
                "They are player number 3\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 0\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 1 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 1\n" +
                "Question was incorrectly answered\n" +
                "Pat was sent to the penalty box\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 0\n" +
                "Question was incorrectly answered\n" +
                "Sue was sent to the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 1\n" +
                "Chet's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 0\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 2 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat is not getting out of the penalty box\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 1\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 3 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat is getting out of the penalty box\n" +
                "Pat's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 1\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 1 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 1\n" +
                "Chet's new location is 6\n" +
                "The category is Sports\n" +
                "Sports Question 2\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 4 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat is getting out of the penalty box\n" +
                "Pat's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 0\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 2 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 1\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 5 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat is getting out of the penalty box\n" +
                "Pat's new location is 7\n" +
                "The category is Rock\n" +
                "Rock Question 2\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 3 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 3\n" +
                "Sue is getting out of the penalty box\n" +
                "Sue's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 1 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 3\n" +
                "Answer was corrent!!!!\n" +
                "Chet now has 6 Gold Coins.";

        String terminalResult = printTest(output);
        Assertions.assertEquals(terminalResult, resultWanted);

    }
}
