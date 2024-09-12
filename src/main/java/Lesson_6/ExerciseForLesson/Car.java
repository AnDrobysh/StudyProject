package Lesson_6.ExerciseForLesson;

public class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("я еду");

    }

    public static void main(String[] args) {
        Vehicle x = new Vehicle();
        Car y = new Car();

        x.move();
        y.move();
    }
}
