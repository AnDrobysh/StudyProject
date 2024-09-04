package Lesson_3.examples;

public class ArrayMethodsExample {

    // Метод для печати всех элементов массива
    public void printArray(int[] arr) {
        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для вычисления суммы всех элементов массива
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Метод для поиска максимального элемента в массиве
    public int findMax(int[] arr) {
        int max = arr[0]; // Предполагаем, что первый элемент максимальный
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для создания массива с заданным размером и заполнения его случайными числами
    public int[] createRandomArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = (int) (Math.random() * 100); // Генерация случайных чисел от 0 до 99
        }
        return newArray;
    }

    // Метод main для тестирования всех методов
    public static void main(String[] args) {
        ArrayMethodsExample example = new ArrayMethodsExample();

        // Создание массива с 10 случайными числами
        int[] myArray = example.createRandomArray(10);

        // Печать массива
        example.printArray(myArray);

        // Вычисление и печать суммы всех элементов массива
        int sum = example.sumArray(myArray);
        System.out.println("Сумма элементов массива: " + sum);

        // Поиск и печать максимального элемента в массиве
        int max = example.findMax(myArray);
        System.out.println("Максимальный элемент в массиве: " + max);
    }
}
