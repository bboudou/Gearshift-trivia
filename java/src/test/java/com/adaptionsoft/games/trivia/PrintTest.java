package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.Print;

import java.util.ArrayList;
import java.util.List;

public class PrintTest implements Print {

    String TerminalOutput = "";
    public void print(Object outpout){
        String toConcat = "\n" + outpout;
        TerminalOutput += toConcat;
    }
}
