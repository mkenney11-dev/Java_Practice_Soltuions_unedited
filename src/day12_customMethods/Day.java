package day12_customMethods;

public class Day {

    public static void day(int number){
        if(number>7 || number < 1){
            System.err.println("Invalid number");
            return; // exits the method. remaining codes of the method won't be executed
        }

        String day = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
                :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)?"Saturday":"Sunday";

        System.out.println(day);

    }

}

/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */