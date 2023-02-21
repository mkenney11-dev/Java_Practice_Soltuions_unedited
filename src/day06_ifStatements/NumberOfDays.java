package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;

        boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;

        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;

        if(has31Days){
            System.out.println("31 days");
        }
       if(has30Days){
           System.out.println("30 days");
       }
       if(!has30Days && !has31Days){ // can also write this as: if(number == 2)
           System.out.println("28 days");
       }

    }
}
