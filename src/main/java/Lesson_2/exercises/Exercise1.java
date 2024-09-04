package Lesson_2.exercises;

/*Задание: Исправьте код, чтобы он корректно проверял, входит ли заданное число в один из трех диапазонов: [0-10], [11-20] или [21-30].*/
/*ПЕРЕД ТЕМ КАК ВЫПОЛНЯТЬ ЗАДАНИЕ УДАЛИТЕ *//* и *//* В НАЧАЛЕ И КОНЦЕ БЛОКА КОДА, с текста эти символы удалять НЕ НУЖНО*/


public class Exercise1 {
    public static void main(String[] args) {
        int number = 31;
        if (number >= 0 && number <= 10) {
            System.out.println("Число в диапазоне [0-10]");
    } else if (number >= 11 && number <= 20) {
        System.out.println("Число в диапазоне [11-20]");
    } else if (number >= 21 && number <= 30) {
        System.out.println("Число в диапазоне [21-30]");
    } else {
        System.out.println("Число вне всех диапазонов");
    }
}
}

