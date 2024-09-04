package Lesson_3.examples;

public class ArrayExamples {

    public static void main(String[] args) {
        // Пример 1: Создание и инициализация массива
        int[] numbers = {5, 3, 8, 2, 7}; // Массив целых чисел

        // Пример 2: Печать элементов массива
        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Переход на новую строку

        // Пример 3: Найти минимальное и максимальное значения в массиве
        int min = numbers[0]; // Инициализация минимального значения первым элементом
        int max = numbers[0]; // Инициализация максимального значения первым элементом
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Обновляем минимальное значение
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Обновляем максимальное значение
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        // Пример 4: Сортировка массива по возрастанию
        java.util.Arrays.sort(numbers); // Используем встроенный метод сортировки
        System.out.println("Отсортированный массив:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Пример 5: Поиск элемента в массиве
        int target = 8; // Элемент, который ищем
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println("Элемент " + target + (found ? " найден" : " не найден") + " в массиве.");

        // Пример 6: Реверс массива
        System.out.println("Реверс массива:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Пример 7: Вычисление суммы всех элементов массива
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);

        // Пример 8: Вычисление среднего значения элементов массива
        double average = (double) sum / numbers.length;
        System.out.println("Среднее значение элементов массива: " + average);
    }
}
