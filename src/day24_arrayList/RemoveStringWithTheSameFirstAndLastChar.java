package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringWithTheSameFirstAndLastChar {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"
        ));

        list.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(list);

    }

}
/*
7. Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */