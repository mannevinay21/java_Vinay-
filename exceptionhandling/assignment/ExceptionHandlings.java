package Assignment4;

public class ExceptionHandlings {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        try {
            int index = Integer.parseInt(args[0]);
            System.out.println("Provided index: " + index);
            System.out.println("Element at index " + index + " is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
            System.out.println("Input argument: " + (args.length > 0 ? args[0] : "none"));
            System.out.println("Specified index is invalid or out of bounds");
        }
    }
}