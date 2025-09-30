import java.util.Scanner;

public class Birth_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthMonth;

        System.out.print("Enter your birth month (1-12): ");
        birthMonth = scanner.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close();

    }
}