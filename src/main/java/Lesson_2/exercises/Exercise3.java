package Lesson_2.exercises;

/*Исправьте код так, чтобы он корректно находил факториал числа.*/

public class Exercise3 {
    public static void main(String[] args) {
        int number = 3;
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Факториал " + number + " равен " + factorial);
    }
}

