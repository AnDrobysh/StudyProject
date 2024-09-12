package Lesson_6.example;

public class StaticExample {
    // static переменная - общая для всех экземпляров класса
    public static int staticCounter = 0;

    // static метод - принадлежит классу, а не экземпляру
    public static void incrementCounter() {
        staticCounter++;
        System.out.println("Static Counter: " + staticCounter);
    }

    // static блок - выполняется один раз при загрузке класса
    static {
        System.out.println("Static block executed.");
    }
}

