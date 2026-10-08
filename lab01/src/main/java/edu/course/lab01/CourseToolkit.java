package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) throw new IllegalArgumentException();

        for (int i = 0, j = text.length() - 1; i <= (text.length() - 1) / 2; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static double average(int[] values) {

        if (values != null && values.length != 0) {
            int sum = 0;

            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }

            return (double) sum / values.length;

        } else {
            throw new IllegalArgumentException();

        }
    }
}
