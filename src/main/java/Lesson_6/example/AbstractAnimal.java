package Lesson_6.example;

// abstract класс - нельзя создать экземпляр, но можно наследовать
public abstract class AbstractAnimal {
    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    // abstract метод - должен быть реализован в подклассах
    public abstract void makeSound();

    // обычный метод
    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}

