package Maps;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args){
        Paper c1 = new Paper("green",4);
        Paper c2= new Paper("red",3);
        Paper c3 = new Paper("blue",6);
        Paper c4 = new Paper("blue",6);

        Map<Paper,Integer> PaperPrice = new TreeMap<Paper, Integer>();

        PaperPrice.put(c1, 10);
        PaperPrice.put(c2, 1);
        PaperPrice.put(c3, 5);
        PaperPrice.put(c4, 20);

        System.out.println(PaperPrice.size());


        for (Map.Entry<Paper, Integer> entry : PaperPrice.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

        ArrayList<Paper> paperList = new ArrayList<>();
        paperList.add(c1);
        paperList.add(c2);
        paperList.add(c3);
        paperList.add(c4);

        Collections.sort(paperList);

        for(int i = 0;i<paperList.size();i++){
            System.out.print(paperList.get(i)+" ");
        }

    }
}
