package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    /*
    * Тесты для isEven()
    * */
    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    /*
    * Тесты для isPrime
    * */
    @Test
    void returnsFalseForNonPrimeNumbers() {
        boolean result = !CourseToolkit.isPrime(1);
        result &= !CourseToolkit.isPrime(4);
        result &= !CourseToolkit.isPrime(-1);
        result &= !CourseToolkit.isPrime(0);
        result &= !CourseToolkit.isPrime(25);

        assertTrue(result);
    }

    @Test
    void returnsTrueForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(2);
        result &= CourseToolkit.isPrime(5);
        result &= CourseToolkit.isPrime(23);
        result &= CourseToolkit.isPrime(7);

        assertTrue(result);
    }
}
