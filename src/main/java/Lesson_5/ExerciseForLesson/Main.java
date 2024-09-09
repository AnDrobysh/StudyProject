package Lesson_5.ExerciseForLesson;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat();
        Dog bobik = new Dog();

        murka.name = "Robert Polson";

        murka.makeSound();
        bobik.makeSound();

        System.out.println(murka.name);

        System.out.println(murka.sum(7,8));
    }
}
