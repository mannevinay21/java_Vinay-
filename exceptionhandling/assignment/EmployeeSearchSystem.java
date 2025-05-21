package Assignment4;
class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }
}

public class EmployeeSearchSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Provide an Employee ID as input:");
                return;
            }
            int empID = Integer.parseInt(args[0]);
            validateEmployeeID(empID);
            System.out.println("Employee ID is valid");
        } catch (InvalidEmployeeIDException e) {
            System.out.println("Re-enter a valid Employee ID");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input must be a valid numeric Employee ID.");
        }
    }

    public static void validateEmployeeID(int id) throws InvalidEmployeeIDException {
        if (id < 0 || id > 999) {
            throw new InvalidEmployeeIDException("Invalid Employee ID");
        }
    }
}