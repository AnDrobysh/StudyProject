package Lesson_5.ExerciseForLesson;

/*Создайте базовый класс Animal с методом makeSound() и свойством name.
Затем создайте два подкласса, Dog и Cat, которые наследуют от Animal
и реализуют свои собственные версии метода makeSound().*/

public abstract class Animal {
    String name;
    int age;

    public Animal(){
    }

    public void makeSound(){
        System.out.println("ААА БЛЯТЬ");
    };

}


