package Lesson_3.exercises;

/*Код должен находить и выводить максимальное значение в массиве numbers, но он содержит ошибки. Найдите и исправьте их.*/

public class Exercise2  {
    public static void main(String[] args) {
        int[] numbers = {110, 5, 12, 18, 111113};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Максимальное значение в массиве: " + max);
    }
}

