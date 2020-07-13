package service;

import model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.AsciiArt.boardImage;
import static service.BoardFunctions.*;

public class GameRunner {
    public void start() {
        boolean gameRunning = true;

        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boardImage();
        pauseGame(1000);
        System.out.println(" ");
        System.out.println("Enter the no of players ~");

        int pNum = sc.nextInt();

        for (int i = 0; i < pNum; i++) {

            System.out.println("Enter player name ~");
            Player p = new Player(sc.next());
            players.add(p);
        }

        while (gameRunning) {
            for (Player player : players) {
                System.out.println("Starting turn of: " + " " + player.name.toUpperCase());
                pauseGame(1000);
                int x = rollDice();
                player.pos = getPlayerPos(x, player.pos);
                if (player.pos == 100) {
                    System.out.println("Player" + " " + player.name.toUpperCase() + " " + "wins");
                    gameRunning = false;
                    break;
                } else {
                    System.out.println("The position of " + player.name + " is " + player.pos);
                    pauseGame(2000);
                }

                // System.out.println("");
                // System.out.println("enter player name");

            }
        }
    }
}
