package day12_customMethods;

public class MonthName {

    public static void monthName(int number){

        if(number > 12 || number < 1){
            System.err.println("Invalid number");
            return; // exits the method. remaining codes of the method won't be executed
        }

        String month = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar"
                :(number==4)? "April" :(number==5)? "May" :(number==6)?"Jun" :(number==7)? "Jul"
                :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct" :(number==11)?"Nov" : "Dec";

        System.out.println(month);

    }

}
/*
Create a method named monthName that can display the name of the month based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */