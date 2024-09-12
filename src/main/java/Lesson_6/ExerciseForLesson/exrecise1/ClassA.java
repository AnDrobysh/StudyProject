package Lesson_6.ExerciseForLesson.exrecise1;

public class ClassA {

    private int privateField = 1;
    private void privateMethod(){
        System.out.println(privateField);
    }

    int x = privateField;

    protected int protectedField = 2;
    protected void protectedMethod(){
        System.out.println(protectedField);
    };

    int defaultField = 3;
    void defaultMethod(){
        System.out.println(defaultField);
    };

    public int publicField = 4;
    public void publicMethod(){
        System.out.println(publicField);
    };
}
