package Design;
import java.util.*;
public class LFUCacheImpl {
    static class LFUCache {

        Queue<Integer> rcu = new LinkedList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int capacity = 0;
        TreeMap<Integer, Integer> tm = new TreeMap<>(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(o1 >= o2){
                    return o2 - o1;
                }else {
                    return o1-o2;
                }
            }
        });
        public LFUCache(int capacity) {
            this.capacity = capacity;

        }

        public int get(int key) {
            if(tm.containsKey(key)){
                return tm.get(key);
            }
            else{
                return -1;
            }
        }

        public void put(int key, int value) {
            if(hm.size() == this.capacity){

            }else{

            }
        }
    }

    public static void main(String[] args) {

    }
}
