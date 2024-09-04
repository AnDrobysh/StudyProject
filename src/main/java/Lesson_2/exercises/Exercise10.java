package Lesson_2.exercises;

/*Исправьте код так, чтобы он корректно проверял, является ли одна строка лексикографически больше или меньше другой.*/
/*ПЕРЕД ТЕМ КАК ВЫПОЛНЯТЬ ЗАДАНИЕ УДАЛИТЕ *//* и *//* В НАЧАЛЕ И КОНЦЕ БЛОКА КОДА, с текста эти символы удалять НЕ НУЖНО*/

public class Exercise10 {
    public static void main(String[] args) {
        String str1 = "apple11";
        String str2 = "banana";
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " лексикографически bol'she " + str2);
        } else if (str1.length() < str2.length()) {
            System.out.println(str1 + " лексикографически men'she " + str2);
        } else {
            System.out.println(str1 + " равно " + str2);
        }
    }
}

