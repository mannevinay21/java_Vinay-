package Assignment4;
import java.util.Scanner;

public class StudentScoreRecorderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input the student's name: ");
            String name = scanner.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Name cannot be empty.");
            }

            System.out.print("Input the student's score: ");
            String scoreInput = scanner.nextLine();

            int score = Integer.parseInt(scoreInput);

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be within 0 to 100.");
            }

            System.out.println("Score recorded successfully.");

        } catch (NullPointerException e) {
            System.out.println("Issue: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Issue: Score must be a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Issue: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}