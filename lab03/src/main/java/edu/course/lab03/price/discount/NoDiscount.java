package edu.course.lab03.price.discount;

public class NoDiscount implements IDiscountPolicy {

    private int percent;

    @Override
    public double apply(double price) {
        return price;
    }
}
