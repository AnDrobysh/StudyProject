package Lesson_5.example;

public class Car extends Vehicle{
    // Поля (свойства)
    String model;  // Название модели
    int year;      // Год выпуска
    double price;  // Цена

    // Методы (действия) Синтаксис: [модификатор доступа] [возвращаемый тип] [имя метода]([параметры]) { // тело метода }
    public void startEngine() {
        System.out.println(model + " engine started.");
    }

    public void stopEngine() {
        System.out.println(model + " engine stopped.");
    }

    // Конструктор
    // Конструкторы — это специальные методы, которые вызываются при создании нового объекта класса.
    // Они используются для инициализации объекта.
    //Синтаксис: [модификатор доступа] [имя класса]([параметры]) { // тело конструктора }
    //Конструкторы не имеют возвращаемого типа и всегда называются так же, как и класс.
    public Car(String model, int year, double price) {
        this.model = model; // `this` используется для ссылки на текущий объект
        this.year = year;
        this.price = price;
    }

    // Car наследует метод start() из класса Vehicle
    public void honk() {
        System.out.println("Car is honking.");
    }
}

