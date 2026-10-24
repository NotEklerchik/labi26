package edu.course.lab03;

public class NoDiscount implements IDiscountPolicy {

    private int percent;

    @Override
    public double apply(double price) {
        return price * (percent);
    }
}
