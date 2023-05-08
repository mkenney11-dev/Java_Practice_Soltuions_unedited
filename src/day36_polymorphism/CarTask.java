package day36_polymorphism;

import day34_abstraction.carTask.*;

import java.util.ArrayList;


public class CarTask {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };

        /*
        	        1.2 Write a program that can display all the cars that are eligible for recall
	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016
         */

        for (Car each : cars) {

            boolean honda = each instanceof Honda && (each.getYear() == 2010 || each.getYear() == 2011);
            boolean audi = each instanceof Audi && (each.getYear() >= 2015 && each.getYear() <= 2019);
            boolean tesla = each instanceof Tesla && (each.getYear() == 2015 || each.getYear() == 2016);

            if (honda || audi || tesla) {
                System.out.println(each);
            }

        }


        System.out.println("=======================================================");

        //			1.3 Write a program that can display the car that has the highest price
        //			1.3 Write a program that can display the car that has the lowest price

        Car highest = cars[0];
        Car lowest = cars[0];

        for (Car each : cars) {

            if (each.getPrice() > highest.getPrice()) {
                highest = each;
            }
            if (each.getPrice() < lowest.getPrice()) {
                lowest = each;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("=======================================================");

/*
			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car each : cars) {

            if (each instanceof Tesla) {
                teslaCars.add((Tesla) each);
            }
        }

        System.out.println(teslaCars);

    }

}
