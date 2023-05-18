package day42_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentScore {
    public static void main(String[] args) {

        /*
        1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
         */

        Map<String, int[]> scores = new HashMap<>();
        scores.put("Anna", new int[]{80, 90, 100, 88, 78});
        scores.put("James", new int[]{100, 100, 80, 55, 89});
        scores.put("Eliza", new int[]{70, 80, 90, 99, 78});
        scores.put("Adam", new int[]{80, 89, 90, 78, 77});
        scores.put("Eda", new int[]{90, 92, 94, 87, 78});

        for(String key : scores.keySet()){
            System.out.println(key + " " + Arrays.toString(scores.get(key)));
        }

    }

}
