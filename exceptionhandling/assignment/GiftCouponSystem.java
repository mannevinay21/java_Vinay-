package Assignment4;

public class GiftCouponSystem {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Coupon code is missing.");
            }

            String couponCode = args[0];
            String validCoupon = "COUPON123";

            if (couponCode.equals(validCoupon)) {
                System.out.println("Coupon code successfully applied");
            } else {
                throw new Exception("Coupon code is invalid");
            }

        } catch (Exception e) {
            System.out.println("Unable to apply coupon: " + e.getMessage());
        } finally {
            System.out.println("We appreciate your shopping with us!");
        }
    }
}