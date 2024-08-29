package Lesson_2.examples;

public class PrimitiveTypeCastingExample {

    public static void main(String[] args) {
        // Неявное приведение (Widening Conversion)
        int intVal = 100;
        double doubleVal = intVal; // int к double
        System.out.println("Неявное приведение int к double: " + doubleVal);

        // Явное приведение (Narrowing Conversion)
        double doubleValue = 99.99;
        int intValue = (int) doubleValue; // double к int (потеря точности)
        System.out.println("Явное приведение double к int: " + intValue);

        // Приведение типов при арифметических операциях
        byte byteVal = 50;
        short shortVal = 200;
        int result = byteVal + shortVal; // неявное приведение к int
        System.out.println("Неявное приведение byte и short к int: " + result);

        // Явное приведение типов с потерей данных
        long longVal = 300L;
        byte smallByte = (byte) longVal; // приведение long к byte (потеря данных)
        System.out.println("Явное приведение long к byte с потерей данных: " + smallByte);

        // Приведение символов (char) к числовым типам
        char charVal = 'A'; // символ 'A' имеет числовое значение 65 в Unicode
        int charToInt = charVal; // неявное приведение char к int
        System.out.println("Неявное приведение char к int: " + charToInt);

        // Явное приведение числового значения к символу
        int intForChar = 66; // Unicode значение для 'B'
        char intToChar = (char) intForChar; // явное приведение int к char
        System.out.println("Явное приведение int к char: " + intToChar);

        // Приведение строки к числовым типам
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber); // String к int
        System.out.println("Приведение строки к числу (String к int): " + parsedInt);

        // Приведение числовых типов к строке
        String strFromNumber = Integer.toString(intVal); // int к String
        System.out.println("Приведение числа к строке (int к String): " + strFromNumber);

        // Приведение логического типа
        boolean boolVal = true;
        String boolToString = Boolean.toString(boolVal); // boolean к String
        System.out.println("Приведение boolean к строке: " + boolToString);

        // Приведение строки к логическому типу
        String strBool = "true";
        boolean parsedBool = Boolean.parseBoolean(strBool); // String к boolean
        System.out.println("Приведение строки к boolean: " + parsedBool);
    }
}
