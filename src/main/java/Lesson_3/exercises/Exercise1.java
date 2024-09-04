package Lesson_3.exercises;
/*
Код должен суммировать все элементы масвсиа numbers и вывести результат, но он содержит ошибки. Найдите и исправьте их.*/

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 3, 8};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { // Ошибка в условии цикла
            sum += numbers[i]; // Может произойти выход за пределы массива
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}
