import java.util.Scanner;

public class Scan_It {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        String firstName = "";
        int age = 0;
        double salary = 0;
        String trash = "";

        // reading strings from the buffer works fine.

        System.out.print("Enter your first name: ");
        firstName = in.nextLine();  // Read the entire buffer.
        System.out.print("You said your name is: " + firstName);

        // Reading numbers can be tricky.
        System.out.print("\nEnter your age: ");
        if (in.hasNextInt()) // the in. shows me if what the user types is a valid int
        {
            age = in.nextInt();
            in.nextLine(); // Clear newline from the buffer.
            System.out.print("You said your age is: " + age);
        }
        else
        {
            trash = in.nextLine(); // Clear the invalid input from the buffer.
            System.out.print("You said your trash is: " + trash + " which is not a valid age.");
            System.out.println("\nExiting the program...run it again and enter a valid age.");
            System.exit(0); // Exit the program.
        }

        System.out.print("\nEnter your salary: ");
        if (in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // Clear newline from the buffer.
            System.out.print("You said your salary is: " + salary);
        }else
        {
            trash = in.nextLine(); // Clear the invalid input from the buffer.
            System.out.print("You said your salary is:" + trash + " which is not a valid salary.");
            System.out.println("\nExiting the program...run it again and enter a valid salary.");
            System.exit(0); // Exit the program.
        }
    }
}