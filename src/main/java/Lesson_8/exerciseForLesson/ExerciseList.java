package Lesson_8.exerciseForLesson;

import java.util.ArrayList;
import java.util.List;

public class ExerciseList {
    public static List<Integer> addElement(List<Integer> list, int x){
        list.add(x);
        return list;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listSecond = new ArrayList<>();
        addElement(list, 1);
        addElement(list, 4);
        addElement(list, 12);
        addElement(list, 9);

        for (int x: list){
            if(x % 2 != 0){
                listSecond.add(x);
            }
        }


        System.out.println(listSecond);
    }
}
