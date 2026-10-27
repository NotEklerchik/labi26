package edu.course.lab03;

import edu.course.lab03.price.PriceCalculator;
import edu.course.lab03.price.discount.IDiscountPolicy;
import edu.course.lab03.price.discount.NoDiscount;
import edu.course.lab03.price.discount.PercentDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {
    @Test
    void returnsSamePriceNoDiscount() {
        PriceCalculator pc = new PriceCalculator(new NoDiscount());

        assertEquals(20.0, pc.calculate(20.0));
    }

    @Test
    void returnsPriceAfterDiscount() {
        PriceCalculator pc = new PriceCalculator(new PercentDiscount(50));

        assertEquals(50.0, pc.calculate(100.0));

        pc.setDiscountPolicy(new PercentDiscount(80));

        assertEquals(20.0, pc.calculate(100.0));
        assertNotEquals(80.0, pc.calculate(100.0));
    }

    @Test
    void returnsChangeSuccessful() {
        PriceCalculator pc = new PriceCalculator(new PercentDiscount(10));
        IDiscountPolicy tv1 = pc.getDiscountPolicy();

        pc.setDiscountPolicy(new PercentDiscount(100));
        IDiscountPolicy tv2 = pc.getDiscountPolicy();

        assertNotSame(tv1, tv2);
    }

    @Test
    void returnsChangeUnsuccessful() {
        IDiscountPolicy tv = new PercentDiscount(100);

        PriceCalculator pc = new PriceCalculator(tv);
        IDiscountPolicy tv1 = pc.getDiscountPolicy();

        pc.setDiscountPolicy(tv);
        IDiscountPolicy tv2 = pc.getDiscountPolicy();

        assertSame(tv1, tv2);
    }
}