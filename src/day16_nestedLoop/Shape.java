package day16_nestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int j = 1; j < 11; j++) {

            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}

/*
1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */