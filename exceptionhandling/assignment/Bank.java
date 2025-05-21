package Assignment4;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide an integer in string format: ");
        String input = sc.next();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Not a valid integer.");
        } finally {
            sc.close();
        }
    }
}