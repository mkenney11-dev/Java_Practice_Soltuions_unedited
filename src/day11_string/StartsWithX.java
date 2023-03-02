package day11_string;

public class StartsWithX {

    public static void main(String[] args) {

        String str = "xcodex";

        if(str.charAt(0)=='x'){
            str=str.replaceFirst("x", "a");
        }

        System.out.println(str);

    }

}
/*
reate a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */