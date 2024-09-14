package Lesson_3.exercises;

//Напишите метод, который принимает массив целых чисел и возвращает количество отрицательных чисел в массиве.

public class Exercise5 {
    public static int method(int[] array){
        int y = 0;
        for(int x: array){
            if(x < 0){
                y++;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, -4, 6, -8, -10};
        System.out.println(method(numbers));
    }
}
