package Lesson_2.examples;

public class ForEach {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};

        for(int number : numbers) {
            System.out.println("Число: " + number);
        }
    }
}