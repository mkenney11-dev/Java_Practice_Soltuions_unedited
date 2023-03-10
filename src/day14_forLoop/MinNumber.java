package day14_forLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647; // biggest possible int so all other numbers can be smaller. Better default than 0

        for(int i = 1; i < 6; i++){
            System.out.println("Please enter number " + i);
            int num = input.nextInt();

            if(num < min){
                min = num;
            }
        }

        input.close();
        System.out.println("Smallest number entered was " + min);

    }
}
