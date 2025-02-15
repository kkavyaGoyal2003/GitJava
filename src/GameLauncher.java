import java.util.*;
class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int target  = (int)(Math.random() * 10);
        System.out.println("I am thinking of a number from 0 and 9...");

        while(true) {
            System.out.println("Number to be guessed is:" + target);
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed: " + guessP1);

            guessP2 = p2.number;
            System.out.println("Player 2 guessed: " + guessP2);

            guessP3 = p3.number;
            System.out.println("Player 3 guessed: " + guessP3);

            if (guessP1 == target) {
                p1isRight = true;
            }
            if (guessP2 == target) {
                p2isRight = true;
            }
            if (guessP3 == target) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                if (p1isRight) {
                    System.out.println("P1 is our winner!!!");
                    break;
                }
                if (p2isRight) {
                    System.out.println("P2 is our winner!!!");
                    break;
                }
                if (p3isRight) {
                    System.out.println("P3 is our winner!!!");
                    break;
                } else {
                    System.out.println("Players have to try again");
                }
            }
        }
    }
}
class Player {
    int number;
    public void guess() {
        System.out.print("Enter your guess:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        this.number = num;
    }
}
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame start = new GuessGame();
        start.startGame();
    }
}
