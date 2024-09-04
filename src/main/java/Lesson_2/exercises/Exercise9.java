package Lesson_2.exercises;

/*Исправьте код так, чтобы он корректно проверял, является ли число четным, положительным и делится на 3.*/
/*ПЕРЕД ТЕМ КАК ВЫПОЛНЯТЬ ЗАДАНИЕ УДАЛИТЕ *//* и *//* В НАЧАЛЕ И КОНЦЕ БЛОКА КОДА, с текста эти символы удалять НЕ НУЖНО*/

public class Exercise9 {
    public static void main(String[] args) {
        int number = 6;
        if (number % 2 == 0 && number > 0 && number % 3 == 0) {
            System.out.println("Число соответствует условиям");
        } else {
            System.out.println("Число не соответствует условиям");
        }
    }
}

