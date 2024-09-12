package Lesson_6.example;

// Наследуемый класс, который должен реализовать абстрактные методы
public class Dog extends AbstractAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
