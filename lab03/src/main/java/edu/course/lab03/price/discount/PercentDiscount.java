package edu.course.lab03.price.discount;

public class PercentDiscount implements IDiscountPolicy {

    private final double percent;

    public PercentDiscount(double percent) {

        if  (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }

        this.percent = percent;
    }

    @Override
    public double apply(double price) {
        return price - price * (percent / 100);
    }
}
