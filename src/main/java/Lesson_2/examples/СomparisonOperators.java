package Lesson_2.examples;

public class СomparisonOperators {

    public static void main(String[] args) {
        // Определяем переменные
        int a = 10;
        int b = 20;

        // Оператор "равно"
        boolean isEqual = (a == b);
        System.out.println(a + " == " + b + " : " + isEqual);

        // Оператор "не равно"
        boolean isNotEqual = (a != b);
        System.out.println(a + " != " + b + " : " + isNotEqual);

        // Оператор "больше"
        boolean isGreater = (a > b);
        System.out.println(a + " > " + b + " : " + isGreater);

        // Оператор "меньше"
        boolean isLess = (a < b);
        System.out.println(a + " < " + b + " : " + isLess);

        // Оператор "больше или равно"
        boolean isGreaterOrEqual = (a >= b);
        System.out.println(a + " >= " + b + " : " + isGreaterOrEqual);

        // Оператор "меньше или равно"
        boolean isLessOrEqual = (a <= b);
        System.out.println(a + " <= " + b + " : " + isLessOrEqual);
    }
}