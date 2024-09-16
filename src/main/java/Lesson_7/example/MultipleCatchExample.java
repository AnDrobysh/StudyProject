package Lesson_7.example;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Ошибка выхода за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива!");
        } catch (Exception e) {
            System.out.println("Другое исключение: " + e.getMessage());
        } finally {
            System.out.println("Этот блок выполнится всегда.");
        }
    }
}
