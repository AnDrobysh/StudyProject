package Lesson_5.ExerciseForLesson;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Мяу " + name);
    }

    public int sum(int x, int y){
        return x + y;
    }
}
