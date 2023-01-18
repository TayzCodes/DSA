package Graphs;
import java.util.*;

/**
 * https://leetcode.com/problems/longest-path-with-different-adjacent-characters/description/
 */
public class LongestChainwithAdjChars {

    static int longestPath = 1;
    public static int longestPath(int[] parent, String s) {
        Map<Integer, List<Integer>> adj =  new HashMap<>();

        for(int i = 1;i<parent.length;i++){
            adj.computeIfAbsent(parent[i], value -> new ArrayList<Integer>()).add(i);

        }

        dfs(0, adj,s);
        return longestPath;
    }
    static int dfs(int node , Map<Integer, List<Integer>> adj, String s){
        if(!adj.containsKey(node)){

            return 1;
        }
        // System.out.println("NODE");
        int longestChain = 0, secondLongestChain = 0;
        for(int child: adj.get(node)){
            int longestPathChild = dfs(child, adj, s);
            if(s.charAt(child) == s.charAt(node)){
                continue;
            }
            if(longestPathChild > longestChain){
                secondLongestChain = longestChain;
                longestChain = longestPathChild;
            }else if(longestPathChild > secondLongestChain){
                secondLongestChain = longestPathChild;
            }

        }
        longestPath = Math.max(longestPath, longestChain+secondLongestChain+1);
        return longestChain+1;


    }

    public static void main(String[] args) {
        int[] parent = new int[]{-1};
        System.out.println(longestPath(parent,"w"));
    }
}
