import java.util.Scanner;

public class Theater_kiosk {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        if(age >= 21) {
            System.out.println("You get a wrist band");
        }
        in.close();
    }
}
