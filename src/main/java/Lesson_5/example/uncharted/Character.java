package Lesson_5.example.uncharted;


//Мы создадим абстрактный класс Character для всех персонажей игры, а затем создадим конкретные классы для героя (NathanDrake) и врагов (Enemy), чтобы продемонстрировать принципы ООП.
//
//Шаг 1: Создание абстрактного класса Character
//Класс Character будет определять общие методы, такие как attack() и move(), которые должны быть реализованы в дочерних классах.
abstract class Character {
    protected String name; // Инкапсуляция: имя персонажа

    public Character(String name) {
        this.name = name;
    }

    public abstract void attack(); // Абстрактный метод для атаки

    public abstract void move(); // Абстрактный метод для передвижения

    public void takeDamage(int damage) {
        System.out.println(name + " takes " + damage + " damage.");
    }
}
