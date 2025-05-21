package Assignment4;

class BulkStockException extends Exception {
    public BulkStockException(String productName) {
        super("Cannot order " + productName + " in quantities exceeding 10 units.");
    }
}

class ShoppingCart {
    public void addToCart(String productName, int quantity) throws BulkStockException {
        if (quantity > 10) {
            throw new BulkStockException(productName);
        } else {
            System.out.println(quantity + " units of " + productName + " successfully added to cart.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Product name and quantity are required.");
            }

            String productName = args[0];
            int quantity = Integer.parseInt(args[1]);

            ShoppingCart cart = new ShoppingCart();
            cart.addToCart(productName, quantity);

        } catch (BulkStockException e) {
            System.out.println("Issue: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Issue: Quantity must be a valid number.");
        } catch (Exception e) {
            System.out.println("Issue: " + e.getMessage());
        }
    }
}