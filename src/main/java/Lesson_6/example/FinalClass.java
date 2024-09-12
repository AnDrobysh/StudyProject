package Lesson_6.example;

// final класс - его нельзя наследовать
public final class FinalClass {
    // final переменная - значение не может быть изменено после инициализации
    private final int finalValue = 100;

    // final метод - не может быть переопределен в подклассе
    public final void displayFinalValue() {
        System.out.println("Final Value: " + finalValue);
    }
}

// класс, который нельзя унаследовать, так как FinalClass объявлен как final
// public class ExtendedClass extends FinalClass {} // Ошибка компиляции
