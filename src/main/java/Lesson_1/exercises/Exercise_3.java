package Lesson_1.exercises;

/*Программа должна определить, является ли введенное число положительным, отрицательным или равным нулю. Однако код работает некорректно
 и всегда выводит одно и то же сообщение. Найдите и исправьте ошибки.Исправьте код, чтобы он правильно определял знак числа.
 Подсказка: Обратите внимание на структуру условий и блоков else.*/

public class Exercise_3 {
    public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println("The number is positive");
        }
        if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
