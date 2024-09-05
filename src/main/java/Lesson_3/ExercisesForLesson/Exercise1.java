package Lesson_3.ExercisesForLesson;

//Напишите метод, который принимает двумерный массив целых чисел и выводит его в виде таблицы в консоль

public class Exercise1 {

    int[][] array = {
            {123, 4, 56},
            {78, 9, 1234},
            {56, 789, 1}};

    public static void printTable(int[][] a) {
        for (int arr[] : a) {

            for(int b : arr){
              System.out.print(b + " ");
            }

            System.out.println(" ");

        }
    }


    public static void main(String[] args) {
        int[][] array = {
                {123, 4, 56},
                {78, 9, 1234},
                {56, 789, 1}};

        int[][] sobaka = {
                {123, 2, 56},
                {78, 9, 1212512534},
                {56, 111111, 1}};

        printTable(array);
        //System.out.println("Двумерный массив в виде таблицы:");
        //printTable(array);


    }

}
