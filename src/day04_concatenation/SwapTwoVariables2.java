package day04_concatenation;

public class SwapTwoVariables2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}

/*
Create a class named SwapTwoVariable21 and declare the following variables:
            a
            b

     Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              a = 10
              b = 15

        output:
                  a = 15
                  b = 20

 */