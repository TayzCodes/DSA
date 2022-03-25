package Maps;

import java.util.*;

public class HashMapDemo {


    public static void main(String[] args){
        Car c1 = new Car("green");
        Car c2= new Car("red");
        Car c3 = new Car("blue");
        Car c4 = new Car("blue");

        Map<Car,Integer> carPrice = new HashMap<Car, Integer>();

        carPrice.put(c1, 10);
        carPrice.put(c2, 1);
        carPrice.put(c3, 5);
        carPrice.put(c4, 20);

        System.out.println(carPrice.size());


        for (Map.Entry<Car, Integer> entry : carPrice.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }


}
