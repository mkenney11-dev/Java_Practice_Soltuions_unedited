package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class Group {
    /*

4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups
     */

    public static void main(String[] args) {

        Map<Integer, String[]> group = new HashMap<>();
        group.put(1, new String[]{"Anna", "Jane", "James"});
        group.put(2, new String[]{"Ada", "Lori", "George"});
        group.put(3, new String[]{"Cary", "Larry"});
        group.put(4, new String[]{"Mona", "Mary", "Jorge"});
        group.put(5, new String[]{"Kevin", "Fred"});

        //  4.2 Display the names of each student with group id of 1

        System.out.println("Group 1");
        for(String names : group.get(1)){
            System.out.println(names);
        }

        //   4.3 Display the names of each student from each groups
        System.out.println();
        for(int key : group.keySet()){
            System.out.println("Group " + key );
            for(String name : group.get(key)){
                System.out.println(name);
            }
        }

    }


}
