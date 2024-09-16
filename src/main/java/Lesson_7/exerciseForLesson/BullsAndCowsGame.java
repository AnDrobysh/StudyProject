package Lesson_7.exerciseForLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BullsAndCowsGame extends Game {

    public int[] createRandomInt(){
        int[] randomInt = new int[4];
        for(int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * 10);
        }
        return randomInt;
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int userInt = 0;
        try {
            System.out.println("Введите число");
            userInt = scanner.nextInt();
        } catch (InputMismatchException e){
            userInt = 0;
        }
        return userInt;
    }

    public static int[] creatUserInt() {
        int i = 0;
        int userInt = 0;
        int[] userArry = new int[4];

        while (userInt == 0){
            userInt = getInt();
        }

        while (userInt > 0) {
            int digit = userInt % 10;
            System.out.println(digit);
            userInt /= 10;
            userArry[userArry.length - 1 - i] = digit;
            i++;}
        return userArry;
    }

    public static void main(String[] args) {
        int[] array = creatUserInt();
    }


    @Override
    void startGame() {

    }

    @Override
    void returnResult() {

    }
}
