package practice_14.zadanie2;

public class DiscountCalculator {
    private final double LOYAL_FIRST_DISCOUNT = 0.10;
    private final double LOYAL_DISCOUNT = 0.05;
    private final double COUPON_DISCOUNT = 0.07;
    private final double DISCOUNT = 0.02;

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (price <= 0) {
            return 0;
        }


        return price;
    }



}
