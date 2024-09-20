package Lesson_7.exerciseForLesson;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class NotFourDigitNumberException extends Exception {
    public NotFourDigitNumberException(String message) {
        super(message);
    }
}

public class BullsAndCowsGame extends Game {
    static int iteration = 0;

    static int[] randomArray = new int[4];
    static int[] userArray = new int[4];

    public static void checkFourDigitNumber(int num) throws NotFourDigitNumberException {
        if (num < 1000 || num > 9999) {
            throw new NotFourDigitNumberException("Введённое число должно быть четырёхзначным.");
        }
    }

    public static int returnRandomInt() {
        int randomInt;
        randomInt = (int) (Math.random() * 10);
        if (randomInt == 0) {
            randomInt = returnRandomInt();
        }
        return randomInt;
    }

    public static int[] createRandomInt() {
        int[] randomInt = new int[4];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = returnRandomInt();
        }
        return randomInt;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int userInt = 0;
        try {
            System.out.println("Введите число");
            userInt = scanner.nextInt();
            checkFourDigitNumber(userInt);
        } catch (NotFourDigitNumberException e) {
            userInt = 0;
        } catch (InputMismatchException e) {
            userInt = 0;
        }
        return userInt;
    }

    public static int[] creatUserInt() {
        int i = 0;
        int userInt = 0;
        int[] userArry = new int[4];

        while (userInt == 0) {
            userInt = getInt();
        }

        while (userInt > 0) {
            int digit = userInt % 10;
            userInt /= 10;
            userArry[userArry.length - 1 - i] = digit;
            i++;
        }
        return userArry;
    }

    public static void bullsAndCows() {
        userArray = creatUserInt();
        int[] showArray = new int[4];
        for (int i = 0; i < 4; i++) {
            int cow = 0;
            int bull = 0;
            if (userArray[i] == randomArray[i]) {
                bull++;
            }

            for (int p = 0; p < 4; p++) {
                if (userArray[i] == randomArray[p]) {
                    cow++;
                }
            }
            boolean notShow = true;
            for (int x : showArray)
                if (userArray[i] == x) {
                    notShow = false;
                }

            if (cow > bull && notShow) {
                System.out.println("Число " + userArray[i] + " является коровой ");
                showArray[i] = userArray[i];
            }

            if(bull > 0) {
                System.out.println("Это бык, цифра " + userArray[i] + " расположено на месте " + (i + 1));
                showArray[i] = userArray[i];
            }
        }
    }


    public static void main(String[] args) {
        BullsAndCowsGame bullsAndCowsGame = new BullsAndCowsGame();
        bullsAndCowsGame.startGame();
    }


    @Override
    void startGame() {
        iteration = 0;
        System.out.println("Вы начали играть в быки и коровы");
        randomArray = createRandomInt();
        System.out.println();
        while (iteration <= 10) {
            if (Arrays.equals(randomArray, userArray)) {
                break;
            } else
                bullsAndCows();
            iteration++;
        }
        returnResult();
        startAgain();

    }

    @Override
    void returnResult() {
        if (iteration < 10) {
            System.out.println("Вы угадали!!! Вам понадобилось всего " + iteration + " попыток");
        } else {
            System.out.print("Вы не угадали число было ");
            for (int x : randomArray) {
                System.out.print(x);
            }
            System.out.println();
        }

    }

    public void startAgain() {
        Scanner scanner = new Scanner(System.in);
        String userString;
        System.out.println("Хотите попробовать снова?(Введите \"да\" или \"нет\")");
        userString = scanner.next();
        while (userString != "да" && userString != "нет"){
            System.out.println(userString);
            if (userString.equals("да")) {
                userArray = null;
                this.startGame();
            } else if (userString.equals("нет")) {
                System.out.println("Не хочешь, не надо");
                break;
            } else {
                System.out.println("Введите \"да\" или \"нет\")");
                userString = scanner.next();
            }
        }
    }
}
