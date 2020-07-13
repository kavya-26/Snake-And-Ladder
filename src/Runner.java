import service.GameRunner;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Runner {

    public static void main(String[] args) {
        GameRunner game = new GameRunner();
        game.start();
    }
}
