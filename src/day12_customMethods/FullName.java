package day12_customMethods;

public class FullName {

    public static void capitalization(String firstName, String lastName){

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1);

        lastName = (""+lastName.charAt(0)).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " + lastName);
    }

}

/*
2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */