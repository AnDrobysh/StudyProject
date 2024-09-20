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
            System.out.println("Введите 4-ёх значное число");
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
        int[] bulls = new int[4];
        int[][] cows = new int[4][2];

        for (int i = 0; i < 4; i++) {
            int howMuchCow = 0;

            if (userArray[i] == randomArray[i]) {
                bulls[i] = userArray[i];
            }

            for (int p = 0; p < 4; p++) {
                if (userArray[i] == randomArray[p]) {
                    howMuchCow++;
                }
            }

            cows[i][0] = userArray[i];
            cows[i][1] = howMuchCow;
        }

        for (int i = 0; i < 4; i++) {
            if (bulls[i] > 0) {
                System.out.println(bulls[i] + " это бык, который находится на месте " + (i + 1));
            }
        }

        for (int bull : bulls) {
            for (int[] cow : cows) {
                if (cow[0] == bull) {
                    cow[1] = cow[1] - 1;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cows[i][0] == cows[j][0] && i != j) {
                    cows[j][0] = 0;
                    cows[j][1] = 0;
                }
            }
        }

        for (int[] y : cows) {
            if (y[1] > 0) {
                System.out.println("Число " + y[0] + " является коровой");
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
        System.out.println("Вы начали играть в быки и коровы. Попробуйте угадать какое четырёхзначное число я загадал");
        System.out.println("Если цифра на верном месте - она бык, если просто есть в загаданном числе - корова");
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
        while (userString != "да" || userString != "нет") {
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
