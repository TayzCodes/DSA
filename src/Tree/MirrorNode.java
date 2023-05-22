package Tree;

import java.io.*;
import java.util.*;

// don't change the name of this class
// you can add inner classes if needed
class MirrorNode {
    public static void findMirrorNodes(int[] L, int[] Q, int[] R){
        Q[1] = 1;
        for(int i=1;i< L.length;i++){
            int node = i;
            int left = Q[node] == -1 ? -1: L[Q[node]];
            int right = Q[node] == -1 ? -1: R[Q[node]];
            if(L[node] != -1)Q[L[node]] = right;
            if(R[node] != -1)Q[R[node]] = left;
        }


    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int query = sc.nextInt();

        int[] L = new int[N+1];
        int[] R = new int[N+1];

        for(int i=1;i<= N; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();

        }
        int[] Q = new int[N+1];
        findMirrorNodes(L,Q,R);
        int[] queryList = new int[query];
        for(int i=0;i<query;i++) queryList[i] = sc.nextInt();

        for(int i=0;i<query;i++){
            System.out.println(Q[queryList[i]]);
        }
    }
}