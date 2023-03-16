package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int countPos = 0;
        int countNeg = 0;

        for (int i = 0; i < 5; i++) {

            int num = input.nextInt();

            if (num > 0) {
                countPos++;
            } else if (num < 0) {
                countNeg++;
            }

        }

        System.out.println(countPos + " positive and " + countNeg + " negative");

        input.close();

    }

}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3
				Output:
					3 positive and 1 negative
 */