package Lesson_6.ExerciseForLesson;

public class MathOperations {
    static int counter = 0;
    static void incrementCounter(){
        counter += 1;
    }
    static public int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        MathOperations y =  new MathOperations();
        MathOperations x =  new MathOperations();
        MathOperations z =  new MathOperations();
        MathOperations b =  new MathOperations();

        incrementCounter();
        incrementCounter();
        incrementCounter();

        System.out.println(getCounter());
        System.out.println(getCounter());

    }
}
