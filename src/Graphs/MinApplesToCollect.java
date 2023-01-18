package Graphs;
import java.util.*;

public class MinApplesToCollect {
    public static int ans = 0;
    public static HashMap<Integer, List<Integer>> tree = new HashMap<>();
    public static int totalApples = 0;
    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        // Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            tree.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            tree.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        //  int totalApples = 0;
        for(int i = 0;i< n;i++){
            if(hasApple.get(i)){
                totalApples++;
            }
        }
        if(totalApples == 0) return 0;
        boolean[] v = new boolean[n];
        int ans = dfsUtil(0,v, hasApple);
        return ans;

    }

    public static int dfsUtil(int v, boolean[] visited,List<Boolean> hasApple ){
        visited[v] = true;

        List<Integer> itrForV = tree.get(v);

        int childTime = 0;
        int totalTime = 0;
        if(totalApples > 0){
            for(int i = 0;i< itrForV.size();i++){
                int ver = itrForV.get(i);

                if (!visited[ver] && totalApples > 0){

                    childTime = dfsUtil(ver, visited, hasApple);

                    if(childTime > 0 || hasApple.get(ver)){
                        totalTime +=childTime+2;
                    }
                }

            }
        }

        return totalTime;
    }

    public static void main(String[] args) {
        int[][] edges = new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        List<Boolean> hasApple = new ArrayList<>(List.of(false,false,true,false,false,true,false));
        System.out.println(minTime(7,edges, hasApple ));
    }
}
