package Lesson_2.exercises;

/*Исправьте код, чтобы он корректно находил квадрат числа.*/
/*ПЕРЕД ТЕМ КАК ВЫПОЛНЯТЬ ЗАДАНИЕ УДАЛИТЕ *//* и *//* В НАЧАЛЕ И КОНЦЕ БЛОКА КОДА, с текста эти символы удалять НЕ НУЖНО*/

public class Exercise7 {
    public static void main(String[] args) {
        double doubleValue = 5.75;
       double intValue = doubleValue;
        double square = Math.pow(intValue, 2); //Math.pow - функция которая возводит в степень
        System.out.println("Квадрат числа: " + square);
    }
}

