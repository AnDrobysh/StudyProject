package Lesson_5.example.uncharted;

//Создадим метод, который создает персонажей и взаимодействует с ними:

public class Game {
    public static void main(String[] args) {
        Lesson_5.example.uncharted.Character[] characters = {
                new NathanDrake(),
                new Enemy("Mercenary"),
                new Enemy("Thug")
        };

        for (Lesson_5.example.uncharted.Character character : characters) {
            character.move();
            character.attack();
            character.takeDamage(10);
        }
    }
}

//Что демонстрирует этот пример?
//Абстракция: Класс Character определяет абстрактные методы attack и move, которые должны быть реализованы в дочерних классах. Это позволяет создавать универсальные интерфейсы для всех персонажей.
//Инкапсуляция: Поле name защищено (protected) и доступно только для классов-наследников. Это защищает внутреннее состояние объекта от несанкционированного изменения.
//Наследование: Классы NathanDrake и Enemy наследуют общие методы и свойства из класса Character, что позволяет избежать дублирования кода и улучшает его читаемость и поддержку.
//Полиморфизм: Мы можем использовать объекты разных классов через общий интерфейс. Методы attack, move и takeDamage могут быть вызваны для любого объекта типа Character, не требуя уточнения их конкретного типа.

