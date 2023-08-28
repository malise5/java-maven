package com.systechafrica.looping;

import java.util.logging.Logger;

public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop() {
        // initialize condition update
        for (int counter = 0; counter <= 10; counter = counter + 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter += 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter++) {
            LOGGER.info("Count = " + counter);
        }
    }

    public void whileLoop() {
        int studentCount = 0;
        while (studentCount < 10) {
            LOGGER.info("Student Count = " + studentCount);
            studentCount++; // studentCount = studentCount + 1
        }

    }

    public void doWhileLoop() {

        int myNumber = 0;
        int counter = 0;
        do {
            LOGGER.info("my number is: " + myNumber);
            myNumber++; // myNumber = myNumber + 1
            counter++;
        } while (myNumber < 10);
        LOGGER.info("Counter = " + counter);

    }
    // ?jump statement

    public void breakJumpStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            LOGGER.info("my index is = " + i);
        }
    }

    public void continueJumpStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            LOGGER.info("my index is = " + i);
        }
    }

    public int search(int numberToSearch) {
        for (int index = 1; index <= 50; index++) {
            if (index == numberToSearch) {
                return index;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        // app.forLoop();
        app.whileLoop();
        app.doWhileLoop();
        app.breakJumpStatement();
        app.continueJumpStatement();

    }
}