package day13_customMethods;

public class IsOddAndIsEven {

    public static void main(String[] args) {

        System.out.println( isOdd(100) );
        System.out.println( isEven(100) );

    }


    public static boolean isOdd(int number){

        if(number%2 != 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }

}

/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false


2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false

 */