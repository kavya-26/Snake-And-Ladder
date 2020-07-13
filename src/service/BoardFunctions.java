package service;

import java.util.Random;

import static service.AsciiArt.printDice;


public class BoardFunctions {
    public static int rollDice() {
        System.out.println("rolling dice.....");
        // TODO: add pause
        pauseGame(1000);

        Random r = new Random();
        int value = r.nextInt(6)+1;
        printDice(value);
        return value;
    }


    public static int getPlayerPos(int x, int position) {

        int final_position = x + position;
        final_position = check(final_position);
        if (final_position <= 100) {
            return final_position;
        } else
            return position;
    }

    private static int check(int value) {
        //checking and ladder
        if (value == 1) {
            message('L');
            value = 38;
        } else if (value == 4) {
            message('L');
            value = 15;
        } else if (value == 8) {
            message('L');
            value = 10;
        } else if (value == 21) {
            message('L');
            value = 42;
        } else if (value == 28) {
            message('L');
            value = 76;
        } else if (value == 50) {
            message('L');
            value = 67;
        } else if (value == 71) {
            message('L');
            value = 92;
        } else if (value == 88) {
            message('L');
            value = 99;
        }

        //snake situation
        else if (value == 32) {
            message('S');
            value = 10;
        } else if (value == 36) {
            message('S');
            value = 6;
        } else if (value == 48) {
            message('S');
            value = 26;
        } else if (value == 88) {
            message('S');
            value = 24;
        }
        return value;
    }

    public static void pauseGame(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void message(char x){
        if(x=='L'){
            System.out.println("You have Landed on a ladder ");
            pauseGame(800);
            System.out.println("Going up.....");
            pauseGame(1000);
        }
        else if (x=='S'){
            System.out.println("You are caught by a Snake ");
            pauseGame(800);
            System.out.println("Going down.....");
            pauseGame(1000);
        }

    }
}
