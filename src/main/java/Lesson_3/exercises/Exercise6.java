package Lesson_3.exercises;

// У вас есть двумерный массив целых чисел. Напишите метод, который сортирует подмассивы по сумме их элементов, от самого меньшего к самому большому.

public class Exercise6 {

    // Метод, который принимает двумерный массив и возвращает новый массив, отсортированный по сумме элементов в строках
    public static int[][] method(int[][] array) {
        int rows = array.length;

        // Создаем массив для хранения сумм элементов каждой строки
        int[] sumArray = new int[rows];

        // Вычисляем суммы элементов каждой строки и сохраняем их в sumArray
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int value : array[i]) {
                sum += value;
            }
            sumArray[i] = sum;
        }

        // Сортируем строки по сумме элементов с использованием сортировки пузырьком
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (sumArray[j] > sumArray[j + 1]) {
                    // Меняем местами суммы
                    int tempSum = sumArray[j];
                    sumArray[j] = sumArray[j + 1];
                    sumArray[j + 1] = tempSum;

                    // Меняем местами строки в массиве
                    int[] tempArray = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempArray;
                }
            }
        }

        // Возвращаем отсортированный массив
        return array;
    }

    public static void main(String[] args) {
        // Инициализация двумерного массива
        int[][] array = {
                {1, 2, 33, 4},
                {5, 6666, 7, 8},
                {1, 1, 1, 1}
        };

        // Выводим строки отсортированного массива на экран
        System.out.println("Двумерный массив:");
        for (int[] row : method(array)) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}



