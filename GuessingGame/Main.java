package GuessingGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bot guess = new Bot();
        Player p = new Player();

        // Load the lives from a file
        int lives = loadLives();
        p.setLives(lives);

        Scanner uScanner = new Scanner(System.in);

        while (p.isAlive()) {

            if (p.getLives() == 0 || p.getLives() < 0) {
                resetGame();
            }

            System.out.println("Type you number to see if the Bot can guess it!");
            int userG = uScanner.nextInt();

            int ai1 = guess.getVar1();
            int ai2 = guess.getVar2();
            int ai3 = guess.getVar3();

            // end program when reached 0 lives
            if (ai1 == userG || ai2 == userG || ai3 == userG) {
                p.setLives(p.getLives() + 2);
                saveLives(p.getLives());
                System.out.println("You guess is correct! +2 Life! Get to 5! Curr: " + p.getLives());
            } else if (p.isAlive() == true) {
                p.setLives(p.getLives() - 1);
                System.out.println("You gussed wrong loser! " + "Life left: " + p.getLives());

                // Save the updated lives to a file
                saveLives(p.getLives());
            }

            if (p.getLives() >= 5) {
                System.out.println("YOU'VE WON!");
                System.exit(0);
            }
        }

    }

    private static int loadLives() {
        try {
            File file = new File("lives.txt");
            Scanner scanner = new Scanner(file);
            int lives = scanner.nextInt();
            scanner.close();
            return lives;
        } catch (FileNotFoundException e) {
            // Return default value if file doesn't exist or fails to load
            return 3;
        }
    }

    private static void saveLives(int lives) {
        try {
            File file = new File("lives.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(lives));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void resetGame() {
        Player p = new Player();
        p.setLives(3);
        saveLives(p.getLives());
        System.out.println("0 Lives!!! Game resetted. Lives reset to 3.");
    }

}