package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String reserve;
        String options = "\t\tKing -> $120\n\t\tQueen -> $100\n\t\tSingle -> $80";

        do {
            System.out.println("Welcome, would you like to reserve a room. Please respond with yes or no");
            reserve = input.nextLine();

        } while (!reserve.equalsIgnoreCase("yes") && !reserve.equalsIgnoreCase("no"));

        if (reserve.equalsIgnoreCase("yes")) {

            String room;

            do {
                System.out.println("Sure, which bed size would you like to select. Pick from these:\n" + options);
                room = input.nextLine();

            } while (!room.equalsIgnoreCase("king") && !room.equalsIgnoreCase("queen") && !room.equalsIgnoreCase("single"));

            if (room.equalsIgnoreCase("king")) {
                System.out.println("Great we have given a room with a King bed, that will be $120 a night");
            } else if (room.equalsIgnoreCase("queen")) {
                System.out.println("A queen bed! Great choice, your total will be $100");
            } else {
                System.out.println("Our single beds are the best around. It will cost you only $80");
            }

        } else {
            System.out.println("Have a nice day");
        }

        input.close();

    }

}

/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */