package Lesson_2.exercises;

/*Напишите программу для анализа текста:

Программа должна использовать for-each для подсчета количества букв, цифр и других символов в строке.
Применяйте if/else для определения типа символа (буква, цифра или другой символ).
Используйте switch case для определения, какой именно тип буквы (гласная или согласная).
Используйте математические операторы для подсчета статистики по символам.
Приведение типов понадобится для работы с char и int.
Используйте while для ввода данных и do-while для подтверждения анализа повторно.(про сканер непонятно, надо объяснить)*/

/*ПЕРЕД ТЕМ КАК ВЫПОЛНЯТЬ ЗАДАНИЕ УДАЛИТЕ *//* и *//* В НАЧАЛЕ И КОНЦЕ БЛОКА КОДА, с текста эти символы удалять НЕ НУЖНО*/

public class Exercise11 {
    public static void main(String[] args) {
        int letters = 0;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int others = 0;

        String string = "Мне хотелось бы 12 летнюю дочку, ведь моей жене уже 13 ";
        for(char ch: string.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
                switch (Character.toLowerCase(ch)) {
                    case 'а':
                    case 'е':
                    case 'ё':
                    case 'и':
                    case 'о':
                    case 'у':
                    case 'ы':
                    case 'э':
                    case 'ю':
                    case 'я':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        System.out.println("Букв: " + letters);
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
        System.out.println("Цифр: " + digits);
        System.out.println("Других символов: " + others);
    }
}
