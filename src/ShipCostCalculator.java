
import java.sql.SQLOutput;
import java.util.Scanner;

public class  ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        final double SHIP_RATE = 0.02; // 2% of the item price
        double shipCost = 0.0;
        double totalCost = 0.0;
        String trash = "";

        System.out.print("Enter the item price");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the newline character from the input buffer

            if (itemPrice >= 100)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = itemPrice * SHIP_RATE; // Minimum shipping cost
                totalCost = itemPrice + shipCost;
            }
            System.out.printf("Item price: $%.2f\n", itemPrice);
            System.out.printf("Shipping cost: $%.2f\n", shipCost);
            System.out.printf("Total cost: $%.2f\n", totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid item price: " + trash);
            System.out.println("Exiting... Run the program again and enter a valid item price.");
            System.exit(0);
        }
        in.close();
    }
}
