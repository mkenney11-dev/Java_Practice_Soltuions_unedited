package day14_forLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // we use the smallest number possible for int type so all other numbers can be bigger. It is a better default than 0. We will talk about this idea more later

        for(int i = 1; i < 6; i++){
            System.out.println("Please enter number " + i);
            int num = input.nextInt();

            if(num > max){
                max = num;
            }
        }

        input.close();
        System.out.println("Biggest number entered was " + max);

    }
}
