package Graphs;
import java.util.*;

public class SubTreeSameLabel {
    static int[] res;
    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        res =  new int[n];
        Arrays.fill(res,1);
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for(int i = 0;i<edges.length;i++){
            adj.computeIfAbsent(edges[i][0], value -> new ArrayList<Integer>()).add(edges[i][1]);
        }
        adj.computeIfAbsent(-1, value -> new ArrayList<Integer>()).add(0);
        HashMap<Character, Integer> hm = new HashMap<>();
        keepCount(0,-1, adj, labels, hm);
        if(hm.containsKey(labels.charAt(0))){
            res[0]+=hm.get(labels.charAt(0));
        }
        return res;
    }

    public static void keepCount(int node, int parent, Map<Integer,List<Integer>> adj, String labels,HashMap<Character, Integer> hm){

        if(!adj.containsKey(node)){
            res[node] = 1;
            hm.put(labels.charAt(node),hm.getOrDefault(labels.charAt(node),0)+1);
            return;
        }
        for(int child: adj.get(node)){
            HashMap<Character,Integer> hm2 = new HashMap<Character, Integer>();

            keepCount(child, node, adj, labels, hm2);
            hm.put(labels.charAt(node),hm2.getOrDefault(labels.charAt(node),0)+1);
            if(hm2.containsKey(labels.charAt(node))){

                res[node]+=hm2.get(labels.charAt(node));
            }

        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] edges = new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        countSubTrees(n,edges,"abaedcd");
        for(int i =0;i< res.length;i++)
        System.out.print(res[i]+",");
    }
}
