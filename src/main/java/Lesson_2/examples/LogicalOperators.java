package Lesson_2.examples;

public class LogicalOperators {

    public static void main(String[] args) {
        // Определяем переменные
        boolean a = true;
        boolean b = false;

        // Логическое "И" (AND)
        boolean andResult = a && b;
        System.out.println("Логическое 'И': " + a + " && " + b + " = " + andResult);

        // Логическое "ИЛИ" (OR)
        boolean orResult = a || b;
        System.out.println("Логическое 'ИЛИ': " + a + " || " + b + " = " + orResult);

        // Логическое "НЕ" (NOT)
        boolean notA = !a;
        boolean notB = !b;
        System.out.println("Логическое 'НЕ': !"+ a + " = " + notA);
        System.out.println("Логическое 'НЕ': !"+ b + " = " + notB);

        // Пример комбинирования логических операторов
        boolean complexResult = (a && b) || (!a && !b);
        System.out.println("Комбинированное выражение: (" + a + " && " + b + ") || (!" + a + " && !" + b + ") = " + complexResult);
    }
}
