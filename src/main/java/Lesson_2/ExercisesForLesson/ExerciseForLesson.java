package Lesson_2.ExercisesForLesson;

/*Задача: Автомобили, движущиеся навстречу
Описание задачи:
Два автомобиля A и B движутся навстречу друг другу по прямой дороге.

Автомобиль A стартует из точки X_A со скоростью V_A (в км/ч).
Автомобиль B стартует из точки X_B со скоростью V_B (в км/ч).
Расстояние между точками X_A и X_B равно D км.
        Требуется определить, через сколько часов автомобили встретятся, а также проверить, находится ли точка их встречи ближе к началу автомобиля A или B.
        Условия:

Программа должна принимать ввод от пользователя (расстояние D, скорости V_A и V_B).
Используйте if/else для проверки, имеют ли автомобили допустимые скорости (больше нуля).
Используйте switch case для определения, какая из двух машин ближе к точке встречи в момент начала движения.
Примените все виды циклов для различных операций, таких как вычисление времени встречи и симуляция движения.
Примените приведение типов, чтобы округлить результаты и преобразовать значения типов.
        Используйте математические, логические операторы и операторы сравнения для всех необходимых расчетов.*/

import java.util.Scanner;

public class ExerciseForLesson {

    public static double distance(double time, double speed){
        return time * speed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance;
        double speedA;
        double speedB;

        // 1. Проверка допустимости скоростей

        do {
            // Ввод расстояния и скоростей
            System.out.println("Введите расстояние между автомобилями (км):");
            distance = scanner.nextDouble();

            System.out.println("Введите скорость автомобиля A (км/ч):");
            speedA = scanner.nextDouble();

            System.out.println("Введите скорость автомобиля B (км/ч):");
            speedB = scanner.nextDouble();

            if (speedA > 0 && speedB > 0) {
                System.out.println("Скорости корректны");
            } else {
                System.out.println("Переменные не корректны введите из заново");
            }}
        while (speedA < 0 || speedB < 0 || distance < 0);

        // 2. Расчет времени до встречи

        double time = distance / (speedA + speedB);
        System.out.println("Машины встретятся через " + time + " часов");

        // 3. Вычисление расстояния, которое каждый автомобиль проедет до встречи

        double distanceA = distance(time, speedA);
        double distanceB = distance(time, speedB);
        System.out.println("растояние для первого " + distanceA + " растояние для второго " + distanceB);



    }
}




            // 3. Вычисление расстояния, которое каждый автомобиль проедет до встречи

            // 4. Определение, какой автомобиль ближе к точке встречи

            // 5. Определение ближайшего автомобиля с использованием switch case

            // 6. Симуляция движения с использованием циклов

            // Цикл for для симуляции движения по часу

            // Цикл while для отслеживания времени до встречи

            // Цикл do-while для подтверждения завершения программы


