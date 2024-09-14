package Lesson_3.exercises;

/*Код должен развернуть массив numbers в обратном порядке, но он содержит ошибки. Найдите и исправьте их.*/

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i]; // Ошибка в индексе
        }

        System.out.println("Массив в обратном порядке:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
