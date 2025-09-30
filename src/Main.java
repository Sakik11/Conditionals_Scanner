//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // if (BOOLEAN Expression) { code body }

        int age = 18;
        int favNum = 11;

        if (age >= 21) {
            System.out.println("Hello and welcome!");
        }

        if (favNum >= 1 && favNum <= 10) {
            System.out.println("You have a favorite number between 1 and 10");
        } else {
            System.out.println("You have an odd favorite number");
        }

        String RPSMove = "R";
        String playA = "R";
        String playB = "P";

        if (RPSMove.equals("R") || RPSMove.equals("P") || RPSMove.equals("S")) // double bars are OR
        {
            System.out.println("Valid move");
        } else {
            System.out.println("Invalid move");
        }
        if (playA.equals("R")) {
            if (playB.equals("R")) {
                System.out.println("It's a tie!");
            } else if (playB.equals("P")) {
                System.out.println("Player B wins!");
            } else // playB is S
            {
                System.out.println("Player A wins!");
            }
        } else if (playA.equals("P")) {
            if (playB.equals("R")) {
                System.out.println("Player A wins!");
            } else if (playB.equals("P")) {
                System.out.println("It's a tie!");
            } else // playB is S
            {
                System.out.println("Player B wins!");
            }
        } else // playA is S
        {
            if (playA.equals("R")) {
                System.out.println("Player B wins!");
            } else if (playB.equals("P")) {
                System.out.println("Player A wins!");
            } else // playB is S
            {
                System.out.println("It's a tie!");
            }
        }
    }
}