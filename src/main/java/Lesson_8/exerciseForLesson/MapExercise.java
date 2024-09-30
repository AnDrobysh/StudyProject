package Lesson_8.exerciseForLesson;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Russia", "moscow");
        map.put("Belsrus", "minsk");
        map.put("Ukraine", "kiev");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Старана: " + entry.getKey() + ", Столица: " + entry.getValue());
    }
        if(map.containsKey("Россия")){
            System.out.println("Россия есть");
        } else {
            System.out.println("нету");
        }
}}
