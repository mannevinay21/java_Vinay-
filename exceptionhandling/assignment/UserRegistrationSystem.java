package Assignment4;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private int age;

    public User(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be positive.");
        } else if (age > 100) {
            throw new InvalidAgeException("Age cannot exceed 100.");
        }
        this.age = age;
        System.out.println("Age is valid.");
    }
}

public class UserRegistrationSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Age input is required.");
            }

            int age = Integer.parseInt(args[0]);
            User user = new User(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be numeric.");
        } catch (Exception e) {
            System.out.println("Issue: " + e.getMessage());
        }
    }
}