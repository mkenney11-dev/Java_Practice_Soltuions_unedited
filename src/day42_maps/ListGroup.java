package day42_maps;

import java.util.*;

public class ListGroup {
    public static void main(String[] args) {
        /*
        3. Given the following lists that conatin the names of the students from each group:
		List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group24 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"  ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        3.1 Create map that has integer as keys and List of Strings as values.
        	add the group number and students name of that group as a pair to the map

    	3.2 Write a program that can display student names of the each group in 5 separate lines

         */

        Map<Integer, List<String>> groups = new HashMap<>();
        groups.put(1, new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis")));
        groups.put(2, new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat")));
        groups.put(3, new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem")));
        groups.put(4, new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene")));

        for(int group : groups.keySet()){
            System.out.print("Group " + group);
            for(String name : groups.get(group)){
                System.out.print(" " + name);
            }
            System.out.println();
        }

    }
}
