package Lesson_3.ExercisesForLesson;

//Напишите метод, который принимает массив целых чисел и возвращает true, если в массиве есть хотя бы одно четное число, и false в противном случае.

public class Exercise2 {

    public static boolean parity(int[] arr){
        boolean result = false;
        for(int a : arr){
            System.out.println(a);
            if(a % 2 == 0){
                result = true;
                System.out.println("попали в условие");
                break;
            }

            System.out.println("в условие не попали с эти а " + a);
        }

        return result;
    }

    public static void main(String[] args) {

        int crr[] = {1, 2, 3, 4, 5};
        int brrrr[] = {2, 451, 135, 665, 2};
        int erttt[] = {1};


        System.out.println(parity(brrrr));
    }

}
