import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Lru{
    // maxLimit 5
    /*
        get, put
       1 5,2 3,3 1,4 3,5 2,

    */
    PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return hm.get(o1) - hm.get(o2);
        }
    });
    public int get(int key){

            if(hm.containsKey(key)){

            }


            hm.put(key, hm.getOrDefault(key, 0)+1);

            return key;
    }

    HashMap<Integer, Integer> hm = new HashMap<>();
    public void put(int val){



    }




}
