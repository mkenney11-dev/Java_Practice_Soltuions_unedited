package day28_encapsulation.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(
                new Candy("M&M", 60, 1.5, false),
                new Candy("M&M", 50, 0.5, false),
                new Candy("M&M", 40, 2.5, false),
                new Candy("M&M", 30, 3.5, false),
                new Candy("M&M", 20, 2.75, false)
        ));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+ " : "+candy.getPrice());
        }


    }
}
