package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {

        //Given following map that contains employee name and employee salary:

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //2.1 who has the maximum and minimum salary?

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String maxName = null;
        String minName = null;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                maxName = key;
            }

            if (value < min) {
                min = value;
                minName = key;
            }
        }

        System.out.println("Max: " + maxName + " - " + max);
        System.out.println("Min: " + minName + " - " + min);

        //2.2 how many employees has the salary between 120k ~ 150K?
        System.out.println();

        int count = 0;
        for (int value : map.values()) {
            if (value >= 120_000 && value <= 150_000) {
                count++;
            }
        }

        System.out.println("Between 120K & 150K " + count);

        //2.3 display the names of the employees who are making less than 118k?
        System.out.println();

        for (String key : map.keySet()) {
            if (map.get(key) <= 118_000) {
                System.out.println(key);
            }
        }

        // 2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
        System.out.println();
        for (String key : map.keySet()) {
            if (map.get(key) <= 120_000) {
                map.put(key, map.get(key) + 10_000);
            }
        }

        System.out.println(map);

    }
}
