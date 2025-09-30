import java.util.Scanner;

public class Party_Affiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String partyChoice;

        System.out.println("Enter your party affiliation:");
        System.out.println("D for Democrat");
        System.out.println("R for Republican");
        System.out.println("I for Independent");
        partyChoice = scanner.nextLine();
        if (partyChoice.equals("D"))
        {
            System.out.println("You are a Democrat.");
        }
        else if (partyChoice.equals("R"))
        {
            System.out.println("You are a Republican.");
        }
        else if (partyChoice.equals("I"))
        {
            System.out.println("You are an Independent.");
        }
        else
        {
            System.out.println("You get Other");
        }
        scanner.close();
    }
}