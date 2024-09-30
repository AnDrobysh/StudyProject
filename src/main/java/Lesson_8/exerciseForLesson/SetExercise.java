package Lesson_8.exerciseForLesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("Pety");
        list.add("Koly");
        list.add("Java");
        list.add("Java");

        for(String x:list){
            set.add(x);
        }

        if(set.contains("Java")){
            System.out.println(set);
        }
    }
}

