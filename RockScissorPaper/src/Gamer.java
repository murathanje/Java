import java.util.Scanner;

public class Gamer {
    static int numofDraw;
    static int numofTrails;
    int numoofWin;
    String name;
    HandSign sign;

    Gamer(String _name) {
        name = _name;
    }

    void move() {
        boolean isInputValid = false;
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + this.name + " please enter p: paper, s: scissor, r: rock, q: quit");

        do {
            char inChar = input.next().toLowerCase().charAt(0);
            switch (inChar) {

                case 'q':
                    Arena.isGameOver = true;
                    break;
                case 'p':
                    sign = HandSign.PAPER;
                    break;
                case 's':
                    sign = HandSign.SCISSOR;
                    break;
                case 'r':
                    sign = HandSign.ROCK;
                    break;
                default:
                    System.out.println("Your input is invalid. Please try again");
                    isInputValid = true;
                    break;

            }
        } while(isInputValid);

    }

}
