package Maps;

import Maps.Car;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args){
        Car c1 = new Car("green");
        Car c2= new Car("red");
        Car c3 = new Car("blue");
        Car c4 = new Car("blue");
        Car c5 = new Car("green");
        Map<Car,Integer> carPrice = new LinkedHashMap<Car, Integer>();

        carPrice.put(c4, 20);
        carPrice.put(c1, 10);
        carPrice.put(c2, 1);// red already in the map
        carPrice.put(c3, 5);
        carPrice.put(c5, 25);// red gets updated


        System.out.println(carPrice.size());


        for (Map.Entry<Car, Integer> entry : carPrice.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }
}

