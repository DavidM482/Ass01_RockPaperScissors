import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playAgain = "";
        String playerA;
        String playerB;
        String rock = "r";
        String paper = "p";
        String scissors = "s";
        boolean valid = false;

        do {
            do {
                System.out.println("Player A please enter your move (R, P, S): ");
                playerA = scan.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n");
                }
            } while (!valid);
            valid = false;

            do {
                System.out.println("player B please enter your move (R, P, S)");
                playerB = scan.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n");
                }
            } while (!valid);
            valid = false;

            if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("It's a tie");
            } else if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("Paper covers Rock, Player B wins!");
            } else if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("Rock breaks Scissors, Player A wins!");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("Paper covers Rock, Player A wins!");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("It's a tie");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("Scissors cuts Paper, Player B wins!");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("Rock breaks Scissors, Player B wins!");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("Scissors cuts Paper, Player A wins!");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("It's a tie");
            }

            System.out.println("Do you want to play again Y or N");
            playAgain = scan.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}