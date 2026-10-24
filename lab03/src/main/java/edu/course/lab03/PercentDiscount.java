package edu.course.lab03;

public class PercentDiscount implements IDiscountPolicy {

    private double percent;

    @Override
    public double apply(double price) {
        return price * percent;
    }
}
