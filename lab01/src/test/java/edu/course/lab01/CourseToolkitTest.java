package edu.course.lab01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    * Тесты для isPrime();
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

    /*
     * Тесты для isPalindrome()
     * */
    @Test
    void returnsFalseForEvenLengthNonPalindrome() {
        boolean result = true;

        result &= !CourseToolkit.isPalindrome("Anna"); //false
        result &= !CourseToolkit.isPalindrome("testtesttesttest"); //false
        result &= !CourseToolkit.isPalindrome("21"); //false
        result &= !CourseToolkit.isPalindrome("-,./"); //false

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddLengthNonPalindrome() {
        boolean result = true;

        result &= !CourseToolkit.isPalindrome("TESTT"); //false
        result &= !CourseToolkit.isPalindrome("aaaabaaa"); //false
        result &= !CourseToolkit.isPalindrome("215"); //false
        result &= !CourseToolkit.isPalindrome("-,."); //false

        assertTrue(result);
    }

    @Test
    void returnsTrueForEvenLengthPalindrome() {
        boolean result = true;

        result &= CourseToolkit.isPalindrome("teet"); //true
        result &= CourseToolkit.isPalindrome(" testtset "); //true
        result &= CourseToolkit.isPalindrome("2112"); //true
        result &= CourseToolkit.isPalindrome("-,..,-"); //true

        assertTrue(result);
    }

    @Test
    void returnsTrueForOddLengthPalindrome() {
        boolean result = true;

        result &= CourseToolkit.isPalindrome("tetet"); //true
        result &= CourseToolkit.isPalindrome(" aba "); //true
        result &= CourseToolkit.isPalindrome("2112112"); //true
        result &= CourseToolkit.isPalindrome("/-,.,-/"); //true

        assertTrue(result);
    }

    //Универсальный тест проверяющий странные строки, такие как строки из 1 символа, длинные строки, строки с несоответ
    @Test
    void testForWeirdWords() {
        boolean result = true;

        result &= CourseToolkit.isPalindrome("t");
        result &= CourseToolkit.isPalindrome(" ");
        result &= CourseToolkit.isPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        assertTrue(result);
    }

    @Test
    void throwExceptionOnEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> {
            boolean result = CourseToolkit.isPalindrome("");
        });
    }

    @Test
    void throwExceptionOnNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            boolean result = CourseToolkit.isPalindrome(null);
        });
    }


}
