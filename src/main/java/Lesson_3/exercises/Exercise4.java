package Lesson_3.exercises;


// Напишите метод, который принимает массив целых чисел и возвращает индекс первого положительного числа. Если положительных чисел нет, возвращает -1.
public class Exercise4 {

    public static int method (int[] array){
        int y = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                y = i;
                break;
            } else y = -1;
        }
        return y;
    };

    public static void main(String[] args) {
        int[] numbers = {-2, -4, 6, -8, -10};
        System.out.println(method(numbers));
    }
}
