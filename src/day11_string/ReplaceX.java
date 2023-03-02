package day11_string;

public class ReplaceX {

    public static void main(String[] args) {

        String str = "xcodeX";

        str = str.replace('x', 'a').replace('X', 'a');

        System.out.println(str);

    }

}
/*
3. Creat a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */