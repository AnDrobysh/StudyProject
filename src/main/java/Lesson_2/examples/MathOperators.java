package Lesson_2.examples;

public class MathOperators {

    public static void main(String[] args) {
        // Определяем переменные
        int a = 10;
        int b = 3;

        // Сложение
        int sum = a + b;
        System.out.println("Сложение: " + a + " + " + b + " = " + sum);

        // Вычитание
        int diff = a - b;
        System.out.println("Вычитание: " + a + " - " + b + " = " + diff);

        // Умножение
        int product = a * b;
        System.out.println("Умножение: " + a + " * " + b + " = " + product);

        // Деление
        int quotient = a / b;
        System.out.println("Деление: " + a + " / " + b + " = " + quotient);

        // Остаток от деления
        int remainder = a % b;
        System.out.println("Остаток от деления: " + a + " % " + b + " = " + remainder);

        // Увеличение на 1
        a++;
        System.out.println("Увеличение a на 1: " + a);

        // Уменьшение на 1
        b--;
        System.out.println("Уменьшение b на 1: " + b);
    }
}
