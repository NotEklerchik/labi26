package edu.course.lab03.price;

import edu.course.lab03.price.discount.IDiscountPolicy;

public class PriceCalculator {
    private IDiscountPolicy discountPolicy;

    public PriceCalculator(IDiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    // SETTERS

    public void setDiscountPolicy(IDiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculate(double price) {
        return discountPolicy.apply(price);
    }

    public IDiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    // GETTERS

    // nope
}
