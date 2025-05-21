package Assignment4;
import java.util.*;

public class QuizArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input value for 'a': ");
            int a = sc.nextInt();

            System.out.println("Input value for 'b': ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Outcome of a/b: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Please provide valid integers.");
        } finally {
            sc.close();
        }
    }
}