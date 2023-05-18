package day42_maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Car {
    public static void main(String[] args) {
/*
4. Given the following maps that contains the different car informations:

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

 */
        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<Integer, Map<String, Object>> cars = new HashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);

        // 4.2 Display the brand-model-price of each car
        for(Map<String, Object> each : cars.values()){
            System.out.println(each.get("brand") + "-" + each.get("price") + "-" + each.get("price"));
        }

        //4.3 Display all the electric cars
        System.out.println();
        for(Map<String, Object> each : cars.values()){
            if((Boolean)each.get("electric")){
                System.out.println(each);
            }
        }

        // 4.4 Display the most expensive car
        System.out.println();
        int id = 1;
        for(Integer key : cars.keySet()){

            int eachPrice = (Integer)cars.get(key).get("price");
            int max = (Integer)cars.get(id).get("price");

            if(eachPrice > max){
               id = key;
            }
        }

        System.out.println(cars.get(id));
    }
}
