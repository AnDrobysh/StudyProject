package Lesson_4.ExerciseForLesson;

/*

        Циклы

Числа Фибоначчи: Напишите алгоритм, который выводит первые N чисел последовательности Фибоначчи. Число N вводится пользователем.

Определение простого числа: Напишите алгоритм, который проверяет, является ли число N простым (простое число делится только на 1 и на само себя). Число N вводится пользователем.

Обратный порядок цифр: Напишите алгоритм, который выводит цифры введенного числа в обратном порядке. Число вводится пользователем.

        Массивы, циклы и логические выражения

Максимум в массиве: Напишите алгоритм, который находит максимальное число в массиве целых чисел, введенных пользователем.

Подсчет четных и нечетных чисел в массиве: Напишите алгоритм, который подсчитывает количество четных и нечетных чисел в массиве, введенном пользователем.

Сортировка массива пузырьком: Реализуйте алгоритм сортировки массива пузырьком. Массив чисел вводится пользователем.

Поиск вхождения числа в массиве: Напишите алгоритм, который проверяет, содержится ли число X в массиве чисел. Если число содержится, алгоритм должен вывести "Найдено", в противном случае — "Не найдено". Массив и число X вводятся пользователем.

Магический квадрат: Напишите алгоритм, который проверяет, является ли заданная матрица магическим квадратом. Магический квадрат — это квадратная матрица, в которой суммы чисел в каждой строке, каждом столбце и на обеих диагоналях равны. Матрица вводится пользователем.
*/


import java.util.Scanner;

public class Exercise {

    public static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n -2);
    }

    //Проверка четности: Напишите алгоритм, который проверяет, является ли введенное число четным. Если число четное, вывести "Четное", иначе — "Нечетное".
    public static void main(String[] args) {


/*        if (number % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }

        if (number > 10 && number < 50) {
            System.out.println("входит");
        } else {
            System.out.println("не входит");
        }

        int secondNumber;
        System.out.println("введеите слеуюдющее число:");
        secondNumber = scanner.nextInt();


        if (secondNumber * secondNumber == number) {
            System.out.println("является квадратом");
        } else {
            System.out.println("не является квадратом");
        }

        if (number % secondNumber == 0) {
            System.out.println("делится");
        } else {
            System.out.println("не делится");
        }

        int year;
        System.out.println("введеите год:");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }*/

        //0 1 1 2 3 5 8 13 21


        int index;
        int first = 1;
        int second = 1;
        int sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("введеите номер числа из последовательности:");
        index = scanner.nextInt();

/*        switch (index) {
            case 1:
                System.out.println(0);
            case 2:
                System.out.println(1);
            case 3:
                System.out.println(1);
            default:
                for(int i = 4; i <= index; i++){
                    sum = first + second;
                    first = second;
                    second = sum;
                }
                System.out.println(second);*/
        System.out.println(fibonacci(index));
        }
    }
